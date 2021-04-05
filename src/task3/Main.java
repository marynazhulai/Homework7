package task3;

public class Main {
    public static void main(String[] args) {
        MyDevice tv = new MyDevice("LG");
        tv.on();
        tv.changeVolume(1.0);
        tv.changeVolume(2.0);
        tv.changeVolume(3.0);
        tv.off();
    }
}
