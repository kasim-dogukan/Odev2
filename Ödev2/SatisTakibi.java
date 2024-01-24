import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SatisTakibi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> satislar = new HashMap<>();

        while (true) {
            System.out.print("Müşteri adını girin (Çıkış için 'exit' yazın): ");
            String musteriAdi = scanner.next();

            if (musteriAdi.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Satış miktarını girin: ");
            double satisMiktari = scanner.nextDouble();

            satislar.put(musteriAdi, satislar.getOrDefault(musteriAdi, 0.0) + satisMiktari);
        }

        Map.Entry<String, Double> enCokSatan = satislar.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        if (enCokSatan != null) {
            System.out.println("En çok satış yapan müşteri: " + enCokSatan.getKey());
            System.out.println("Toplam satış miktarı: " + enCokSatan.getValue());
        } else {
            System.out.println("Herhangi bir satış yapılmamıştır.");
        }

        scanner.close();
    }
}
