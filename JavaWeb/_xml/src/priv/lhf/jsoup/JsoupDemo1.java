package priv.lhf.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * Jsoup入门
 */
public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //获取Document对象，根据xml文档获取

        //获取student.xml的path
        //String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        //解析xml文档，加载进内存，获取dom树 document
        Document document = Jsoup.parse(new File("D:\\JavaCodes\\JavaWeb\\_xml\\src\\priv\\lhf\\schema\\student.xml"), "utf-8");

        System.out.println(document);
        //获取元素对象
        Elements elements = document.getElementsByTag("name");

//        System.out.println(elements.size());

        Element element = elements.get(0);
        Element element2 = elements.get(1);
        String name = element.text();
        String name2 = element2.text();
        System.out.println(name);
        System.out.println(name2);
    }
}
