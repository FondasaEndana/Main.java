package View;

import Controller.Buku_Controller;
import Entity.entity_Buku;

import java.util.ArrayList;
import java.util.Scanner;

;

public class Halaman
{

        entity_Buku buku1 = new entity_Buku();
        public Buku_Controller buku = new Buku_Controller();
        ArrayList<Buku_Controller> databuku = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String name,borrow;
        int edit;
        int hapus;


    public void tambah(){
        System.out.println("ID Buku: ");
        System.out.print("Nama Buku: ");
        String nama = input.nextLine();
        System.out.print("Nama Peminjam: ");
        String peminjam = input.nextLine(); 
        System.out.print("Hari Peminjaman: ");
        String hari = input.nextLine();
        System.out.print("Hari Pengembalian: ");
        String back = input.nextLine();
        buku.tambah(nama, hari, peminjam, back);
        
        }

    public void tampilbuku(){
         for(int i = 0; i<buku.model_buku.getDataBuku().size(); i++){
            System.out.println("===========================");
            System.out.println("Nama Buku   : " +buku.model_buku.getDataBuku().get(i).getNamaBuku());
            System.out.println("Nama Peminjam: " +buku.model_buku.getDataBuku().get(i).getBorrow());
            System.out.println("Hari Peminjaman : "+buku.model_buku.getDataBuku().get(i).getPinjam());
            System.out.println("Hari Pengembalian : "+buku.model_buku.getDataBuku().get(i).getBack());
            System.out.println("===========================");
        }
    }

    public void hapusbuku(){
        System.out.print("Pilih Urutan Buku yang ingin dihapus: ");
        hapus = input.nextInt();
        for(int k = 1; k<databuku.size(); k++){
            databuku.remove(hapus);
            System.out.println();
        }
        System.out.println("Hapus buku telah berhasil");
    }

    public void editbuku(){
        System.out.print("Index Buku: ");
        int index = input.nextInt();
        input.nextLine();
        System.out.print("Nama Buku: ");
        String nama = input.nextLine();
        System.out.print("Nama Peminjam: ");
        String peminjam = input.nextLine(); 
        System.out.print("Hari Peminjaman: ");
        String hari = input.nextLine();
        System.out.print("Hari Pengembalian: ");
        String back = input.nextLine();
        buku.editbuku(index, nama, hari, peminjam, back);
   
    }
}
