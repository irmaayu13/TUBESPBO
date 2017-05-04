import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Chairul Anam Purba on 01/05/2017.
 */
public class Laporan {
    String no_laporan;
    String tgl_laporan;

    ArrayList<Produk> daftarProduk = new ArrayList<>();
    ArrayList<FakturBeli> daftarFaktur = new ArrayList<>();
    ArrayList<ReturBeli> daftarRetur = new ArrayList<>();
    ArrayList<Billing> daftarBill = new ArrayList<>();

    Makanan mkn;
    Minuman mi;
    Obat ob;
    Sembako sm;
    Billing bill;
    DetailFaktur df;
    ReturBeli rb;


    public void addProduk(Produk p) {
        //tambah produk ke array
        daftarProduk.add(p);
    }

    public Produk cariBarang(int idProduk) {
        return daftarProduk.get(idProduk);
    }


    public Laporan(String no_laporan,String tgl_laporan,Billing b, DetailFaktur df, ReturBeli rb) {
        this.no_laporan=no_laporan;
        this.tgl_laporan=tgl_laporan;
        this.bill=b;
        this.df=df;
        this.rb=rb;
    }

    public double totalFakturbeli() {
        double total=0;
        for (Produk p : daftarProduk){
            total = total +p.hitungJumlahProduk();
        }
        return total;
    }

    public double totalBeli(){
        double total=0;
        for (Produk p : daftarProduk){
            total = total +p.hargaBeli();
        }
        return total;
    }
    public double totalJual(){
        double total=0;
        for (Produk p : daftarProduk){
            total = total +p.hargaJual();
        }
        return total;
    }

    public double totalKeuntungan(){
        double total=0;
        for (Produk p : daftarProduk){
            total = total +p.hitungKeuntungan();
        }
        return total;
    }





    public void print() {
        System.out.println("No. Faktur Beli : "+no_laporan);
        System.out.println("Tanggal Masuk : "+tgl_laporan);
        for(FakturBeli f: daftarFaktur){
            f.print();
            System.out.println();
        }

        for(Produk produk : daftarProduk){
            produk.print();
            System.out.println();
        }
    }

    //keuntungan
    //kerugian cuma dari retur
    //berapa barang terjual

    public static void main(String[] Args){
        Makanan mk = new Makanan( 1, "Indomie","Mie Instan",2000,10,2300);
        Minuman mi = new Minuman(2, "Ultramilk","Susu",2000,10,2300);
        Sembako sm = new Sembako( 3, "Cap Ayam Jago","Beras",40000,10,55000);
        Obat ob = new Obat(4, "Oskadon","Sakit Kepala",2000,10,2300);
        DetailFaktur dfb = new DetailFaktur("F001", 12, "02-04-2017",mk,mi,ob,sm);
        Billing bill = new Billing("001", 001, "02-04-2017",mk,mi,ob,sm);


        dfb.addProduk(mk);
        dfb.addProduk(mi);
        dfb.addProduk(sm);
        dfb.addProduk(ob);
        dfb.print();
        dfb.cariBarang(1);
        System.out.println("");
        System.out.println("DETAIL FAKTUR BELI");
        System.out.println("Total Faktur :"+dfb.totalFakturbeli());
        System.out.println("Total Harga Produk dari Supplier :"+dfb.totalBeli());
        System.out.println("");

        System.out.println("KERUGIAN DARI RETUR");

        ReturBeli drb = new ReturBeli(1,"05-05-2017","Kadaluarsa",2,2,2,2,mk,mi,ob,sm);
        drb.addProduk(mk);
        drb.addProduk(mi);
        drb.addProduk(sm);
        drb.addProduk(ob);
        drb.print();
        drb.cariBarang(1);
        System.out.println("Total Retur :"+drb.totalReturbarang());
        System.out.println("Total Kerugian :"+drb.totalRugi());

        Laporan lp = new Laporan("L001","03-05-2017",bill,dfb,drb);

        System.out.println("");
        System.out.println("KEUNTUNGAN");
        System.out.println("Total keuntungan: "+lp.totalKeuntungan());


    }


}
