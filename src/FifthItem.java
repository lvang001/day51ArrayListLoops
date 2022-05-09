import java.util.*;

public class FifthItem {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<String>();
        System.out.println("Enter a string");
            while (true) {
                    
                    String input = s.nextLine();
                    items.add(input);
                    
                    if(input.isBlank()) {
                        System.out.println(items);
                        System.out.println("the fifth item is " + items.get(4));
                        break;
                    }              
            }    
    }
}
