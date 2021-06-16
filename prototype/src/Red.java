public class Red implements MyColor {
    public Object clone()
    {
        Red r = null;
        try
        {
            r = (Red)super.clone();
        }
        catch (CloneNotSupportedException e)
        {

        }
        return r;
    }
    public void display()
    {
        System.out.println("This is Red!");
    }
}
