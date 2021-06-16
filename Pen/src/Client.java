import javax.xml.bind.annotation.XmlAccessOrder;

public class Client {
    public static void main(String args[])
    {
        Color color;
        Pen pen;

        color = (Color) XMLUtilPen.getBean("color");
        pen = (Pen)XMLUtilPen.getBean("pen");
        pen.setColor(color);
        pen.draw("鲜花");
    }
}
