public class DogAdapter extends Dog implements Robot {
    public void cry()
    {
        System.out.println("机器人模仿：");
        super.wang();
    }

    @Override
    public void move() {
        System.out.println("机器人模仿：");
        super.run();
    }
}
