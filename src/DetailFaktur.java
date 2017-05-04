import java.util.ArrayList;

/**
 *Created by Toshiba
 */
public class DetailFaktur extends FakturBeli {
        String no_fakturbeli;
        int jumlah_fakturbeli;
        String tgl_masuk;
        ArrayList<Produk> daftarProduk = new ArrayList<>();

        Makanan mkn;
        Minuman mi;
        Obat ob;
        Sembako sm;

    public void addProduk(Produk p) {
        //tambah produk ke array
        daftarProduk.add(p);
    }

    public Produk cariBarang(int idProduk) {
        return daftarProduk.get(idProduk);
    }


    public DetailFaktur(String no_fakturbeli, int jumlah_fakturbeli, String tgl_masuk, Makanan mkn, Minuman mi, Obat ob, Sembako sm) {
        this.no_fakturbeli=no_fakturbeli;
        this.jumlah_fakturbeli=jumlah_fakturbeli;
        this.tgl_masuk=tgl_masuk;
        this.mkn=mkn;
        this.mi=mi;
        this.ob=ob;
        this.sm=sm;
    }
    @Override
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



        public void print() {
            for(Produk produk : daftarProduk){
                produk.print();
                System.out.println();
            }
            System.out.println("No. Faktur Beli : "+no_fakturbeli);
            System.out.println("Jumlah Faktur Beli : "+jumlah_fakturbeli);
            System.out.println("Tanggal Masuk : "+tgl_masuk);
        }
        public static void main(String[] Args){
            Makanan mk = new Makanan( 1, "Indomie","Mie Instan",2000,10,2300);
            Minuman mi = new Minuman(2, "Ultramilk","Susu",2000,10,2300);
            Sembako sm = new Sembako( 3, "Cap Ayam Jago","Beras",40000,10,55000);
            Obat ob = new Obat(4, "Oskadon","Sakit Kepala",2000,10,2300);

            DetailFaktur dfb = new DetailFaktur("F001", 12, "02-04-2017",mk,mi,ob,sm);
            dfb.addProduk(mk);
            dfb.addProduk(mi);
            dfb.addProduk(sm);
            dfb.addProduk(ob);
            dfb.print();
            dfb.cariBarang(1);
            System.out.println("Total Faktur :"+dfb.totalFakturbeli());
            System.out.println("Total Harga Produk dari Supplier :"+dfb.totalBeli());
        }
}
