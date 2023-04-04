package Ex2;

public enum Animals {
    DOG(10),
    CAT(7),
    TIGER(5),
    LION(3),
    MONKEY(1);

    private final int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal:  " + this.name().toLowerCase() + ", age = " + age + ".";
    }
}
