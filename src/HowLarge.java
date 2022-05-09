import java.util.*;

public class HowLarge {
    public static void main(String[] args) {
        Large();
    }

    public static void Large () {
        Scanner s = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<String>();

        System.out.println("Enter a string:");
        while(true) {
            
                String input = s.nextLine();
                items.add(input);

                if(input.isBlank()) {
                    System.out.println(items);
                    System.out.println("The amount of items in the list was " + items.size());
                    break;
                }           
        }
    }
}
