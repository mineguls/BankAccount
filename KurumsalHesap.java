// INHERITANCE: KurumsalHesap da Hesap sınıfından türetiliyor
public class KurumsalHesap extends Hesap {

    public KurumsalHesap(String kullaniciAdi, int hesapNo, int bakiye, String sifre) {
        super(kullaniciAdi, hesapNo, bakiye, sifre);
    }

    // POLYMORPHISM: Aynı metod ismi ama farklı uygulama - %5 bonus ekliyor
    @Override
    public void paraYatir(int miktar) {
        int bonus = (int) (miktar * 0.05); // Kurumsal hesaba özel %5 bonus
        setBakiye(getBakiye() + miktar + bonus);
        System.out.println("Kurumsal hesaba " + miktar + " TL yatırıldı (+%5 bonus).");
        bakiyeGoster();
    }

    @Override
    public void paraCek(int miktar) {
        if (getBakiye() < miktar) {
            System.out.println("Kurumsal hesapta yetersiz bakiye!");
        } else {
            setBakiye(getBakiye() - miktar);
            System.out.println("Kurumsal hesaptan " + miktar + " TL çekildi.");
            bakiyeGoster();
        }
    }
}