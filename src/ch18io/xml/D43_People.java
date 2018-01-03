package ch18io.xml;

import nu.xom.*;

import java.io.File;
import java.util.*;

/**
 * {Requires: nu.xom.Node; You must install the XOM library from
 * http://www.xom.nu } <br>
 * {RunFirst: Person}
 * 
 * <pre>
 * Output:
 * [Dr. Bunsen Honeydew, Gonzo The Great, Phillip J. Fry]
 * </pre>
 */
public class D43_People extends ArrayList<D44_Person> {
	public D43_People(String fileName) throws Exception {
		// 如果是字符串，会尝试访问网络获取XML文件
		// Document doc = new Builder().build(fileName);
		Document doc = new Builder().build(new File(fileName));
		Elements elements = doc.getRootElement().getChildElements();
		for (int i = 0; i < elements.size(); i++)
			add(new D44_Person(elements.get(i)));
	}

	public static void main(String[] args) throws Exception {
		D43_People p = new D43_People("People.xml");
		System.out.println(p);
	}
}