import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cityNames = Arrays.asList("Roma","Milano","Parigi");
        //cityNames.add("Londra");

        System.out.println(cityNames);

        cityNames.set(1,"Tegucigalpa");

        System.out.println(cityNames);

        List<String> kingsOfRome = new ArrayList<>(7);
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostillio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio Il Superbo");

        System.out.println(kingsOfRome);

        ArrayList<String> theKingsOfRomeArray = new ArrayList<String>();

        theKingsOfRomeArray.addAll(kingsOfRome);

        theKingsOfRomeArray.set(6," Lucius Tarquinius Supercar");

        System.out.println(theKingsOfRomeArray);
    }
}
