import java.util.ArrayList;
import java.util.List;

public class Main2 {
        public static void main(String[] args) {

                List<Device> devices = new ArrayList<>();

                devices.add(new Altres("Watch", "Apple", "Classic", 100, 0));
                devices.add(new Smartphone("Android", false, false, "Samsung", "Galaxy S23", 300, 0));
                devices.add(new Smartphone("iOs", true, true, "Apple", "15 Pro", 500, 0));
                devices.add(new Tablets(10, "Black Berry", "Play Book", 400, 0));
                devices.add(new Altres("Game Console", "Sonny", "Play Station", 250, 0));

                for (Device d : devices) {
                        if (d instanceof GammaAlta && ((GammaAlta) d).isGammaAlta()) {
                                System.out.println(d);
                                System.out.println("\n");
                        }
                }
        }
}