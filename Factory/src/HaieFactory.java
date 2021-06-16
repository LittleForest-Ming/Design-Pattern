public class HaieFactory implements Factroy{
    @Override
    public Fridge createFridge() {
        return new HaierFridge();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new HaierAirConditioner();
    }

    @Override
    public Fan createFan() {
        return new HaierFan();
    }
}
