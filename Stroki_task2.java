import java.util.Scanner;
import java.util.ArrayList;
public class Stroki_task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String str = in.nextLine();
        int count = 0;
        int countOfWords = 0;
        boolean f = false;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ' && f == false){
                countOfWords++;
            }
            if (str.charAt(i) != ' '){
                count++;
            } else {
                if (count == 3) {
                    numbers.add(countOfWords);
                }
                count = 0;
            }
            if(str.charAt(i) != ' '){
                f = true;
            } else {
                f = false;
            }
        }
        if (count == 3) {
            numbers.add(countOfWords);
        }
        if (numbers.size() > 0) {
            System.out.print("Номера слов: ");
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i) + ", ");
            }
        } else {
            System.out.println("Нет таких слов!");
        }
    }
}
