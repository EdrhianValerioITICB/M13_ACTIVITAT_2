
public class Tablets extends Device implements GammaAlta{
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
    
    @Override
    public boolean isGammaAlta(){
        if(this.finalPrice > 900){
            return true;
        }
        return false;



        
    }
}

























