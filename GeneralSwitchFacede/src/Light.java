public class Light {
    private String position;

    public Light(String position)
    {
        this.position=position;
    }
    public void on()
    {
        System.out.println(this.position+"灯打开");
    }
    public void off()
    {
        System.out.println(this.position+"灯关闭");
    }
}
