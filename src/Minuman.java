import java.util.HashMap;

/**
 * Created by Aspire on 27/04/2017.
 * Nida Hamidah 1403294
 */
public class Minuman extends Produk {
    int idProduk;
    String namaMinuman;
    String jenisMinuman;
    int stock;
    int hargabeli;
    int hargajual;
    int kuantitas;
    int totalproduk;

    private HashMap<Integer,Minuman> Minuman = new HashMap<>();


    public Minuman(int idProduk, String namaMinuman, String jenisMinuman, int hargabeli, int stock,int hargajual){
        this.idProduk = idProduk;
        this.namaMinuman = namaMinuman;
        this.jenisMinuman = jenisMinuman;
        this.stock = stock;
        this.hargabeli = hargabeli;
        this.hargajual = hargajual;
    }

    public Minuman(int idProduk, String namaMinuman, String jenisMinuman, int kuantitas,int hargajual){
        this.idProduk = idProduk;
        this.namaMinuman = namaMinuman;
        this.jenisMinuman = jenisMinuman;
        this.kuantitas = kuantitas;
        this.hargajual = hargajual;
        this.totalproduk = hargajual*kuantitas;
    }


    @Override
    public void print() {
        System.out.println("Nama Minuman: "+namaMinuman);
        System.out.println("Harga Beli: "+hargabeli);
        System.out.println("Harga Jual: "+hargajual);
        System.out.println("Stok: "+stock);
        System.out.println("Jumlah Keuntungan: "+hitungKeuntungan());
    }

    @Override
    public void printbill() {
        System.out.println("Nama Produk: "+namaMinuman);
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
    public double hargaBeli(){
        return hargabeli;
    }

    @Override
    public double hargaJual() {
        return hargajual;
    }

    public static void main(String[] args) {
        Minuman dataMinuman = new Minuman(1, "Ultramilk","Susu",2000,10,2300);
        dataMinuman.print();
    }

}
