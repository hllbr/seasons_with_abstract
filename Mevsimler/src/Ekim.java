
public class Ekim extends Sonbahar{
    private boolean mevsimsel_grip_tehlikesi;

    public Ekim(String ay_adı, String sorun,boolean mevsimsel_grip_tehlikesi) {
        super(ay_adı, sorun);
        this.mevsimsel_grip_tehlikesi = mevsimsel_grip_tehlikesi;
    }

    @Override
   public void problem() {
       if(mevsimsel_grip_tehlikesi == true){
           System.out.println("mevsimsel grip veya influenza riski yükseib bir ayıdır "+getAy_adı());
       }else{
           System.out.println("bir sıcak bir soğuk olur bu sebepten dolayı hava koşulları göz önunda bulundurularak elbise seçimi yapınız.");
       }
    }
    
}
