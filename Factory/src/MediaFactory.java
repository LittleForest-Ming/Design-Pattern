public class MediaFactory implements Factroy{
    @Override
    public Fridge createFridge() {
        return new MediaFridge();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new MediaAirConditioner();
    }

    @Override
    public Fan createFan() {
        return new MediaFan();
    }
}
