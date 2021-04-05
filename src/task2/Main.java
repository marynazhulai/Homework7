package task2;

public class Main {
    public static void main(String[] args) {
        KelvinConverter kelvinConverter = new KelvinConverter ();
        System.out.println(kelvinConverter.convert(5.0));

        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        System.out.println(fahrenheitConverter.convert(9.4));
    }
}
