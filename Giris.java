import java.util.Scanner;

// Giriş kontrolü için ayrı bir sınıf - Modüler yapı
public class Giris {
    // ENCAPSULATION: Hesap nesnesinin getter metodlarıyla güvenli veri erişimi
    public boolean login(Hesap hesap) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanıcı adı: ");
        String kullanici = sc.nextLine();

        System.out.print("Şifre: ");
        String sifre = sc.nextLine();

        // Hesap bilgileri private olduğu için getter metodlarıyla erişiliyor
        return kullanici.equals(hesap.getKullaniciAdi()) && sifre.equals(hesap.getSifre());
    }
}
