
public class Aralık extends Kıs{
     private String yagıs_turu = "yağmur";

    public Aralık(String ay_ismi, int gun,String yagıs_turu) {
        super(ay_ismi, gun);
        this.yagıs_turu = yagıs_turu; 
    }

    @Override
    public void ayın_sartları() {
        System.out.println(getAy_ismi()+" zor bir aydır ve "+yagıs_turu+" en çok bu ayda topraklarımıza düşer.");
        System.out.println("Elektrik faturasına dikkat etmeniz gerek çünkü "+getGun()+". günde  en çok elektrik tüketimi gerçekleşmiştir.");
        
    }
     
    
}
