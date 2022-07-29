public class Boat extends Vehicule {

    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    public String doStuff() {
        String message = "I am " + this.getBrand() + ", I navigated " + this.getKilometers()
                + " km and I go glug glug!";
        return message;
    }
}
