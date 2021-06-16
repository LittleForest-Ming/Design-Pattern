public class Blue implements MyColor {
    @Override
    public Object clone() {
        Blue b = null;
        try
        {
        b = (Blue)super.clone();
        }
        catch (CloneNotSupportedException e)
        {

        }
        return b;
    }

    @Override
    public void display() {
        System.out.println("This is Blue!");
    }
}
