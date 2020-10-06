import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemTracker {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            args = sc.nextLine().split(" ");
            if (args[0].equals("add")){
                items.add(args[1]);
            } else if (args[0].equals("remove")) {
                items.remove(args[1]);
            } else if (args[0].equals("display")){
                System.out.println(items.toString());
            } else {
                System.out.println("wrong command");
            }
        }
        sc.close();
    }

}