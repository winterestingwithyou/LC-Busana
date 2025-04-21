/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class DataPermakBusana {

    private static DataPermakBusana instance;

    private int idPelanggan;
    private int idPermakBusana;
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
    
    public int getIdPelanggan() { return idPelanggan; }
    public void setIdPelanggan(int idPelanggan) { this.idPelanggan = idPelanggan; }

    public int getIdPermakBusana() { return idPermakBusana; }
    public void setIdPermakBusana(int idPermakBusana) { this.idPermakBusana = idPermakBusana; }
    
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
        try (Connection conn = Koneksi.getConnection()) {
            conn.setAutoCommit(false);
            
            // 1. Simpan ke tabel pelanggan
            String sql = "INSERT INTO pelanggan (nama_lengkap, nomor_wa, email, alamat) VALUES (?, ?, ?, ?)";
            PreparedStatement psPelanggan = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            psPelanggan.setString(1, namaLengkap);
            psPelanggan.setString(2, nomorTelepon);
            psPelanggan.setString(3, alamatEmail);
            psPelanggan.setString(4, alamatPengiriman);
            psPelanggan.executeUpdate();

            //2. ambil id_pelanggan baru
            ResultSet rsPelanggan = psPelanggan.getGeneratedKeys();
            if (rsPelanggan.next()) {
                setIdPelanggan(rsPelanggan.getInt(1));
            }

            //3. Simpan ke tabel permak_busana
            String sqlPermak = "INSERT INTO pesanan_permak (id_pelanggan, jenis_busana, bahan, jumlah, jenis_permak, ukuran_sesudah, foto_pakaian, deskripsi_tambahan, tanggal_selesai, kisaran_biaya, metode_pembayaran) " +
                               "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement psPermak = conn.prepareStatement(sqlPermak);
            psPermak.setInt(1, idPelanggan);
            psPermak.setString(2, jenisPakaian);
            psPermak.setString(3, bahanPakaian);
            psPermak.setInt(4, jumlahPakaian);
            psPermak.setString(5, jenisPerbaikan);
            psPermak.setDouble(6, ukuranSetelahDiperbaiki);
            psPermak.setString(7, fotoPakaian); // Jika berupa path/URL
            psPermak.setString(8, deskripsiTambahan);
            psPermak.setDate(9, new java.sql.Date(tanggalPengambilan.getTime()));
            psPermak.setDouble(10, estimasiBiaya);
            psPermak.setString(11, metodePembayaran);
            psPermak.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan Data", "Terjadi Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
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
        String updatePermakQuery = """
            UPDATE pesanan_permak SET
                jenis_busana = ?, 
                bahan = ?, 
                jumlah = ?, 
                jenis_permak = ?, 
                ukuran_sesudah = ?, 
                foto_pakaian = ?, 
                deskripsi_tambahan = ?, 
                tanggal_selesai = ?, 
                kisaran_biaya = ?, 
                metode_pembayaran = ?
            WHERE id_permak = ?
        """;

        try (
            Connection conn = Koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement(updatePermakQuery)
        ) {
            stmt.setString(1, jenisPakaian);
            stmt.setString(2, bahanPakaian);
            stmt.setInt(3, jumlahPakaian);
            stmt.setString(4, jenisPerbaikan);
            stmt.setString(5, String.valueOf(ukuranSetelahDiperbaiki));
            stmt.setString(6, fotoPakaian);
            stmt.setString(7, deskripsiTambahan);
            stmt.setDate(8, new java.sql.Date(tanggalPengambilan.getTime()));
            stmt.setDouble(9, estimasiBiaya);
            stmt.setString(10, metodePembayaran);
            stmt.setInt(11, idPermakBusana);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                "Gagal memperbaru data permak busana",
                "Terjadi Kesalahan",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}