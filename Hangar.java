public class Hangar {
    public static void main(String[] args) {
        Car carPatrol = new Car("Audi", 280);
        Boat boatPatrol = new Boat("Riva", 3000);

        System.out.println(carPatrol.doStuff()); // I am Audi, I drove 280 km and I go zoom zoom zoom!
        System.out.println(boatPatrol.doStuff()); // I am Riva, I navigated 3000 km and I go glug glug!
    }

}
