/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Acer
 */
public class FileIO {
    /**
     * Menyimpan file ke folder tujuan, dengan ekstensi mengikuti file asal.
     *
     * @param folderTujuan     Folder target relatif dari direktori kerja, contoh: "attachments/profile"
     * @param namaFileTanpaExt Nama file tanpa ekstensi (contoh: "foto123")
     * @param pathAsal         Path lengkap file asal (contoh: "C:/Users/Aku/Desktop/gambar.png")
     */
    public static String simpanFile(String folderTujuan, String namaFileTanpaExt, String pathAsal) {
        File folder = new File(folderTujuan);

        // Buat folder jika belum ada
        if (!folder.exists()) {
            folder.mkdirs();
        }

        File fileAsal = new File(pathAsal);

        // Ambil ekstensi file asal
        String namaAsli = fileAsal.getName();
        String ekstensi = "";
        int titikIndex = namaAsli.lastIndexOf(".");
        if (titikIndex != -1 && titikIndex < namaAsli.length() - 1) {
            ekstensi = namaAsli.substring(titikIndex); // termasuk titik, misal ".png"
        }

        // Gabungkan nama file tujuan dengan ekstensi
        String namaFileTujuan = namaFileTanpaExt + ekstensi;
        File fileTujuan = new File(folder, namaFileTujuan);

        try (
            FileInputStream fis = new FileInputStream(fileAsal);
            FileOutputStream fos = new FileOutputStream(fileTujuan)
        ) {
            byte[] buffer = new byte[1024];
            int panjang;
            while ((panjang = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, panjang);
            }
            System.out.println("File berhasil disimpan ke: " + fileTujuan.getAbsolutePath());
            
            return namaFileTujuan;
        } catch (IOException e) {
            System.err.println("Gagal menyimpan file: " + e.getMessage());
            return null;
        }
    }
    
    /**
     * Menghapus file dengan nama yang cocok pola: namaFileTanpaExt.*
     *
     * @param folderTujuan       Folder tempat file disimpan, relatif terhadap direktori kerja
     * @param namaFileTanpaExt   Nama file tanpa ekstensi (misal: "gambar1")
     * @return true jika file ditemukan dan berhasil dihapus; false jika tidak ditemukan atau gagal menghapus
     */
    public static boolean hapusFile(String folderTujuan, String namaFileTanpaExt) {
        File folder = new File(folderTujuan);

        if (!folder.exists() || !folder.isDirectory()) {
            System.err.println("Folder tidak ditemukan: " + folderTujuan);
            return false;
        }

        // Cari file dengan nama awal yang cocok dan ekstensi apa pun
        File[] files = folder.listFiles((dir, name) ->
            name.startsWith(namaFileTanpaExt + ".")
        );

        if (files != null && files.length > 0) {
            File fileTarget = files[0]; // Ambil file pertama yang cocok
            boolean deleted = fileTarget.delete();

            if (deleted) {
                System.out.println("File berhasil dihapus: " + fileTarget.getAbsolutePath());
            } else {
                System.err.println("Gagal menghapus file: " + fileTarget.getAbsolutePath());
            }

            return deleted;
        } else {
            System.err.println("File dengan nama '" + namaFileTanpaExt + ".*' tidak ditemukan di folder: " + folderTujuan);
            return false;
        }
    }
}
