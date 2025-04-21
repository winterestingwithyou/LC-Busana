/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class DataPesanBusana {
    private static DataPesanBusana instance;
    
    private int idPelanggan;
    private int idPesananBusana;
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
    
    public int getIdPelanggan() { return idPelanggan; }
    public void setIdPelanggan(int idPelanggan) { this.idPelanggan = idPelanggan; }

    public int getIdPesananBusana() { return idPesananBusana; }
    public void setIdPesananBusana(int idPesananBusana) { this.idPesananBusana = idPesananBusana; }

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
        
    }

    public void update() {
        // Query untuk update data pelanggan
        String updatePelangganQuery = """
            UPDATE pelanggan SET 
                nama_lengkap = ?, 
                nomor_wa = ?, 
                email = ?, 
                alamat = ? 
            WHERE id_pelanggan = ?
        """;

        try (
            Connection conn = Koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement(updatePelangganQuery)
        ) {
            stmt.setString(1, namaLengkap);
            stmt.setString(2, nomorTelepon);
            stmt.setString(3, alamatEmail);
            stmt.setString(4, alamatPengiriman);
            stmt.setInt(5, idPelanggan);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                "Gagal memperbarui data pelanggan",
                "Terjadi Kesalahan",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Query untuk update data pesanan busana
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

        try (
            Connection conn = Koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement(updatePesananQuery)
        ) {
            stmt.setString(1, jenisBusana);
            stmt.setString(2, modelDesain);
            stmt.setString(3, warna);
            stmt.setString(4, bahan);
            stmt.setDouble(5, lingkarDada);
            stmt.setDouble(6, lingkarPinggang);
            stmt.setDouble(7, lingkarPinggul);
            stmt.setDouble(8, panjangLengan);
            stmt.setDouble(9, panjangBaju);
            stmt.setDouble(10, tinggiBadan);
            stmt.setDouble(11, lebarBahu);
            stmt.setString(12, aplikasiTambahan);
            stmt.setString(13, detailKhusus);
            stmt.setString(14, kebutuhanKhusus);
            stmt.setDate(15, new java.sql.Date(tanggalPemakaian.getTime()));
            stmt.setDouble(16, kisaranBudget);
            stmt.setString(17, metodePembayaran);
            stmt.setInt(18, idPesananBusana);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                "Gagal memperbarui data pesanan busana",
                "Terjadi Kesalahan",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
