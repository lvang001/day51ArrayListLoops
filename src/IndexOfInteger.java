import java.util.*;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter number");
        while (true) {

            int number = s.nextInt();
            list.add(number);

            if (number == 0) {
                System.out.println("Done entering integers into the list");
                System.out.println("what number are you looking for?");

                int numberTwo = Integer.valueOf(s.nextInt());

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).equals(numberTwo)) {
                        System.out.println(numberTwo + " index is at: " + i);
                    }
                }
                break;
            }
        }
    }
}
