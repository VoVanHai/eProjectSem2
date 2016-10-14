package tools.message;

import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author VoVanHai - https://vovanhai.wordpress.com/
 * @param <T> type của đối tượng cần convert, phải implements Serializable
 */
public class XMLConvert<T extends Serializable> {//

    private T type;

    public XMLConvert(T type) {
        this.type = type;
    }

    @SuppressWarnings("all")
    public T xml2Object(String xml) throws Exception {
        T sv ;
        JAXBContext ctx = JAXBContext.newInstance(type.getClass());
        Unmarshaller ms = ctx.createUnmarshaller();
        sv = (T) ms.unmarshal(new StringReader(xml));
        return sv;
    }

    public String object2XML(T obj) throws Exception {
        JAXBContext ctx = JAXBContext.newInstance(type.getClass());
        Marshaller ms = ctx.createMarshaller();
        StringWriter sw = new StringWriter();
        ms.marshal(obj, sw);
        return sw.toString();
    }

    /*public static void main(String[] args) throws Exception{
		Sinhvien sv=new Sinhvien(1001, "than thi det", new Date());
		
		XMLConvert<Sinhvien>xs=new XMLConvert<Sinhvien>(sv);
		String xml=xs.object2XML(sv);
		System.out.println(xml);
		
		Sinhvien ss=xs.xml2Object(xml);
		System.out.println(ss.getMssv()+"\t"+ss.getHoten());
		
		Person p=new Person(1001, "dsd", new Date());
		XMLConvert<Person>xs1=new XMLConvert<Person>(p);
	}*/
}
