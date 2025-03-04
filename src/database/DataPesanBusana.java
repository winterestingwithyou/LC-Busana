/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Acer
 */
public class DataPesanBusana {
    private static DataPesanBusana instance;
    private final List<List<Object>> historyData = new ArrayList<>();
    
    private String namaLengkap;
    private String nomorTelepon;
    private String alamatEmail;
    private String alamatPengiriman;
    private String jenisBusana;
    private String modelDesain; // Path atau URL file gambar
    private String warna;
    private String bahan;
    private double lingkarDada;
    private double lingkarPinggang;
    private double lingkarPinggul;
    private double panjangLengan;
    private double panjangBaju;
    private double tinggiBadan;
    private double lebarBahu;
    private String aplikasiTambahan;
    private String detailKhusus;
    private String kebutuhanKhusus;
    private Date tanggalPemakaian;
    private double kisaranBudget;
    private String metodePembayaran;

    private DataPesanBusana() {}

    public static DataPesanBusana getInstance() {
        if (instance == null) {
            instance = new DataPesanBusana();
        }
        return instance;
    }

    // Getter dan Setter
    public String getNamaLengkap() { return namaLengkap; }
    public void setNamaLengkap(String namaLengkap) { this.namaLengkap = namaLengkap; }

    public String getNomorTelepon() { return nomorTelepon; }
    public void setNomorTelepon(String nomorTelepon) { this.nomorTelepon = nomorTelepon; }

    public String getAlamatEmail() { return alamatEmail; }
    public void setAlamatEmail(String alamatEmail) { this.alamatEmail = alamatEmail; }

    public String getAlamatPengiriman() { return alamatPengiriman; }
    public void setAlamatPengiriman(String alamatPengiriman) { this.alamatPengiriman = alamatPengiriman; }

    public String getJenisBusana() { return jenisBusana; }
    public void setJenisBusana(String jenisBusana) { this.jenisBusana = jenisBusana; }

    public String getModelDesain() { return modelDesain; }
    public void setModelDesain(String modelDesain) { this.modelDesain = modelDesain; }

    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }

    public String getBahan() { return bahan; }
    public void setBahan(String bahan) { this.bahan = bahan; }

    public double getLingkarDada() { return lingkarDada; }
    public void setLingkarDada(double lingkarDada) { this.lingkarDada = lingkarDada; }

    public double getLingkarPinggang() { return lingkarPinggang; }
    public void setLingkarPinggang(double lingkarPinggang) { this.lingkarPinggang = lingkarPinggang; }

    public double getLingkarPinggul() { return lingkarPinggul; }
    public void setLingkarPinggul(double lingkarPinggul) { this.lingkarPinggul = lingkarPinggul; }

    public double getPanjangLengan() { return panjangLengan; }
    public void setPanjangLengan(double panjangLengan) { this.panjangLengan = panjangLengan; }

    public double getPanjangBaju() { return panjangBaju; }
    public void setPanjangBaju(double panjangBaju) { this.panjangBaju = panjangBaju; }

    public double getTinggiBadan() { return tinggiBadan; }
    public void setTinggiBadan(double tinggiBadan) { this.tinggiBadan = tinggiBadan; }

    public double getLebarBahu() { return lebarBahu; }
    public void setLebarBahu(double lebarBahu) { this.lebarBahu = lebarBahu; }

    public String getAplikasiTambahan() { return aplikasiTambahan; }
    public void setAplikasiTambahan(String aplikasiTambahan) { this.aplikasiTambahan = aplikasiTambahan; }

    public String getDetailKhusus() { return detailKhusus; }
    public void setDetailKhusus(String detailKhusus) { this.detailKhusus = detailKhusus; }

    public String getKebutuhanKhusus() { return kebutuhanKhusus; }
    public void setKebutuhanKhusus(String kebutuhanKhusus) { this.kebutuhanKhusus = kebutuhanKhusus; }

    public Date getTanggalPemakaian() { return tanggalPemakaian; }
    public void setTanggalPemakaian(Date tanggalPemakaian) { this.tanggalPemakaian = tanggalPemakaian; }

    public double getKisaranBudget() { return kisaranBudget; }
    public void setKisaranBudget(double kisaranBudget) { this.kisaranBudget = kisaranBudget; }

    public String getMetodePembayaran() { return metodePembayaran; }
    public void setMetodePembayaran(String metodePembayaran) { this.metodePembayaran = metodePembayaran; }
    
    public List<List<Object>> getHistoryData() {
        return historyData;
    }
    
    public void clear() {
        namaLengkap = null;
        nomorTelepon = null;
        alamatEmail = null;
        alamatPengiriman = null;
        jenisBusana = null;
        modelDesain = null;
        warna = null;
        bahan = null;
        lingkarDada = 0.0;
        lingkarPinggang = 0.0;
        lingkarPinggul = 0.0;
        panjangLengan = 0.0;
        panjangBaju = 0.0;
        tinggiBadan = 0.0;
        lebarBahu = 0.0;
        aplikasiTambahan = null;
        detailKhusus = null;
        kebutuhanKhusus = null;
        tanggalPemakaian = null;
        kisaranBudget = 0.0;
        metodePembayaran = null;
    }
    
    public void save() {
        List<Object> data = new ArrayList<>();
        data.add(namaLengkap);
        data.add(nomorTelepon);
        data.add(alamatEmail);
        data.add(alamatPengiriman);
        data.add(jenisBusana);
        data.add(modelDesain);
        data.add(warna);
        data.add(bahan);
        data.add(lingkarDada);
        data.add(lingkarPinggang);
        data.add(lingkarPinggul);
        data.add(panjangLengan);
        data.add(panjangBaju);
        data.add(tinggiBadan);
        data.add(lebarBahu);
        data.add(aplikasiTambahan);
        data.add(detailKhusus);
        data.add(kebutuhanKhusus);
        data.add(tanggalPemakaian);
        data.add(kisaranBudget);
        data.add(metodePembayaran);
        historyData.add(data);
    }
}
