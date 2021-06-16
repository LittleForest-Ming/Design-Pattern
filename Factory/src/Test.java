public class Test {
    public static void main(String args[]){
        Factroy factroy=new HaieFactory();
        AirConditioner airConditioner=factroy.createAirConditioner();
        Fan fan=factroy.createFan();
        Fridge fridge=factroy.createFridge();
        airConditioner.airConditionerInfo();
        fan.fanInfo();
        fridge.fridgeInfo();
    }
}
