package task2;

public class FahrenheitConverter implements Converter {
    @Override
    public double convert(double celsius) {
        double fahrenheit = (celsius*9/5) + 32;
        return fahrenheit;
    }
}
