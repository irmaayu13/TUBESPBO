import java.util.ArrayList;

/**
 * Created by Aspire on 27/04/2017.
 * Nida Hamidah 1403294
 */


public class Bill {
    String idbill;
    int idpetugas;
    int idproduk;
    int kuantitas;
    int hargaproduk;
    int totalbayar;
    String tgl_transaksi;
    Makanan mkn;
    Minuman mi;
    Obat ob;
    ProdukKebersihan pk;

    ArrayList<Produk> daftarProduk = new ArrayList<>();


    public Bill(String idbill,int idpetugas, String tgl_transaksi, Makanan mkn, Minuman mi, Obat ob, ProdukKebersihan pk) {
        this.idbill=idbill;
        this.tgl_transaksi=tgl_transaksi;
        this.idpetugas=idpetugas;
        this.mkn=mkn;
        this.mi=mi;
        this.ob=ob;
        this.pk=pk;
    }

    public void addProduk(Produk p) {
        daftarProduk.add(p);
    }

    public void print() {
        System.out.println("ID Struk: "+idbill);
        System.out.println("ID Petugas: "+idpetugas);
        for(Produk produk : daftarProduk){
            produk.printbill();
            totalbayar=totalbayar+produk.totalbayarproduk();
        }
        System.out.println("Total Pembayaran: "+totalbayar);
    }


    public static void main(String[] Args){
        Makanan mk = new Makanan( 1, "Indomie","Mie Instan",5,2300);
        Minuman mi = new Minuman(2, "Ultramilk","Susu",3,2300);
        ProdukKebersihan pk = new ProdukKebersihan( 3, "Cap Ayam Jago","Beras",1,55000);
        Obat ob = new Obat(4, "Oskadon","Sakit Kepala",1,2300);
        Bill bill = new Bill("001", 001, "02-04-2017",mk,mi,ob,pk);

        bill.addProduk(mk);
        bill.addProduk(mi);
        bill.addProduk(ob);
        bill.addProduk(pk);
        bill.print();

    }
}
