public class Smartphone {
    private String os;
    private boolean teAccelometre;
    private boolean teGPS;

    public Smartphone(String os) {
        this.os = os;
    }

    public Smartphone(String os, boolean teAccelometre, boolean teGPS) {
        this.os = os;
        this.teAccelometre = teAccelometre;
        this.teGPS = teGPS;
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
}