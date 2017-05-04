import java.util.HashMap;

/**
 * Created by Jordhi on 4/12/2017.
 */
public class Petugas {
    int idPetugas;
    String namaPetugas;
    String jabatan;
    String jenisKelamin;
    String namaAkun;
    String password;

    public Petugas (int idPetugas, String namaPetugas, String jabatan, String jenisKelamin, String namaAkun, String password){
        this.idPetugas = idPetugas;
        this.namaPetugas = namaPetugas;
        this.jabatan = jabatan;
        this.jenisKelamin = jenisKelamin;
        this.namaAkun = namaAkun;
        this.password = password;
    }

    private HashMap<Integer,Petugas> Petugas = new HashMap<>();

    public void register(Petugas pt) {
        Petugas.put(pt.idPetugas,pt);
    }

    public Petugas cariAkun(int idPetugas) {
        return Petugas.get(idPetugas);
    }

    public void print() {
        System.out.println("Nama Petugas:"+namaPetugas);
        System.out.println("Jabatan:"+jabatan);
        System.out.println("Jenis Kelamin:"+jenisKelamin);
    }

    public void daftar(){
        Petugas pt;

        pt = new Petugas( 1, "Jordhi","BOS BESAR","Pria","jordhi","kecoa" );
        register(pt);
        pt = new Petugas( 2, "Rima","Sekertaris Pribadi","Wanita","rima","kucing" );
        register(pt);
    }

    public static void main(String[] args) {
        Petugas userLogin = new Petugas(1, "null","null","null","null","null");
        userLogin.daftar();
        Petugas pt = userLogin.cariAkun(2);
        pt.print();
    }

}
