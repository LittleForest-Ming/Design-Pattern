import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtilPen {
    //该方法用于从XMl配置文件中提取具体类名，返回一个实例对象
    public static Object getBean(String args)
    {
        try {
            //创建文档文件
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();//获取 DocumentBuilderFactory 的新实例
            DocumentBuilder builder = dFactory.newDocumentBuilder();//使用当前配置的参数创建一个新的 DocumentBuilder 实例
            Document doc;
            doc = builder.parse(new File("configPen.xml"));
            NodeList nl = null;
            Node classNode = null;
            String cName = null;
            nl = doc.getElementsByTagName("className");
            if(args.equals("color"))
            {
                classNode = nl.item(0).getFirstChild();
            }
            else if(args.equals("pen"))
            {
                //获取包含类名的文本节点
                classNode = nl.item(1).getFirstChild();
            }
            cName = classNode.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
