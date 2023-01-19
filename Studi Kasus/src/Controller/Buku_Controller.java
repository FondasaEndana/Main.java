package Controller;

import Entity.entity_Buku;
import Model.Model_Buku;

import java.util.ArrayList;

public class Buku_Controller {
    
    public Buku_Controller(){

    }

    public int addBuku(String namaBuku, String namaPinjam, String hariPinjam, String hariKembali){
        entity_Buku buku = new entity_Buku(namaBuku, namaPinjam, hariPinjam, hariKembali);
        int status = Model_Buku.addBuku(buku);
        return status;
    }
    public Model_Buku model_buku = new Model_Buku();

    public ArrayList<entity_Buku> tampBuku(){
        return model_buku.getDataBuku();
    }

    public void tambah(String name, String borrow, String Pinjam, String back){
        entity_Buku buku = new entity_Buku();
        buku.setNamaBuku(name);
        buku.setBorrow(borrow);
        buku.setPinjam(Pinjam);
        buku.setBack(back);
        model_buku.tambah(buku);;
    }

    public int editbuku(int index, String name, String borrow, String Pinjam, String back){
        entity_Buku buku = new entity_Buku();
        buku.setNamaBuku(name);
        buku.setBorrow(borrow);
        buku.setPinjam(Pinjam);
        buku.setBack(back);
        model_buku.editbuku(index, buku);
        return index;
    }

    public int getIndexBuku(int idBuku){
        return Model_Buku.getIndexBuku(idBuku);
    }


    public void hapusbuku(int index){
        model_buku.hapusbuku(index);
    }
    
}
