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
public class DataPermakBusana {
    private static DataPermakBusana instance;
    private final List<List<Object>> historyData = new ArrayList<>();
    
    private String namaLengkap;
    private String nomorTelepon;
    private String alamatEmail;    
    private String alamatPengiriman;
    private String jenisPakaian;
    private String bahanPakaian;
    private int jumlahPakaian;
    private String jenisPerbaikan; // Bisa berupa daftar pilihan yang dipisahkan koma
    private double ukuranSetelahDiperbaiki;
    private String fotoPakaian; // Path atau URL file gambar
    private String deskripsiTambahan;
    private Date tanggalPengambilan;
    private double estimasiBiaya;
    private String metodePembayaran;

    private DataPermakBusana() {}

    public static DataPermakBusana getInstance() {
        if (instance == null) {
            instance = new DataPermakBusana();
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

    public String getJenisPakaian() { return jenisPakaian; }
    public void setJenisPakaian(String jenisPakaian) { this.jenisPakaian = jenisPakaian; }

    public String getBahanPakaian() { return bahanPakaian; }
    public void setBahanPakaian(String bahanPakaian) { this.bahanPakaian = bahanPakaian; }

    public int getJumlahPakaian() { return jumlahPakaian; }
    public void setJumlahPakaian(int jumlahPakaian) { this.jumlahPakaian = jumlahPakaian; }

    public String getJenisPerbaikan() { return jenisPerbaikan; }
    public void setJenisPerbaikan(String jenisPerbaikan) { this.jenisPerbaikan = jenisPerbaikan; }

    public double getUkuranSetelahDiperbaiki() { return ukuranSetelahDiperbaiki; }
    public void setUkuranSetelahDiperbaiki(double ukuranSetelahDiperbaiki) { this.ukuranSetelahDiperbaiki = ukuranSetelahDiperbaiki; }

    public String getFotoPakaian() { return fotoPakaian; }
    public void setFotoPakaian(String fotoPakaian) { this.fotoPakaian = fotoPakaian; }

    public String getDeskripsiTambahan() { return deskripsiTambahan; }
    public void setDeskripsiTambahan(String deskripsiTambahan) { this.deskripsiTambahan = deskripsiTambahan; }

    public Date getTanggalPengambilan() { return tanggalPengambilan; }
    public void setTanggalPengambilan(Date tanggalPengambilan) { this.tanggalPengambilan = tanggalPengambilan; }

    public double getEstimasiBiaya() { return estimasiBiaya; }
    public void setEstimasiBiaya(double estimasiBiaya) { this.estimasiBiaya = estimasiBiaya; }

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
        jenisPakaian = null;
        bahanPakaian = null;
        jumlahPakaian = 0;
        jenisPerbaikan = null;
        ukuranSetelahDiperbaiki = 0.0;
        fotoPakaian = null;
        deskripsiTambahan = null;
        tanggalPengambilan = null;
        estimasiBiaya = 0.0;
        metodePembayaran = null;
    }
    
    public void save() {
        List<Object> data = new ArrayList<>();
        data.add(namaLengkap);
        data.add(nomorTelepon);
        data.add(alamatEmail);
        data.add(alamatPengiriman);
        data.add(jenisPakaian);
        data.add(bahanPakaian);
        data.add(jumlahPakaian);
        data.add(jenisPerbaikan);
        data.add(ukuranSetelahDiperbaiki);
        data.add(fotoPakaian);
        data.add(deskripsiTambahan);
        data.add(tanggalPengambilan);
        data.add(estimasiBiaya);
        data.add(metodePembayaran);
        historyData.add(data);
    }
}