package Ex4;

public class Main {
    public static void main(String[] args) {
        Vehicles car = Vehicles.HONDA;
        System.out.println("Color: " + car.getColor());
        System.out.println(car);
        System.out.println("*******");
        car = Vehicles.BMW;
        System.out.println("Color: " + car.getColor());
        System.out.println(car);
        car = Vehicles.VW;
        System.out.println("Color: " + car.getColor());
        System.out.println(car);
    }
}
