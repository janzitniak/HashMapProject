import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Databaza spz
        // Do databazy priradime skratku okresu a nazov okresu
        // Chceme vyhladavat podla skratky okresu
        HashMap<String, String> spz = new HashMap<>();
        spz.put("BB", "Banská Bystrica");
        spz.put("BA", "Bratislava");
        spz.put("ZA", "Žilina");
        spz.put("ZA", "Bytča");

        System.out.println("Počet záznamov: " + spz.size());

        System.out.println("Nájdené mesto podľa skratky ZA: " + spz.get("ZA")); // vypise Zilina
        spz.remove("BB"); // Odstranenie hodnoty s klucom BB
        System.out.println("Nájdené mesto podľa skratky BB: " + spz.get("BB")); // problem, BB neexistuje, teda null

        System.out.println("Počet záznamov po VYMAZANÍ: " + spz.size());


        System.out.println("\nVšetky hodnoty (values), teda mestá");
        System.out.println("--------------------------");
        // Vypiseme vsetky hodnoty z HashMap-u spz
        for(String mesto: spz.values()) {
            System.out.println(mesto);
        }

        System.out.println("\nVšetky skratky (kľúče)");
        System.out.println("--------------------------");
        // Vypiseme vsetky "kluce" z HashMap-u spz
        for(String skratka: spz.keySet()) {
            System.out.println(skratka);
        }


        System.out.println("\nVšetky skratky (kľúče) a aj hodnoty");
        System.out.println("--------------------------");
        // Vypiseme aj kluce, aj hodnoty
        for (String skratka : spz.keySet()) {
            System.out.println("kľúč: " + skratka + ", hodnota: " + spz.get(skratka));
        }


    }
}
