import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OyuncuPuanlari {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Integer> oyuncuPuanlari = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            menuGoster();
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    oyuncuEkle();
                    break;
                case 2:
                    puanEkle();
                    break;
                case 3:
                    puanlariGoruntule();
                    break;
                case 4:
                    System.out.println("Programdan çıkılıyor...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçenek. Tekrar deneyin.");
            }
        }
    }

    private static void menuGoster() {
        System.out.println("1. Oyuncu Ekle");
        System.out.println("2. Puan Ekle");
        System.out.println("3. Puanları Görüntüle");
        System.out.println("4. Çıkış");
        System.out.print("Seçiminizi yapın: ");
    }

    private static void oyuncuEkle() {
        System.out.print("Oyuncu adını girin: ");
        String oyuncuAdi = scanner.next();

        if (!oyuncuPuanlari.containsKey(oyuncuAdi)) {
            oyuncuPuanlari.put(oyuncuAdi, 0);
            System.out.println(oyuncuAdi + " oyuncusu eklendi.\n");
        } else {
            System.out.println(oyuncuAdi + " oyuncusu zaten var. Tekrar deneyin.\n");
        }
    }

    private static void puanEkle() {
        System.out.print("Puan eklemek istediğiniz oyuncu adını girin: ");
        String oyuncuAdi = scanner.next();

        if (oyuncuPuanlari.containsKey(oyuncuAdi)) {
            System.out.print("Eklemek istediğiniz puanı girin: ");
            int eklenenPuan = scanner.nextInt();

            oyuncuPuanlari.merge(oyuncuAdi, eklenenPuan, Integer::sum);

            System.out.println(oyuncuAdi + " oyuncusuna " + eklenenPuan + " puan eklenmiştir.\n");
        } else {
            System.out.println(oyuncuAdi + " oyuncusu bulunamadı. Tekrar deneyin.\n");
        }
    }

    private static void puanlariGoruntule() {
        System.out.println("Oyuncu Puanları:");
        oyuncuPuanlari.forEach((oyuncu, puan) -> System.out.println(oyuncu + ": " + puan + " puan"));
        System.out.println();
    }
}
