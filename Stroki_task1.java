import java.util.Scanner;
public class Stroki_task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        boolean f = true;
        for (int i = 0; i < str.length(); i++){
            if(f == true && (str.charAt(i) == 'а' || str.charAt(i) == 'е' || str.charAt(i) == 'ё' || str.charAt(i) == 'и' || str.charAt(i) == 'у' || str.charAt(i) == 'о' || str.charAt(i) == 'ы' || str.charAt(i) == 'э' || str.charAt(i) == 'я' || str.charAt(i) == 'ю' || str.charAt(i) == 'А' || str.charAt(i) == 'О' || str.charAt(i) == 'У' || str.charAt(i) == 'Ы' || str.charAt(i) == 'Э' || str.charAt(i) == 'Ю' || str.charAt(i) == 'Я' || str.charAt(i) == 'Ё' || str.charAt(i) == 'И' || str.charAt(i) == 'Е')) {
                count++;
            }
            if(str.charAt(i) == ' '){
                f = true;
            } else {
                f = false;
            }
        }
        System.out.println(count);
    }
}
