package homework_nr_4;

public class TemperatureConverter {

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        int fahrenheit = 38;
        double celsiusFromFahrenheit = converter.toCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F = " + celsiusFromFahrenheit + "°C");

        int celsius = 88;
        double fahrenheitFromCelsius = converter.toFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheitFromCelsius + "°F");
    }

    public float toCelsius(int fahrenheit) {
        return (fahrenheit - 32f) * 5f / 9f;
    }

    public float toFahrenheit(int celsius) {
        return (celsius * 9f / 5f) + 32f;
    }
}