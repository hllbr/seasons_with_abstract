
public abstract class Ilkbahar {
    private String ay_ismi;
    private int sıknıtılı_gun ;

    public Ilkbahar(String ay_ismi, int sıknıtılı_gun) {
        this.ay_ismi = ay_ismi;
        this.sıknıtılı_gun = sıknıtılı_gun;
    }

    public String getAy_ismi() {
        return ay_ismi;
    }

    public void setAy_ismi(String ay_ismi) {
        this.ay_ismi = ay_ismi;
    }

    public int getSıknıtılı_gun() {
        return sıknıtılı_gun;
    }

    public void setSıknıtılı_gun(int sıknıtılı_gun) {
        this.sıknıtılı_gun = sıknıtılı_gun;
    }
    abstract void tavsiye();
}
