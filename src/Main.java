import java.util.Scanner;

public class Main {
    static void figure () {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz :");
        int n = inp.nextInt();

        int number1 = n;
        System.out.print("Çıktı :" +n+" ");

        for (int i=n; i>0;i-=5){
            number1-=5;
            System.out.print(number1+" ");
        }

        int number2 =number1;
        for (int i=number2;i<n;i+=5){
            number2+=5;
            System.out.print(number2+" ");

        }

    }
    public static void main(String[] args) {

        figure();
    }
}