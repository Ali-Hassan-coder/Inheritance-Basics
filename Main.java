//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Toyota","Supra",2023);
        vehicle.start();
        vehicle.displayinfo();
        vehicle.stop();
        System.out.println(" ");

        Car car = new Car("Hyundai","Gli",2022,2);
        car.start();
        car.honk();
        car.displayinfo();
        car.stop();
        System.out.println(" ");

        Truck truck = new Truck("Ford","F-15",2021,15.5);
        truck.start();
        truck.load();
        truck.displayinfo();
        truck.stop();
        System.out.println(" ");

        ElectricCar electricCar = new ElectricCar("Tesla","Model S",2020,12);
        electricCar.start();
        electricCar.charge();
        electricCar.displayinfo();
        electricCar.stop();
        System.out.println(" ");








    }


}