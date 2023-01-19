import java.util.Scanner;

import javax.swing.text.html.parser.Entity;

import Entity.entity_Buku;
import Login.LoginStaff;
import Model.Login_Model;
import View.Halaman;

import java.util.ArrayList;


    class menu {
        private int pil;
        Scanner input1 = new Scanner(System.in);
        Halaman objek1 = new Halaman();
        public void Menu()
        {
            int ul = 0;
            do {
                System.out.println("===========================");
                System.out.println("1. Tambah Buku ");
                System.out.println("2. Tampil Buku ");
                System.out.println("3. Hapus Buku");
                System.out.println("4. Edit Buku");
                System.out.print("pilih menu : ");
                pil=input1.nextInt();
                switch (pil) {
                    case 1 -> {
                        objek1.tambah();
                        System.out.print("ulang tekan 1 : ");
                        ul=input1.nextInt();
                    }
                    case 2 -> {
                        objek1.tampilbuku();
                        System.out.print("ulang tekan 1 : ");
                        ul=input1.nextInt();
                    }

                    case 3 -> {
                        objek1.hapusbuku();
                        System.out.println("ulang tekan 1 :");
                        ul=input1.nextInt();
                    }

                    case 4 -> {
                        objek1.editbuku();
                        System.out.println("ulang tekan 1");
                        ul=input1.nextInt();
                    }

                    default -> {
                    }
                }
            } while(ul==1);
        }
    }

    

public class Main {
    public static void main(String args[] ) {
        int n;
        Login_Model.initialUser();

        new Gui().setVisible(true);
        do {



            Scanner input = new Scanner(System.in);
            LoginStaff objek = new LoginStaff();
            objek.menu();
            Scanner input1 = new Scanner(System.in);
            menu objek1 = new menu();
            objek1.Menu();
            System.out.print("jika ingin mengulang tekan 1: ");
            n = input.nextInt();


        }
        while (n == 1);

   }
}
    









