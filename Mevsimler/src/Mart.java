
public class Mart extends Ilkbahar{
    private String yagıs_turu = "kar";

    public Mart(String ay_ismi, int sıknıtılı_gun,String yagıs_turu) {
        super(ay_ismi, sıknıtılı_gun);
    }

    public String getYagıs_turu() {
        return yagıs_turu;
    }

    public void setYagıs_turu(String yagıs_turu) {
        this.yagıs_turu = yagıs_turu;
    }

    @Override
    void tavsiye() {
        System.out.println(getAy_ismi()+" sıkıntılı bir aydır sebebi "+yagıs_turu +" yağışlarıdır.");
       
    }

}
