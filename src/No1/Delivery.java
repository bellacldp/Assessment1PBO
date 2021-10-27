package No1;
import java.util.Scanner;
public class Delivery {
    //Membuat atribut pada objek luar kelas delivery
    private int Notransaksi;
    private String Namapengirim;
    private String Alamatpengirim;
    private String Namapenerima;
    private String Alamatpenerima;
    private double Ongkir;
    private String Namaekspedisi;
    private String Noresi;
    private boolean Statusasuransi;
    private boolean Statusdropshipper;
    private double Nominalasuransi;

    //Asuransi dan Dropship
    //Konstruktor atau method dengan parameter
    Delivery(int Notransaksi, String Noresi, String Namaekspedisi, double Ongkir, String Namapengirim, String Alamatpengirim, String Namapenerima, String Alamatpenerima, boolean Statusdropshipper, boolean Statusasuransi, int Nominalasuransi){
        this.Notransaksi = Notransaksi;           //This berfungsi untuk menyatakan variable didalam class
        this.Noresi = Noresi;
        this.Namaekspedisi = Namaekspedisi;
        this.Ongkir = Ongkir;
        this.Namapengirim = Namapengirim;
        this.Alamatpengirim = Alamatpengirim;
        this.Namapenerima = Namapenerima;
        this.Alamatpenerima = Alamatpenerima;
        this.Statusdropshipper = Statusdropshipper;
        this.Statusasuransi = Statusasuransi;
        this.Nominalasuransi = Nominalasuransi;
        print(this.Statusasuransi, this.Statusdropshipper);      //Method untuk menampilkan/mencetak data Asuransi dan Dropship
    }

    //konstruktor Asuransi
    Delivery(int Notransaksi, String Noresi, String Namaekspedisi, double Ongkir, String Namapengirim, String Alamatpengirim, String Namapenerima, String Alamatpenerima, boolean Statusasuransi, int Nominalasuransi){
        this.Notransaksi = Notransaksi;
        this.Noresi = Noresi;
        this.Namaekspedisi = Namaekspedisi;
        if(Ongkir>20000){
            Ongkir = Ongkir - 5000;
        }
        this.Ongkir = Ongkir;
        this.Namapengirim = Namapengirim;
        this.Alamatpengirim = Alamatpengirim;
        this.Namapenerima = Namapenerima;
        this.Alamatpenerima = Alamatpenerima;
        this.Statusasuransi = Statusasuransi;
        this.Nominalasuransi = Nominalasuransi;
        print(this.Statusasuransi, this.Statusdropshipper);
    }

    //konstruktor Normal
    Delivery(int Notransaksi, String Noresi, String Namaekspedisi, double Ongkir, String Namapengirim, String Alamatpengirim, String Namapenerima, String Alamatpenerima){
        this.Notransaksi = Notransaksi;
        this.Noresi = Noresi;
        this.Namaekspedisi = Namaekspedisi;
        this.Ongkir = Ongkir;
        this.Namapengirim = Namapengirim;
        this.Alamatpengirim = Alamatpengirim;
        this.Namapenerima = Namapenerima;
        this.Alamatpenerima = Alamatpenerima;
        print(this.Statusasuransi, this.Statusdropshipper);
    }

    //konstruktor Dropship
    Delivery(int Notransaksi, String Noresi, String Namaekspedisi, double Ongkir, String Namapengirim, String Alamatpengirim, String Namapenerima, String Alamatpenerima, boolean Statusdropshipper){
        this.Notransaksi = Notransaksi; //
        this.Noresi = Noresi;
        this.Namaekspedisi = Namaekspedisi;
        this.Ongkir = Ongkir;
        this.Namapengirim = Namapengirim;
        this.Alamatpengirim = Alamatpengirim;
        this.Namapenerima = Namapenerima;
        this.Alamatpenerima = Alamatpenerima;
        this.Statusdropshipper = Statusdropshipper;
        print(this.Statusasuransi, this.Statusdropshipper);
    }
    //Method untuk menampilkan,mengubah,memasukkan
    public void print(boolean Statusasuransi, boolean Statusdropshipper){
        if (Statusasuransi==true && Statusdropshipper==true){
            System.out.println("\nAsuransi dan Dropship");
            System.out.println("\nNo Transaksi :"+this.Notransaksi+"\nNo Resi : "+this.Noresi+"\nNama Ekspedisi : "+this.Namaekspedisi+"\nOngkos Kirim : "+this.Ongkir+"\nNama Pengirim : "+this.Namapengirim+"\nAlamat Pengirim : "+this.Alamatpengirim+"\nNama Penerima : "+this.Namapenerima+"\nAlamat Penerima : "+this.Alamatpenerima+"\nNominal Asuransi : "+this.Nominalasuransi);
        }else if (Statusasuransi==true){
            System.out.println("\nAsuransi");
            System.out.println("\nNo Transaksi : "+this.Notransaksi+"\nNo Resi : "+this.Noresi+"\nNama Ekspedisi : "+this.Namaekspedisi+"\nOngkos Kirim : "+this.Ongkir+"\nNama Pengirim : "+this.Namapengirim+"\nAlamat Pengirim : "+this.Alamatpengirim+"\nNama Penerima : "+this.Namapenerima+"\nAlamat Penerima : "+this.Alamatpenerima+"\nNominal Asuransi : "+this.Nominalasuransi);
        }else if (Statusdropshipper==true){
            System.out.println("\nDropship");
            System.out.println("\nNo Transaksi : "+this.Notransaksi+"\nNo Resi : "+this.Noresi+"\nNama Ekspedisi : "+this.Namaekspedisi+"\nOngkos Kirim : "+this.Ongkir+"\nNama Pengirim : "+this.Namapengirim+"\nAlamat Pengirim : "+this.Alamatpengirim+"\nNama Penerima : "+this.Namapenerima+"\nAlamat Penerima : "+this.Alamatpenerima);
        }else {
            System.out.println("\nNormal");
            System.out.println("\nNo Transaksi : "+this.Notransaksi+"\nNo Resi : "+this.Noresi+"\nNama Ekspedisi : "+this.Namaekspedisi+"\nOngkos Kirim : "+this.Ongkir+"\nNama Pengirim : "+this.Namapengirim+"\nAlamat Pengirim : "+this.Alamatpengirim+"\nNama Penerima : "+this.Namapenerima+"\nAlamat Penerima : "+this.Alamatpenerima);
        }
    }
}
