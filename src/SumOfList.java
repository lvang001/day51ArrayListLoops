import java.util.*;

public class SumOfList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("enter number");
        
        while(true) {
            
            int number = s.nextInt();
            list.add(number);

            if(number == 0) {
                int sum = 0;
                for(int i = 0; i < list.size(); i++) {
                    sum = sum + list.get(i);
                }
                System.out.println("sum of all numbers is: " + sum);
                break;
            }

        }
        s.close();
    }
}
