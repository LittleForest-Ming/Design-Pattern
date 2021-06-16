public class AirPlane extends Changer {
    public AirPlane(Transform transform)
    {
        super(transform);
        System.out.println("变成飞机！");
    }
    public void fly()
    {
        System.out.println("在天空上飞翔！");
    }
}
