package Entity;

public class entity_Buku {
    private String namaBuku, Borrow, Pinjam, back;
    private int idBuku;

    
    public entity_Buku(String name, String borrow, String Pinjam, String back) {
        this.namaBuku = name;
        this.Borrow = borrow;
        this.Pinjam = Pinjam;
        this.back = back;
        this.idBuku = idBuku;
    }

    public entity_Buku(){   //overload

    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public String getNamaBuku() {
        return this.namaBuku;
    }

    public String getBorrow() {
        return this.Borrow;
    }

    public String getPinjam(){
        return this.Pinjam;
    }

    public String getBack(){
        return this.back;
    }

        public void setNamaBuku(String namabuku){
            this.namaBuku = namabuku;
        }

        public void setBorrow(String Borrow){
            this.Borrow = Borrow;
        }

        public void setPinjam(String Pinjam){
            this.Pinjam = Pinjam;
        }

        public void setBack(String back){
            this.back = back;
        }
    
}
