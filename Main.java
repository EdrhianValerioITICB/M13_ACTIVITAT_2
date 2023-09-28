
public class Main {

    public static void main(String[] args) {
        Device d2 = new Smartphone("Android", false, false,
                "Samsung", "Galaxy S22", 1000, 0);
        Device d3 = new Smartphone("iOs", true, true,
                "Apple", "iPhone14", 500, 0);
        Device d4 = new Tablets(10, "Microsoft", "Surface", 400, 0);

        System.out.println(d2);

        Device[] device = { d2, d3, d4 };
        for (Device d : device) {
            if (d instanceof GammaAlta && ((GammaAlta) d).isGammaAlta()) {
                System.out.println(d);
            }
        }

    }
}
