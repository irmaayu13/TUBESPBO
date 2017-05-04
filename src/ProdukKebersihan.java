import java.util.HashMap;

/**
 * Created by Chairul Anam Purba on 5/1/2017.
 */
public class ProdukKebersihan extends Produk {
    int idProduk;
    String namaProdukKebersihan;
    String jenisProdukKebersihan;
    int stock;
    int hargabeli;
    int hargajual;
    int kuantitas;
    int totalproduk;

    private HashMap<Integer,ProdukKebersihan> ProdukKebersihan = new HashMap<>();

//    public void addStock(ProdukKebersihan mk) {
//        ProdukKebersihan.put(mk.idProduk,mk);
//    }

    public ProdukKebersihan(int idProduk, String namaProdukKebersihan, String jenisProdukKebersihan, int hargabeli, int stock,int hargajual){
        this.idProduk = idProduk;
        this.namaProdukKebersihan = namaProdukKebersihan;
        this.jenisProdukKebersihan = jenisProdukKebersihan;
        this.stock = stock;
        this.hargabeli = hargabeli;
        this.hargajual = hargajual;
    }

    public ProdukKebersihan(int idProduk, String namaProdukKebersihan, String jenisProdukKebersihan, int kuantitas,int hargajual){
        this.idProduk = idProduk;
        this.namaProdukKebersihan = namaProdukKebersihan;
        this.jenisProdukKebersihan = jenisProdukKebersihan;
        this.kuantitas = kuantitas;
        this.hargajual = hargajual;
        this.totalproduk = hargajual*kuantitas;
    }

//    public ProdukKebersihan cariBarang(int idProduk) {
//        return ProdukKebersihan.get(idProduk);
//    }
    @Override
    public void printbill() {
        System.out.println("Nama Produk: "+namaProdukKebersihan);
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
        System.out.println("Nama ProdukKebersihan: "+namaProdukKebersihan);
        System.out.println("Harga Beli: "+hargabeli);
        System.out.println("Harga Jual: "+hargajual);
        System.out.println("Stok: "+stock);
        System.out.println("Jumlah Keuntungan: "+hitungKeuntungan());
//        System.out.println("Jumlah Harga Beli: "+hargaBeli());
//        System.out.println("Jumlah Harga Jual: "+hargaJual());
    }

//    public void inputProdukKebersihan(){
//        ProdukKebersihan mk;
//
//        mk = new ProdukKebersihan( 1, "Cap Ayam Jago","Beras",40000,10,55000);
//        addStock(mk);
//        mk = new ProdukKebersihan( 2, "Sania","Minyak",13500,20,14500);
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
        ProdukKebersihan dataProdukKebersihan = new ProdukKebersihan(1, "Cap Ayam Jago","Beras",40000,10,55000);
//        dataProdukKebersihan.inputProdukKebersihan();
        dataProdukKebersihan.print();
//        ProdukKebersihan pr = dataProdukKebersihan.cariBarang(2);
//        pr.print();
//        pr.);
    }
}