
public abstract class Yaz {
    private String ay;
    private int sıkıntılı_gun;

    public Yaz(String ay, int sıkıntılı_gun) {
        this.ay = ay;
        this.sıkıntılı_gun = sıkıntılı_gun;
    }

    public String getAy() {
        return ay;
    }

    public void setAy(String ay) {
        this.ay = ay;
    }

    public int getSıkıntılı_gun() {
        return sıkıntılı_gun;
    }

    public void setSıkıntılı_gun(int sıkıntılı_gun) {
        this.sıkıntılı_gun = sıkıntılı_gun;
    }
    abstract void sorunlar();
    
}
