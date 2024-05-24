public class Main {

    /*

    Method Overloading - >Aşırı Yükleme -> Bir Metodu birden farklı şekilde çağırma.
    metod ismi aynı kalacak, parametleri değiştirebilirsin.
     */

// Aşağıda 3 farklı sekilde étoplama fonksiyonu/metodu oluşturalım. Ve sonra çağıralım.

    public static void toplama ( int a,int b, int c) {


        System.out.println("Toplam: " + ( a + b + c));
    }

    public static void toplama ( int a, int b) {
        System.out.println("Toplam: " + ( a + b ));

    }

    public static void toplama ( String a, String b) {

        System.out.println(a + " " + b );
    }

    // Şimdi skorhesapla adı altında 3 farklı fonksiyon/method yapıldı. İstenilen parametreye göre çağır.

    public static void skorhesapla(String isim , int puan) {
        System.out.println(isim + "Adlı Oyuncunun Puanı: " + puan);


    }
    public static void skorhesapla ( int puan) {

        System.out.println("İsimsiz Oyuncunun Puanı: " + puan);
    }

    public static void skorhesapla (String isim) {

        System.out.println(isim+ "Adlı Oyuncunun Puanı Yoktur..");
    }

    public static void main (String [] args) {

        toplama(3,4,5);
        toplama(2,5);  // method overloading yapılmış. Aynı metod iki farklı şekilde oluşturulmuş.
        toplama("Eda","Ayaz");

        System.out.println("*************************");

        skorhesapla("Eda",1000);
        skorhesapla(1000);
        skorhesapla("Eda");



    }
}
