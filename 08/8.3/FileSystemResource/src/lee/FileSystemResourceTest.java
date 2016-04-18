package lee;

import org.springframework.core.io.FileSystemResource;
import org.dom4j.*;
import org.dom4j.io.*;
import java.util.*;

import java.util.*;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class FileSystemResourceTest
{
	public static void main(String[] args) throws Exception
	{
		// Ĭ�ϴ��ļ�ϵͳ�ĵ�ǰ·������book.xml��Դ
		FileSystemResource fr = new FileSystemResource("book.xml");
		// ��ȡ����Դ�ļ���Ϣ
		System.out.println(fr.getFilename());
		System.out.println(fr.getDescription());
		// ��������SAX��dom4j������
		SAXReader reader = new SAXReader();
		Document doc = reader.read(fr.getFile());
		// ��ȡ��Ԫ��
		Element el = doc.getRootElement();
		List l = el.elements();
		// ������Ԫ�ص�ȫ����Ԫ��
		for (Iterator it = l.iterator();it.hasNext() ; )
		{
			// ÿ���ڵ㶼��<��>�ڵ�
			Element book = (Element)it.next();
			List ll = book.elements();
			// ����<��>�ڵ��ȫ���ӽڵ�
			for (Iterator it2 = ll.iterator();it2.hasNext() ; )
			{
				Element eee = (Element)it2.next();
				System.out.println(eee.getText());
			}
		}
	}
}