
public class Tablets extends Device{
    private double polzades;
    
    public Tablets(double polzades, String brand, String model, double basePrice ,  double finalPrice) {
        super(brand, model, basePrice , finalPrice);
        this.polzades = polzades;
    }
   
    public double getPolzades() {
        return polzades;
    }
    
    public void setPolzades(double polzades) {
        this.polzades = polzades;
    }

    @Override
    public String toString() {
        return "Tablet{" + "polzades=" + polzades + '}' + super.toString();
    }
    
   
    
    


}

























