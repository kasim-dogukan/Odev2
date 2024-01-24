import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CiftSayiFiltreleme {
    public static void main(String[] args) {
        ArrayList<Integer> sayiListesi = new ArrayList<>();
        Set<Integer> ciftSayilar = new HashSet<>();
        ArrayList<Integer> tekSayilar = new ArrayList<>();

        // Rastgele 10 sayı ekleme
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            sayiListesi.add(random.nextInt(100));
        }

        System.out.println("Rastgele Sayı Listesi: " + sayiListesi);

        for (int sayi : sayiListesi) {
            if (sayi % 2 == 0) {
                ciftSayilar.add(sayi);
            } else {
                tekSayilar.add(sayi);
            }
        }

        System.out.println("Çift Sayılar: " + ciftSayilar);
        System.out.println("Tek Sayılar: " + tekSayilar);
    }
}
