package No2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShowroomJava {
    private static ArrayList<Mobil> arrMobil = new ArrayList<>();

    public static void main(String args []){
        Mobil mobil = new Mobil("YARIS 1.5 G M/T 3 Airbags", "2020", 248300000.0,5);
        tambahMobil(mobil);

        beliMobil("YARIS 1.5 G M/T 3 Airbags", "2020", 4);
        viewStock();
    }
    public static void tambahMobil(Mobil mobil){ arrMobil.add(mobil); }

    public static void beliMobil(String merk, String tahun, int jumlahBeli){
        System.out.println(
                "Showroom Mobil Jaya - Penjualan"+
                        "\nINPUT" +
                        "\nMerk :" + merk +
                        "\nTahun Keluaran :" + tahun +
                        "\nJumlah :" + jumlahBeli
        );

        arrMobil.forEach(mobil -> {
            if (merk.equalsIgnoreCase(mobil.getMerk())
                && tahun.equalsIgnoreCase(mobil.getTahunKeluaran())){
                mobil.setStock(mobil.getStock() - jumlahBeli);
                double diskon = 0.0, hargaDiskon = 0.0;

                DecimalFormat dcf = new DecimalFormat("0,0");

                String satuan = dcf.format(mobil.getHarga());
                String harga = dcf.format(mobil.getHarga() * jumlahBeli);

                System.out.println("\nOUTPUT" +
                        "Merek :" + mobil.getMerk()+ "\n" +
                        "Harga Satuan :" + satuan + "\n" +
                        "Tahun Keluaran :" + mobil.getTahunKeluaran() + "\n" +
                        "Jumlah Beli :" + jumlahBeli + "\n" +
                        "Total Harga :" + harga);

                if(jumlahBeli == 1){
                    diskon = 0.0;
                    hargaDiskon = mobil.getHarga();
                }

                if(jumlahBeli == 2){
                    diskon = 10.0;
                    hargaDiskon = mobil.getHarga() - (mobil.getHarga() * 0.1);
                    mobil.setHarga(hargaDiskon);
                }

                if(jumlahBeli > 2){
                    diskon = 20.0;
                    hargaDiskon = mobil.getHarga() - (mobil.getHarga() * 0.2);
                    mobil.setHarga(hargaDiskon);
                }
                String total = dcf.format(hargaDiskon);

                System.out.println(
                        "Diskon :" + diskon + " Persen " +
                                "\nTotal Diskon:" + mobil.getHarga() * (diskon /100)+
                                "\nTotal Bayar:" + total
                );
            } else System.out.println("\nOUTPUT\nMaaf, Jumlah Stok Tidak Mencukupi");
        });
    }
    public static void viewStock(){
        arrMobil.forEach(Mobil::displayDetail);
    }
}
