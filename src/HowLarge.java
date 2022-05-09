import java.util.*;

public class HowLarge {
    public static void main(String[] args) {
        Large();
    }

    public static void Large () {
              Scanner s = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<String>();
        
        
        while(true) {
            System.out.println("Enter a strings:");
                items.add(s.nextLine());

                if(s.nextLine().isEmpty()) {
                    System.out.println(items);
        
                System.out.println("The amount of items in the list was " + items.size());
                break;
                }
                
                
        }
    
    }
}
