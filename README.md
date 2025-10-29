💳 Banka Hesap Sistemi (Java)
Bu proje, nesne yönelimli programlama (OOP) ilkeleriyle tasarlanmış basit bir banka hesap simülasyonudur. Kullanıcı sisteme giriş yapar, hesap türü seçer ve terminal üzerinden para yatırma/çekme gibi işlemler gerçekleştirir.

🚀 Amaç
Java’da soyut sınıflar (abstract classes), kalıtım (inheritance) ve polimorfizm (polymorphism) kavramlarını uygulamalı göstermek.
Gerçek dünyadaki banka hesaplarını sınıflar ve metotlar aracılığıyla modellemek.
🧩 Proje Dosyaları
Dosya Adı	Açıklama
Main.java	Uygulamanın başlangıç noktası. Kullanıcı etkileşimi, menü ve akış kontrolü burada yapılır.
Hesap.java	Ortak alanları (kullanıcı adı, hesap no, bakiye, şifre) ve soyut metotları tanımlayan temel sınıf.
BireyselHesap.java	Standart bireysel kullanıcılar için basit hesap türü.
KurumsalHesap.java	Kurumsal müşteriler için %5 bonuslu para yatırma özelliği olan hesap türü.
Giris.java	Kullanıcı adı ve şifre doğrulamasını yapan giriş sınıfı.
⚙️ Çalışma Mantığı
Program başlatıldığında, iki hesap nesnesi oluşturulur:

BireyselHesap("Erdener", 1111, 1000, "1234")
KurumsalHesap("Fatih Ltd", 2222, 5000, "9999")
Kullanıcı, hangi hesapla işlem yapacağını seçer.

Giriş ekranında kullanıcı adı ve şifre istenir. Giris.login() metodu doğru bilgileri kontrol eder.

Giriş başarılı olursa, menü görüntülenir:

1. Bakiye Görüntüle
2. Para Yatır
3. Para Çek
4. Çıkış
Kullanıcı seçtiği işlemi yapar:

Para yatırma ve çekme işlemleri Hesap sınıfından türetilen alt sınıflardaki (BireyselHesap, KurumsalHesap) metotlar tarafından gerçekleştirilir.
Kurumsal hesaplarda yatırılan miktara otomatik olarak %5 bonus eklenir.
🧠 Kullanılan OOP Kavramları
Abstraction (Soyutlama): Hesap sınıfı soyut tanımlanarak yalnızca ortak özellikleri içerir. Alt sınıflar kendi işlem mantıklarını yazar.

Inheritance (Kalıtım): BireyselHesap ve KurumsalHesap, Hesap sınıfını miras alır.

Encapsulation (Kapsülleme): Değişkenler private tanımlanmış, erişim getter ve setter metodlarıyla kontrol edilir.

Polymorphism (Çok Biçimlilik): Hesap aktif değişkeni hem bireysel hem kurumsal hesapları temsil eder; hangi sınıfa aitse o sınıfın metotları çalışır.

💡 Örnek Çalışma
1 - Bireysel Hesap
2 - Kurumsal Hesap
Hesap türünü seçin: 2
Kullanıcı adı: Fatih Ltd
Şifre: 9999

--- Menü ---
1. Bakiye Görüntüle
2. Para Yatır
3. Para Çek
4. Çıkış
Miktar: 1000
Kurumsal hesaba 1000 TL yatırıldı (+%5 bonus).
Mevcut bakiyeniz: 6050 TL
🧰 Kullanım
Tüm .java dosyalarını aynı klasöre kaydedin.

Terminalde şu komutları çalıştırın:

javac *.java
java Main
Konsoldaki yönergeleri izleyin.

📘 Sonuç
Bu proje, nesne yönelimli programlama temellerini (soyutlama, kalıtım, kapsülleme, polimorfizm) uygulamalı olarak gösteren sade ama öğretici bir örnektir. İleride hesap türleri artırılarak (örneğin vadeli hesap, öğrenci hesabı) sistem genişletilebilir.
