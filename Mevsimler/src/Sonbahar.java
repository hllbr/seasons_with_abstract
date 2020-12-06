
public abstract class Sonbahar {
    private String ay_adı ;
    private String sorun;

    public Sonbahar(String ay_adı, String sorun) {
        this.ay_adı = ay_adı;
        this.sorun = sorun;
    }

    public String getAy_adı() {
        return ay_adı;
    }

    public void setAy_adı(String ay_adı) {
        this.ay_adı = ay_adı;
    }

    public String getSorun() {
        return sorun;
    }

    public void setSorun(String sorun) {
        this.sorun = sorun;
    }
    abstract void problem();
    
}
