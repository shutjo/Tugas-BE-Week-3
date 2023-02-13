import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // b. Buatlah masing masing dua variable untuk data type short, double, char, dan boolean
        short short1 = 1;
        short short2 = 2;
        double double1 = 1.1;
        double double2 = 1.2;
        char charA = 'A';
        char charB = 'B';
        boolean boolean0 = false;
        boolean boolean1 = true;

        // a. Buatlah program untuk input nama anda dan output kalimat "Selamat datang di bootcamp Kawah Edukasi, {namaAnda}"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama anda : ");
        String userInput = scanner.nextLine();
        System.out.println("Selamat datang di bootcamp Kawah Edukasi, nama saya " + userInput);

        /* c. Buatlah 3 variable string dengan value masing-masing, "Saya senang" "belajar" "Java Language",
         lalu gabungkan dan print hasilnya */

        String string1 = "Saya senang ";
        String string2 = "belajar ";
        String string3 = "Java Language";
        String result = string1 + string2 + string3;
        System.out.println(result);
    }
}