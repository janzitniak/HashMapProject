import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // databaza spz
        // do databazy priradime skratku okresu a nazov okresu
        // chceme vyhladavat podla skratky okresu
        HashMap<String, String> spz = new HashMap<String, String>();
        spz.put("BB", "Banská Bystrica");
        spz.put("BA", "Bratislava");
        spz.put("ZA", "Žilina");
        System.out.println(spz.get("ZA")); // vypise Zilina

        // vypiseme vsetky hodnoty z HashMap-u spz
        for(String mesto: spz.values()) {
            System.out.println(mesto);
        }

        // vypiseme vsetky "kluce" z HashMap-u spz
        for(String skratka: spz.keySet()) {
            System.out.println(skratka);
        }


        System.out.println("\n\n");


        HashMap<Integer, String> psc = new HashMap<Integer, String>();
        psc.put(97411, "Banská Bystrica");
        psc.put(05201, "Spišská Nová Ves");

        System.out.println(psc.get(05201));


    }
}
