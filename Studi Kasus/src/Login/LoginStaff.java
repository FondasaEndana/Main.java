package Login;
import java.util.Scanner;

public class LoginStaff {

        String namamahasiswa;
        String NPM;
        String sandi;
        String tanggal;

     public void menu() {
            Scanner nama = new Scanner(System.in);

            System.out.print("Masukan Nama Anda: ");
            namamahasiswa = nama.nextLine();

            System.out.print("Masukan NPM Anda: ");
            NPM = nama.nextLine();

            System.out.print("Masukan Kata Sandi: ");
            sandi = nama.nextLine();

        }

    
    }
