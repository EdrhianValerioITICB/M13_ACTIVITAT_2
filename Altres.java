
public class Altres extends Device {
    private String descripcio;

    public Altres(String descr, String brand, String model, double basePrice, double finalPrice) {
        super(brand, model, basePrice, finalPrice);
        descripcio = descr;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descr) {
        descripcio = descr;
    }

    @Override
    public String toString() {
        return "Altre{" + "descripcio=" + descripcio + '}' + super.toString();
    }

}
