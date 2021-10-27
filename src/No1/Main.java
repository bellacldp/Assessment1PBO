package No1;

public class Main {
    public static void main(String args[]){
        //Method untuk menampilkan,mengubah,memasukkan Data Asuransi dan Dropship
        Delivery brg1 = new Delivery(1, "N0001", "JNE", 21000, "Dropship1", "Surabaya", "Bejo", "DayeuhKolot", true, true, 40000);

        //Method untuk menampilkan,mengubah,memasukkan Data Asuransi
        Delivery brg2 = new Delivery(2, "N0003", "J&T", 21000, "Eiger", "Bandung Kopo", "Tini", "DayeuhKolot", true, 40000);

        //Method untuk menampilkan,mengubah,memasukkan Data Normal
        Delivery brg3 = new Delivery(3, "N0004", "Pos Indonesia", 23000, "Eiger", "Bandung Kopo", "Bambang","DayeuhKolot");

        //Method untuk menampilkan,mengubah,memasukkan Data Dropship
        Delivery brg4 = new Delivery(4, "N0002", "Si Cepat", 24000, "Dropship2", "Pontianak", "Joko","DayeuhKolot", true);
    }
}