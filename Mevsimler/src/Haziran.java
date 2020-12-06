
public class Haziran extends Yaz{
    private int sıcaklık;

    public Haziran(String ay, int sıkıntılı_gun,int sıcaklık) {
        super(ay, sıkıntılı_gun);
        this.sıcaklık = sıcaklık;
    }

    @Override
    void sorunlar() {
        System.out.println("Bulunduğunuz ay "+getAy()+" sıcıklığın en yüksek olduğu gün sizin verilenize göre ayın "+getSıkıntılı_gun()+" dır.");
    }
    
    
}
