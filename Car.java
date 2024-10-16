public class Car extends Vehicle{

    int numberofdoors; // TWo OR FOUR

    public Car(String make, String model, int year, int numberofdoors) {
        super(make, model, year);
        this.numberofdoors = numberofdoors;
    }

    public void honk(){
        System.out.println("HONKING");
    }

}
