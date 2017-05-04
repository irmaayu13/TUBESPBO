import java.util.HashMap;

/**
 * Created by Rima Yuliana on 5/1/2017.
 */
public class Makanan extends Produk {
    int idProduk;
    String namaMakanan;
    String jenisMakanan;
    int stock;
    int hargabeli;
    int hargajual;
    int kuantitas;
    int totalproduk;

    private HashMap<Integer,Makanan> Makanan = new HashMap<>();

//    public void addStock(Makanan mk) {
//        Makanan.put(mk.idProduk,mk);
//    }

    public Makanan(int idProduk, String namaMakanan, String jenisMakanan, int hargabeli, int stock,int hargajual){
        this.idProduk = idProduk;
        this.namaMakanan = namaMakanan;
        this.jenisMakanan = jenisMakanan;
        this.stock = stock;
        this.hargabeli = hargabeli;
        this.hargajual = hargajual;
    }

    public Makanan(int idProduk, String namaMakanan, String jenisMakanan, int kuantitas,int hargajual){
        this.idProduk = idProduk;
        this.namaMakanan = namaMakanan;
        this.jenisMakanan = jenisMakanan;
        this.kuantitas = kuantitas;
        this.hargajual = hargajual;
    }
    @Override
    public int totalbayarproduk(){
        this.totalproduk=hargajual*kuantitas;
        return totalproduk;
    }

    public Makanan cariBarang(int idProduk) {
        return Makanan.get(idProduk);
    }

    @Override
    public void print() {
        System.out.println("Nama Makanan: "+namaMakanan);
        System.out.println("Harga Beli: "+hargabeli);
        System.out.println("Harga Jual: "+hargajual);
        System.out.println("Stok: "+stock);
        System.out.println("Jumlah Keuntungan: "+hitungKeuntungan());
//        System.out.println("Jumlah Harga Beli: "+hargaBeli());
//        System.out.println("Jumlah Harga Jual: "+hargaJual());
    }

    @Override
    public void printbill() {
        System.out.println("Nama Makanan: "+namaMakanan);
        System.out.println("Harga Jual: "+hargajual);
        System.out.println("Kuantitas: "+kuantitas);
        System.out.println("Total Bayar Makanan: "+totalbayarproduk());
    }

//    public void inputMakanan(){
//        Makanan mk;
//
//        mk = new Makanan( 1, "Indomie","Mie Instan",2000,10,2300);
//        addStock(mk);
//        mk = new Makanan( 2, "Choco Pie","Coklat",3500,20,4500);
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
        Makanan dataMakanan = new Makanan(1, "Indomie","Mie Instan",2000,10,2300);
//        dataMakanan.inputMakanan();
        dataMakanan.print();
//        Makanan pr = dataMakanan.cariBarang(1);
//        pr.print();

    }
}
