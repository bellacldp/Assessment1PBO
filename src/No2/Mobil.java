package No2;

import java.text.DecimalFormat;
public class Mobil {
    private String merk;
    private String tahunKeluaran;
    private double harga;
    private int stock;

    public Mobil(String merk, String tahunKeluaran, double harga, int stock){
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.harga = harga;
        this.stock = stock;
    }
    public String getMerk(){ return  merk; }

    public String getTahunKeluaran(){ return tahunKeluaran; }

    public double getHarga(){ return harga; }

    public int getStock(){ return stock; }

    public void setStock(int stock){ this.stock = stock; }

    public void setHarga(double harga){ this.harga = harga; }

    public void displayDetail(){
        DecimalFormat dcf = new DecimalFormat("0.0");

        System.out.println("Informasi Mobil \n" +
                "Merek :" + getMerk() + "\n" +
                "Price :" + dcf.format(getHarga()) + "\n" +
                "Tahun Keluaran :" + getTahunKeluaran()+ "\n" +
                "\n Sisa Stock :" + getStock());
    }
}
