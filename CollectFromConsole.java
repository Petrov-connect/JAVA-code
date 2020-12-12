import java.util.*;
import java.util.stream.Collectors;

//created by J.M.
public class CollectFromConsole {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //split by one or more spaces :

        // if we do not know data type :
        Object[] objectArray= Arrays.stream(scan.nextLine().split("\\s+")).toArray();

        // if we know data type :
        //for [] :
        // int :
        int[] intArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        // String :
        String [] stringArray= (String[]) Arrays.stream(scan.nextLine().split("\\s+")).toArray();

        //for List :
        // Integer:
        List<Integer> listInteger= Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        //String:
        List<String> listString= Arrays.stream((scan.nextLine().split("\\s+")))
        .collect(Collectors.toList());

        //for map : key - name from console -> value =0;
        Map<String,Integer> mapInfo = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toMap(s -> s, s -> 0, (a, b) -> a, LinkedHashMap::new));

    }
}
