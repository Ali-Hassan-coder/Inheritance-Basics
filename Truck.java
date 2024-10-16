public class Truck extends Vehicle{

 double loadCapacity; // IN TONS

    public Truck(String make, String model, int year, double loadCapacity) {
        super(make, model, year);
        this.loadCapacity = loadCapacity;
    }
    public void load(){
        System.out.println("The Truck is being loaded.");
    }
}
