/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class DataPesanBusana {
    private static DataPesanBusana instance;
    
    private int idPelanggan;
    private int idPesananBusana;
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
    
    public int getIdPelanggan() { return idPelanggan; }
    public void setIdPelanggan(int idPelanggan) { this.idPelanggan = idPelanggan; }

    public int getIdPesananBusana() { return idPesananBusana; }
    public void setIdPesananBusana(int idPesananBusana) { this.idPesananBusana = idPesananBusana; }

    public void clear() {
        idPelanggan = 0;
        idPesananBusana = 0;
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
    
    public void save() throws SQLException {
        try (Connection conn = Koneksi.getConnection()) {
            //1. Simpan ke tabel pesan_busana
            String sqlPesanan = "INSERT INTO pesanan_busana (id_pelanggan, jenis_busana, gambar_model, warna, bahan, ukuran_lingkar_dada, ukuran_pinggang, ukuran_pinggul, panjang_lengan, panjang_busana, tinggi_badan, lebar_bahu, aplikasi_tambahan, detail_khusus, kebutuhan_khusus, tanggal_perkiraan_jadi, kisaran_budget, metode_pembayaran) " +
                               "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement psPesan = conn.prepareStatement(sqlPesanan, Statement.RETURN_GENERATED_KEYS);
            psPesan.setInt(1, idPelanggan);
            psPesan.setString(2, jenisBusana);
            psPesan.setString(3, modelDesain);
            psPesan.setString(4, warna);
            psPesan.setString(5, bahan);
            psPesan.setDouble(6, lingkarDada);
            psPesan.setDouble(7, lingkarPinggang); 
            psPesan.setDouble(8, lingkarPinggul);
            psPesan.setDouble(9, panjangLengan);
            psPesan.setDouble(10, panjangBaju); 
            psPesan.setDouble(11, tinggiBadan);
            psPesan.setDouble(12, lebarBahu);
            psPesan.setString(13, aplikasiTambahan); 
            psPesan.setString(14, detailKhusus);
            psPesan.setString(15, kebutuhanKhusus);
            psPesan.setDate(16, new java.sql.Date(tanggalPemakaian.getTime()));
            psPesan.setDouble(17, kisaranBudget);
            psPesan.setString(18, metodePembayaran);
            psPesan.executeUpdate();
            
            //Dapatkan Id
            try(ResultSet rs = psPesan.getGeneratedKeys()){
                if (rs.next()) {
                    setIdPesananBusana(rs.getInt(1));
                }
            }
        }
    }

    public void update() throws SQLException {
        String updatePesananQuery = """
            UPDATE pesanan_busana SET
                jenis_busana = ?, 
                gambar_model = ?, 
                warna = ?, 
                bahan = ?, 
                ukuran_lingkar_dada = ?, 
                ukuran_pinggang = ?, 
                ukuran_pinggul = ?, 
                panjang_lengan = ?, 
                panjang_busana = ?, 
                tinggi_badan = ?, 
                lebar_bahu = ?, 
                aplikasi_tambahan = ?, 
                detail_khusus = ?, 
                kebutuhan_khusus = ?, 
                tanggal_perkiraan_jadi = ?, 
                kisaran_budget = ?, 
                metode_pembayaran = ?
            WHERE id_pesanan = ?
        """;

        try (Connection conn = Koneksi.getConnection();
                PreparedStatement stmtPesanan = conn.prepareStatement(updatePesananQuery)) {
                stmtPesanan.setString(1, jenisBusana);
                stmtPesanan.setString(2, modelDesain);
                stmtPesanan.setString(3, warna);
                stmtPesanan.setString(4, bahan);
                stmtPesanan.setDouble(5, lingkarDada);
                stmtPesanan.setDouble(6, lingkarPinggang);
                stmtPesanan.setDouble(7, lingkarPinggul);
                stmtPesanan.setDouble(8, panjangLengan);
                stmtPesanan.setDouble(9, panjangBaju);
                stmtPesanan.setDouble(10, tinggiBadan);
                stmtPesanan.setDouble(11, lebarBahu);
                stmtPesanan.setString(12, aplikasiTambahan);
                stmtPesanan.setString(13, detailKhusus);
                stmtPesanan.setString(14, kebutuhanKhusus);
                stmtPesanan.setDate(15, new java.sql.Date(tanggalPemakaian.getTime()));
                stmtPesanan.setDouble(16, kisaranBudget);
                stmtPesanan.setString(17, metodePembayaran);
                stmtPesanan.setInt(18, idPesananBusana);
                stmtPesanan.executeUpdate();
        }
    }
    
    public void updateModelDesain() throws SQLException {
        String updatePesananQuery = """
            UPDATE pesanan_busana SET
                gambar_model = ? 
            WHERE id_pesanan = ?
        """;

        try (Connection conn = Koneksi.getConnection();
                PreparedStatement stmtPesanan = conn.prepareStatement(updatePesananQuery)) {
                stmtPesanan.setString(1, modelDesain);
                stmtPesanan.setInt(2, idPesananBusana);
                stmtPesanan.executeUpdate();
        }
    }
}
