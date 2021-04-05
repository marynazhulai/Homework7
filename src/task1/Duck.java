package task1;

public class Duck implements Flyable {
    String d;

    public Duck (String d) {
        this.d = d;
    }


    @Override
    public void fly() {
        System.out.println(d + " says: I can fly too");
    }
}
