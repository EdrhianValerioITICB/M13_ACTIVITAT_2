public class Device{
    String brand;
    String model;
    double basePrice;
    double finalPrice;

    public Device(String brand , String model , double basePrice , double finalPrice){
        this.brand = brand;
        this.model = model;
        this.basePrice = basePrice;
        this.finalPrice = finalPrice;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model = model;
    }

    public double getBasePrice(){
        return basePrice;
    }

    public void setBasePrice(double basePrice){
        this.basePrice = basePrice;
    }

    public double getFinalPrice(){
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice){
        this.finalPrice = finalPrice;
    }

    @Override
    public String toString(){
        return "Device {" + "brand = " + brand 
        + " , model = " + model + " , basePrice = " 
        + getBasePrice() + " , finalprice = " + getFinalPrice() + '}';
    }

}