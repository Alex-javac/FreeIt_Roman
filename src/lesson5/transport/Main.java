package lesson5.transport;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(158, 190, 1780, "Subaru", 4, 13.5, "wagon", 5);
        Truck truck = new Truck(500, 160, 12000, "MAN", 12, 29, 10000);
        Civilian plane = new Civilian(3000, 400, 45000, "boing647", 15, 1200, 50, true);
        Military warPlan = new Military(5000, 600, 10000, "Cy-26", 7, 500, true, 10);

        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(plane.toString());
        System.out.println(warPlan.toString());
        System.out.println("---------------------------------------------");
        car.countCarTime(7);
        car.countCarTime(14);
        System.out.println("---------------------------------------------");
        truck.loadTruck(7000);
        truck.loadTruck(10100);
        System.out.println("---------------------------------------------");
        plane.boarding(43);
        plane.boarding(53);
        System.out.println("---------------------------------------------");
        for (int i = 0; i < 12; i++) {
            warPlan.fire();
        }
        warPlan.bailout();
    }
}
