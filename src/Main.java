import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int san = scan.nextInt();
        if (san<=1)try {
            System.out.println(false);
        }catch(Exception a){
            System.out.println("San 1 den chon boluu kk! ");

        }System.out.println(method(san));



    } public static int method(int san ){
       int num = 1;
        for (int i = 1; i <= san; i++) {
            num *= i;
        }
        return  num;
    }
}