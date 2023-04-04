package Ex4;

public enum Vehicles {
    VW("Black", 30_000),
    HONDA("White", 40_000),
    BMW("Red", 50_000);

    private final String color;
    private final int price;
    Vehicles(String color, int price){
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehicles:  " + this.name() + ", color = '" + color + '\'' + ", price = " + price + ".";
    }
}
