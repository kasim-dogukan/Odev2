import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OgrenciNotTakipSistemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> ogrenciNotlari = new HashMap<>();

        while (true) {
            System.out.println("1. Öğrenci Ekle");
            System.out.println("2. Not Sorgula");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    ogrenciEkle(ogrenciNotlari, scanner);
                    break;
                case 2:
                    notSorgula(ogrenciNotlari, scanner);
                    break;
                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçenek. Tekrar deneyin.");
            }
        }
    }

    private static void ogrenciEkle(Map<String, Integer> ogrenciNotlari, Scanner scanner) {
        System.out.print("Öğrenci adını girin: ");
        String ogrenciAdi = scanner.next();

        System.out.print("Öğrenci notunu girin: ");
        int ogrenciNotu = scanner.nextInt();

        ogrenciNotlari.put(ogrenciAdi, ogrenciNotu);
        System.out.println(ogrenciAdi + " öğrencisi eklendi.\n");
    }

    private static void notSorgula(Map<String, Integer> ogrenciNotlari, Scanner scanner) {
        System.out.print("Sorgulamak istediğiniz öğrenci adını girin: ");
        String ogrenciAdi = scanner.next();

        Integer not = ogrenciNotlari.get(ogrenciAdi);

        if (not != null) {
            System.out.println(ogrenciAdi + " öğrencisinin notu: " + not + "\n");
        } else {
            System.out.println("Bu isimde bir öğrenci bulunamadı.\n");
        }
    }
}
