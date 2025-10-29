// ABSTRACTION: Abstract sınıf, genel şablon oluşturuyor
public abstract class Hesap {
    // ENCAPSULATION: Private değişkenler, dışarıdan doğrudan erişim engelleniyor
    private String kullaniciAdi;
    private int hesapNo;
    private int bakiye;
    private String sifre;

    // Constructor: Nesne oluşturulurken ilk değer atama
    public Hesap(String kullaniciAdi, int hesapNo, int bakiye, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.sifre = sifre;
    }

    // ABSTRACTION: Soyut metotlar - gövde yok, alt sınıflar kendine göre yazacak
    public abstract void paraYatir(int miktar);
    public abstract void paraCek(int miktar);

    // ENCAPSULATION: Getter metodları ile kontrollü okuma erişimi
    public String getKullaniciAdi() { return kullaniciAdi; }
    public int getHesapNo() { return hesapNo; }
    public int getBakiye() { return bakiye; }
    public String getSifre() { return sifre; }

    // ENCAPSULATION: Setter metodu ile kontrollü yazma erişimi
    public void setBakiye(int bakiye) { this.bakiye = bakiye; }

    // Ortak metot: Tüm hesap türleri bu metodu kullanabilir
    public void bakiyeGoster() {
        System.out.println("Mevcut bakiyeniz: " + bakiye + " TL");
    }
}