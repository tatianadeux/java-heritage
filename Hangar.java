public class Hangar {
    public static void main(String[] args) {
        Car carPatrol = new Car("Audi", 280);
        Boat boatPatrol = new Boat("Riva", 3000);

        System.out.println(carPatrol.doStuff());
        System.out.println(boatPatrol.doStuff());
    }

}
