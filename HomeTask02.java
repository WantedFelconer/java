
//HomeTask02
import java.util.Scanner;

public class HomeTask02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        for (int i = 0; i < text.length(); i++) {
            if ((int) text.charAt(i) == (int) 'a') {
                System.out.print((char) 122);
                continue;
            }

            if (((int) text.charAt(i) >= (int) 'a') && ((int) text.charAt(i) <= (int) 'z')) {
                char cur = text.charAt(i);
                int prev = (int) cur - 1;
                char word = (char) prev;
                System.out.print(word);
            }
        }
        sc.close();
    }
}