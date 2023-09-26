import java.util.Scanner;

public class PemilihanPercobaan202_2 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        String nilai_huruf;

        System.out.print("Nilai uas     : ");
        float uas = input02.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input02.nextFloat(); 
        System.out.print("Nilai kuis    : ");
        float kuis = input02.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input02.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai akhir = " + total + " Sehingga " + message);

        if (total>=80){
            nilai_huruf="A";
        }else if (total>73){
            nilai_huruf="B+";
        }else if (total>65){
            nilai_huruf="B";
        }else if (total>60){
            nilai_huruf="C+";
        }else if(total>50){
            nilai_huruf="C";
        }else if (total>39){
            nilai_huruf="D";
        }else {
            nilai_huruf="E";
        }
        System.out.println("kamu mendapatkan grading akhir yaitu : "+nilai_huruf);
    }
}