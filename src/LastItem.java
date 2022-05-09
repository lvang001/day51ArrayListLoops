import java.util.*;

public class LastItem {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<String>();

        System.out.println("Enter a strings:");
        while(true) {
      
                String input = s.nextLine();
                items.add(input);

                if(input.isBlank()) {
                    System.out.println(items);
                    System.out.println("The last item is " + items.get(items.size() - 1));
                    break;
                }


        }
     
    }
}