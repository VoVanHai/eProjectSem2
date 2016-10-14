package tools.message;

import java.util.Properties;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author VoVanHai - https://vovanhai.wordpress.com/
 */
public class MessageBroadcast {

    /**
     * gửi một thông điệp cho toàn thể nhân viên
     * @param url "tcp://localhost:61616"
     * @param message: message cần gửi
     * @throws Exception
     */
    public void broadcastMessage(String url, String message) throws Exception {
        //thiết lập môi trường cho JMS logging
        BasicConfigurator.configure();
        //thiết lập môi trường cho JJNDI
        Properties settings = new Properties();
        settings.setProperty(Context.INITIAL_CONTEXT_FACTORY,
                "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
        settings.setProperty(Context.PROVIDER_URL, url);
        //tạo context
        Context ctx = new InitialContext(settings);
        //lookup JMS connection factory
        Object obj = ctx.lookup("TopicConnectionFactory");
        ConnectionFactory factory = (ConnectionFactory) obj;
        //tạo connection
        Connection con = factory.createConnection();
        //nối đến MOM
        con.start();
        //tạo session
        Session session = con.createSession(
                /*transaction*/false,
                /*ACK*/ Session.AUTO_ACKNOWLEDGE
        );
        //tạo producer trên topic all - dành cho cả công ty
        Destination destination = (Destination) ctx.lookup("dynamicTopics/all");
        MessageProducer producer = session.createProducer(destination);
        //Tạo 1 message
        Message msg = session.createTextMessage(message);
        //gửi
        producer.send(msg);
        //shutdown connection
        session.close();
        con.close();
    }

}
