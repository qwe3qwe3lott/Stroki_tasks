import java.util.Scanner;
import java.util.ArrayList;
public class Stroki_task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList word = new ArrayList();
        ArrayList finalWord = new ArrayList();
        char[] c = in.nextLine().toCharArray();
        int count;
        for (int i = 0; i < c.length; i++) {
            System.out.println(word.size());
            System.out.println(finalWord.size());
            if (c[i] != ' ') {
                word.add(c[i]);
            } else {
                if(word.size() >= finalWord.size()) {
                    count = word.size() - finalWord.size();
                    for(int j = 0; j < finalWord.size(); j++){
                        finalWord.set(j, word.get(j));
                    }
                    for(int j = finalWord.size(); j < count; j++){
                        finalWord.add(word.get(j));
                    }
                }
                word.clear();
            }
        }
        for(int i = 0; i < finalWord.size(); i++) {
            System.out.print(finalWord.get(i));
        }
    }
}