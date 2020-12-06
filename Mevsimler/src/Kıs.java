
public abstract class Kıs {
    private String ay_ismi ;
    private int gun ;//riskli günler

    public Kıs(String ay_ismi, int gun) {
        this.ay_ismi = ay_ismi;
        this.gun = gun;
    }

    public String getAy_ismi() {
        return ay_ismi;
    }

    public void setAy_ismi(String ay_ismi) {
        this.ay_ismi = ay_ismi;
    }

    public int getGun() {
        return gun;
    }

    public void setGun(int gun) {
        this.gun = gun;
    }
    abstract void ayın_sartları();
    
}
