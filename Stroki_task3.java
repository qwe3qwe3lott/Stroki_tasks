import java.util.Scanner;
import java.util.ArrayList;
public class Stroki_task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        int countMax = 0;
        boolean f = false;
        Character[] word = new Character[100];
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '){
                word[count] = str.charAt(i);
                count++;
            } else {
                if (count ) {
                }
                count = 0;
            }
            if(str.charAt(i) != ' '){
                f = true;
            } else {
                f = false;
            }
        }
        //не дописанно
    }
}
