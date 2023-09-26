import java.util.Scanner;

public class IfKondisi02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan suhu :");
        int suhu = sc02.nextInt();

        if (suhu<16){
            System.out.println("Silahkan menggunakan jaket");
        }
        if (suhu<20){
            System.out.println("Silahkan menggunakan baju tebal");
        }
        else{
            System.out.println("Silahkan pakai topi");
        }
    }
}