public class Car extends Vehicule {

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        String message = "I am " + this.getBrand() + ", I drove " + this.getKilometers()
                + " km and I go zoom zoom zoom!";
        return message;
    }
}
