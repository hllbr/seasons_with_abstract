
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {


        System.out.println("Hangi ay hakkında bilgi almak istiyorsunuz\n"
                + "1)aralık\n"
                + "2)ekim\n"
                + "3)haziran\n"
                + "4)mart\n"
                + "çıkış için q'ya basınız.");
        Scanner scn = new Scanner(System.in);
      
        while (true) {            
        System.out.println("Yapmak istediğiniz işlemi seçiniz :");
        String secim = scn.nextLine();
        if(secim.equals("1")){
        Aralık aralık = new Aralık("Aralık", 28, "yağmur");
        aralık.ayın_sartları();
       
        }else if(secim.equals("2")){
            System.out.println("kronik bir rahatsızlığınız varmı");
            String cevap = scn.nextLine();
           
            if(cevap.equals("evet")){
                Ekim ekim = new Ekim("Ekim", "HASTALIK", true);
                ekim.problem();
                 
            }else if(cevap.equals("hayır")){
                 Ekim ekim1 = new Ekim("Ekim", "hava değişikliği", false);
                 ekim1.problem();
                  
            }else{
                System.out.println("Yanlış yada hatalı bir tuşlama yaptınız");
                
            }
            
        }else if(secim.equals("3")){   
            Haziran haziran = new Haziran("Haziran", 21, 58);
            haziran.sorunlar();
            
            
        }else if(secim.equals("4")){
            Mart mart = new Mart("Mart", 28, "Kar");
             mart.tavsiye();
            
        }else if(secim.equals("q")){
            System.out.println("ay bazlı mevsim programı sonlandırılıyor Lütfen bekleyiniz.");
            Thread.sleep(5500);
            System.out.println("İşlemler sonlandırıldı .");
            break;
        }
        }
    }
    
}
