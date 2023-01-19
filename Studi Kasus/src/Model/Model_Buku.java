package Model;

import Entity.entity_Buku;
import Array.Array;
import java.util.ArrayList;

public class Model_Buku implements Model_interface{

    ArrayList<entity_Buku> list = new ArrayList<>();

    public ArrayList<entity_Buku> getDataBuku(){
        return list;

    }

    public static int addBuku(entity_Buku buku){
        int status = -1;
        if (buku == null){
            status = 0;
        }
        else {
            Array.buku_entity.add(buku);
            status = 1;
        }
        return status;
    }

    private static Model_Buku Core;
    private static ArrayList<entity_Buku> bukuArrayList = Core.bukuArrayList;


    public static int getIndexBuku(int idBuku){
        int index = -1;
        if (bukuArrayList.isEmpty()){
            System.err.println("DATA KOSONG");
            System.out.println("");
        } else {
            for (entity_Buku buku : bukuArrayList){
                if (buku.getIdBuku()==idBuku){
                    index = bukuArrayList.indexOf(buku);
                }
            }

        }
        return index;
    }

    @Override
    public void tambah(Object x){
        list.add((entity_Buku)x);
    }
    @Override
    public void editbuku(int index, Object x) {
        list.set(index, (entity_Buku)x);
        
    }
    @Override
    public void hapusbuku(int index) {
        list.remove(index);
        
    }
    @Override
    public void tampilbuku() {
        
    }
}