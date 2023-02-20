import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }
    public static String getString(String s){
        Scanner scan = new Scanner(System.in);
        System.out.println(s + " : ");
        return scan.nextLine();
    }
}
