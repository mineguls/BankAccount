import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENCAPSULATION: Hesap sınıfları private değişkenlerle veri gizleme sağlıyor
        // POLYMORPHISM: Hesap tipinde referans, farklı alt sınıf nesneleri tutabiliyor
        Hesap bireysel = new BireyselHesap("Erdener", 1111, 1000, "1234");
        Hesap kurumsal = new KurumsalHesap("Fatih Ltd", 2222, 5000, "9999");

        System.out.println("1 - Bireysel Hesap");
        System.out.println("2 - Kurumsal Hesap");
        System.out.print("Hesap türünü seçin: ");
        int secim = sc.nextInt();
        sc.nextLine();

        // Ternary operator ile hesap seçimi
        Hesap aktif = (secim == 1) ? bireysel : kurumsal;

        // Giriş kontrolü için ayrı bir sınıf kullanımı
        Giris giris = new Giris();
        if (!giris.login(aktif)) {
            System.out.println("Giriş başarısız!");
            return;
        }

        // Ana menü döngüsü
        while (true) {
            System.out.println("\n--- Menü ---");
            System.out.println("1. Bakiye Görüntüle");
            System.out.println("2. Para Yatır");
            System.out.println("3. Para Çek");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");
            int islem = sc.nextInt();

            // POLYMORPHISM: aktif referansı hangi nesneyi tutuyorsa onun metodunu çağırıyor
            switch (islem) {
                case 1 -> aktif.bakiyeGoster();
                case 2 -> {
                    System.out.print("Miktar: ");
                    aktif.paraYatir(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Miktar: ");
                    aktif.paraCek(sc.nextInt());
                }
                case 4 -> {
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0);
                }
                default -> System.out.println("Geçersiz seçim!");
            }
        }
    }
}

