package task2;

public class KelvinConverter implements Converter {
    @Override
    public double convert(double celsius) {
        double kelvin = celsius + 273.15;
        return kelvin;
    }
}
