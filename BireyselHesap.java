// INHERITANCE: BireyselHesap, Hesap sınıfından türetiliyor
public class BireyselHesap extends Hesap {

    // Constructor: super ile üst sınıfın constructor'ı çağrılıyor
    public BireyselHesap(String kullaniciAdi, int hesapNo, int bakiye, String sifre) {
        super(kullaniciAdi, hesapNo, bakiye, sifre);
    }

    // POLYMORPHISM (Method Overriding): Üst sınıfın soyut metodu uygulanıyor
    @Override
    public void paraYatir(int miktar) {
        setBakiye(getBakiye() + miktar);
        System.out.println("Bireysel hesaba " + miktar + " TL yatırıldı.");
        bakiyeGoster();
    }

    // POLYMORPHISM (Method Overriding): Alt sınıfa özel çekme işlemi
    @Override
    public void paraCek(int miktar) {
        if (getBakiye() < miktar) {
            System.out.println("Yetersiz bakiye!");
        } else {
            setBakiye(getBakiye() - miktar);
            System.out.println("Bireysel hesaptan " + miktar + " TL çekildi.");
            bakiyeGoster();
        }
    }
}