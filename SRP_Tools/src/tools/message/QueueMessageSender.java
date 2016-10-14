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
public class QueueMessageSender {

    private Connection con;
    private Session session;
    private Context ctx;

    /**
     *
     * @param url: where MOM listen? ex: tcp://localhost:61616
     * @throws Exception
     */
    public QueueMessageSender(String url) throws Exception {
        //thiết lập môi trường cho JMS
        BasicConfigurator.configure();
        //thiết lập môi trường cho JJNDI
        Properties settings = new Properties();
        settings.setProperty(Context.INITIAL_CONTEXT_FACTORY,
                "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
        settings.setProperty(Context.PROVIDER_URL, url);
        //tạo context
        ctx = new InitialContext(settings);
        //lookup JMS connection factory
        Object obj = ctx.lookup("ConnectionFactory");
        ConnectionFactory factory = (ConnectionFactory) obj;
        //tạo connection
        con = factory.createConnection();
        //nối đến MOM
        con.start();
        //tạo session
        session = con.createSession(
                /*transaction*/false,
                /*ACK*/ Session.AUTO_ACKNOWLEDGE
        );
    }

    /**
     * Gửi một message đến MOM
     *
     * @param queueName là tên queue cần gửi đến. ex: "dynamicQueues/thanthidet"
     * @param message là message cần gửi
     * @throws Exception
     */
    public void sendMessage(String queueName, String message) throws Exception {

        Destination destination = (Destination) ctx.lookup(queueName);
        MessageProducer producer = session.createProducer(destination);
        //Tạo 1 message
        Message msg = session.createTextMessage(message);
        //gửi
        producer.send(msg);
    }

    public void close() throws Exception {
        if (session != null) {
            session.close();
        }
        if (con != null) {
            con.close();
        }
    }

}
