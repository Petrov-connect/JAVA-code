import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//created by J.M.

public class CollectFromConsole {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // split by one or more spaces if we know data type :
        // int [] :
        int[] intArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        // String []:
        String [] stringArray= scan.nextLine().split("\\s+");

        // List Integer:
        List<Integer> listInteger= Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        // List String:
        List<String> listString= Arrays.stream((scan.nextLine().split("\\s+")))
        .collect(Collectors.toList());

        //List Characters:
        String text=scan.nextLine();
        List<Character> charList= IntStream.range(0, text.length()).mapToObj(text::charAt).collect(Collectors.toList());

        //Stack or Queue:
        ArrayDeque<String> stackOrQueueName = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayDeque::new));

        //for map : key - name from console -> value =0;
        Map<String,Integer> mapInfo = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toMap(s -> s, s -> 0, (a, b) -> a, LinkedHashMap::new));

        //Object:
        Object[] objectArray= Arrays.stream(scan.nextLine().split("\\s+")).toArray();

    }
}
