import java.util.Scanner;

public class PemilihanPercobaan102_1 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        System.out.print("Masukkan umur: ");
        int umur = input02.nextInt();

        if (umur >60)
            System.out.println("umur "+umur+" pensiun");
        else
            System.out.println("umur "+umur+" belum pensiun");
    }
}