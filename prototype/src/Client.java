public class Client {
    public static void main (String args[])
    {
        PrototypeManager pm = new PrototypeManager();

        MyColor obj1 = (MyColor)pm.getColor("red");
        obj1.display();

        MyColor obj2 =(MyColor)pm.getColor("red");
        obj2.display();

        System.out.println(obj1==obj2);
    }
}
