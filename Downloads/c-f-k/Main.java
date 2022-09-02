public class Main {
    public static void main(String[] args) {
        Celcius cel = new Celcius(30);
        System.out.println(cel.getDegree() + " celcius = " + cel.convert(DegreeType.Kelvin) + " Kelvin");
        System.out.println(cel.getDegree() + " celcius = " + cel.convert(DegreeType.Celcius) + " Celcius");
        System.out.println(cel.getDegree() + " celcius = " + cel.convert(DegreeType.Fahrenheit) + " Fahrenheit");

    }
}
