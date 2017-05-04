import java.util.HashMap;

/**
 * Created by Chairul Anam Purba on 5/1/2017.
 */
public class Sabun extends Produk {
    int idProduk;
    String namaSabun;
    String jenisSabun;
    int stock;
    int hargabeli;
    int hargajual;
    int kuantitas;
    int totalproduk;

    private HashMap<Integer,Sabun> Sabun = new HashMap<>();

//    public void addStock(Sabun mk) {
//        Sabun.put(mk.idProduk,mk);
//    }

    public Sabun(int idProduk, String namaSabun, String jenisSabun, int hargabeli, int stock,int hargajual){
        this.idProduk = idProduk;
        this.namaSabun = namaSabun;
        this.jenisSabun = jenisSabun;
        this.stock = stock;
        this.hargabeli = hargabeli;
        this.hargajual = hargajual;
    }

    public Sabun(int idProduk, String namaSabun, String jenisSabun, int kuantitas,int hargajual){
        this.idProduk = idProduk;
        this.namaSabun = namaSabun;
        this.jenisSabun = jenisSabun;
        this.kuantitas = kuantitas;
        this.hargajual = hargajual;
        this.totalproduk = hargajual*kuantitas;
    }

//    public Sabun cariBarang(int idProduk) {
//        return Sabun.get(idProduk);
//    }
    @Override
    public void printbill() {
        System.out.println("Nama Produk: "+namaSabun);
        System.out.println("Harga Jual: "+hargajual);
        System.out.println("Kuantitas: "+kuantitas);
        System.out.println("Total Bayar Produk: "+totalproduk);
    }

    @Override
    public int totalbayarproduk() {
        this.totalproduk=hargajual*kuantitas;
        return totalproduk;
    }

    @Override
    public void print() {
        System.out.println("Nama Sabun: "+namaSabun);
        System.out.println("Harga Beli: "+hargabeli);
        System.out.println("Harga Jual: "+hargajual);
        System.out.println("Stok: "+stock);
        System.out.println("Jumlah Keuntungan: "+hitungKeuntungan());
//        System.out.println("Jumlah Harga Beli: "+hargaBeli());
//        System.out.println("Jumlah Harga Jual: "+hargaJual());
    }

//    public void inputSabun(){
//        Sabun mk;
//
//        mk = new Sabun( 1, "Cap Ayam Jago","Beras",40000,10,55000);
//        addStock(mk);
//        mk = new Sabun( 2, "Sania","Minyak",13500,20,14500);
//        addStock(mk);
//    }

    @Override
    public double hitungKeuntungan() {
        double untung=0;
        untung=(hargajual-hargabeli)*stock;
        return untung;
    }

    @Override
    public double hitungJumlahProduk() {
        return stock;
    }

    @Override
    public double hargaBeli() {
        return hargabeli;
    }

    @Override
    public double hargaJual() {
        return hargajual;
    }

    public static void main(String[] args) {
        Sabun dataSabun = new Sabun(1, "Cap Ayam Jago","Beras",40000,10,55000);
//        dataSabun.inputSabun();
        dataSabun.print();
//        Sabun pr = dataSabun.cariBarang(2);
//        pr.print();
//        pr.);
    }
}