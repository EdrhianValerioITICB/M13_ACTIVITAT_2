
public class Altres extends Dispositiu {
    private String descripcio;

    public Altres(String descr, String marca, String model, double preuBase) {
        super(marca, model, preuBase);
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
