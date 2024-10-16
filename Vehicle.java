public class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void start(){
        System.out.println("Vehicle Starts");
    }
    public void stop(){
        System.out.println("Vehicle stops");
    }
    public void displayinfo(){
        System.out.println(make+" " +model+" " +year);
    }
}
