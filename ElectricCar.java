public class ElectricCar extends Vehicle{
    int batteryLevel; // IN HOURS

    public ElectricCar(String make, String model, int year, int batteryLevel) {
        super(make, model, year);
        this.batteryLevel = batteryLevel;
    }

    public void charge(){
        System.out.println("The battery is being charged.");
    }
}
