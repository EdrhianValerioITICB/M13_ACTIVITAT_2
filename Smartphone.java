public class Smartphone extends Device implements GammaAlta {
    private String os;
    private boolean teAccelometre;
    private boolean teGPS;

    public Smartphone(String os, String brand, String model, double basePrice, double finalPrice) {
        super(brand, model, basePrice, finalPrice);
        this.os = os;
        this.teAccelometre = false;
        this.teGPS = true;

        if (this.teAccelometre) {
            if (this.teGPS) {
                finalPrice = finalPrice * 1.1 * 1.05;
            } else {
                finalPrice = finalPrice * 1.1;
            }
        }
    }

    public Smartphone(String os, boolean teAccelometre, boolean teGPS, String brand, String model, double basePrice,
            double finalPrice) {
        super(brand, model, basePrice, finalPrice);
        this.os = os;
        this.teAccelometre = teAccelometre;
        this.teGPS = teGPS;

        if (this.teAccelometre) {
            if (this.teGPS) {
                finalPrice = finalPrice * 1.1 * 1.05;
            } else {
                finalPrice = finalPrice * 1.1;
            }
        }
    }

    // GETTERS
    public String getOs() {
        return os;
    }

    public boolean getTeAccelometre() {
        return teAccelometre;
    }

    public boolean getTeGPS() {
        return teGPS;
    }

    // SETTERS
    public void setOs(String os) {
        this.os = os;
    }

    public void setTeAccelometre(boolean teAccelometre) {
        this.teAccelometre = teAccelometre;
    }

    public void setTeGPS(boolean teGPS) {
        this.teGPS = teGPS;
    }

    @Override
    public String toString() {
        return super.toString() + "Sistema Operatiu: " + os + ", té accelometre: " + teAccelometre + "té GPS: " + teGPS
                + ".";
    }

    @Override
    public boolean isGammaAlta() {
        if (this.finalPrice > 700) {
            return true;
        }
        return false;
    }
}