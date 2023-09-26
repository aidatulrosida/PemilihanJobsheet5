import java.util.Scanner;
public class LatihanIndividu202 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        String username, password;
        System.out.println("=================");
        System.out.println("======LOGIN======");
        
        System.out.print("Masukkan Username: ");
        username = input26.nextLine();
        System.out.print("Masukkan Password: ");
        password = input26.nextLine();

        if (username.equals("Satria Faza") && password.equals("kelompok5")) {
            System.out.println("Selamat, anda berhasil login");
        } else {
            System.out.println("Maaf, username atau password and salah.");
        }
    }
}