/**
 * Created by Irnanda on 4/12/2017.
 */
public class Supplier {
    int idSupplier;
    String namaSupplier;
    String alamat;
    String email;
    String noHP;

    public Supplier(int idSupplier, String namaSupplier, String alamat, String email, String noHP){
        this.idSupplier=idSupplier;
        this.namaSupplier=namaSupplier;
        this.alamat=alamat;
        this.email=email;
        this.noHP=noHP;
    }

    public void print(){

        System.out.println("Nama Supplier: "+namaSupplier);
        System.out.println("Alamat Supplier: "+alamat);
        System.out.println("Email Supplier: "+email);
        System.out.println("No. HP Supplier: "+noHP);
    }

    public static void main(String[] args){
        Supplier sp = new Supplier(1,"Indofood","Jalan mie instan","indofood@gmail.com","08987654321");
        sp.print();
    }

}
