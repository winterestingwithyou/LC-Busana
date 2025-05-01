/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.awt.Color;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author Acer
 */
public class FormatData {
    public static String sqlDateToTanggal(String mysqlDateStr) {
        String[] patterns = {"yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd"};
        for (String pattern : patterns) {
            try {
                SimpleDateFormat inputFormat = new SimpleDateFormat(pattern);
                inputFormat.setTimeZone(TimeZone.getTimeZone("Asia/Jakarta"));

                Date date = inputFormat.parse(mysqlDateStr);
                SimpleDateFormat outputFormat = new SimpleDateFormat("d MMMM yyyy", new Locale("id", "ID"));
                return outputFormat.format(date);
            } catch (ParseException ignored) {}
        }
        return "Format tanggal tidak valid";
    }

    
    public static String toCm(String value) {
        double number = Double.parseDouble(value);
        return String.format("%.1f cm", number);
    }
    
    public static String toRupiah(String amount) {
        double number = Double.parseDouble(amount);
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return rupiahFormat.format(number);
    }
    
    public static String colorToRGBString(Color color) {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        return String.format("RGB(%d, %d, %d)", r, g, b);
    }
    
    public static Color rgbStringToColor(String rgbString) {
        // Menghapus "RGB(" dan ")" lalu membagi berdasarkan koma
        rgbString = rgbString.replace("RGB(", "").replace(")", "");
        String[] parts = rgbString.split(",\\s*");

        if (parts.length != 3) {
            throw new IllegalArgumentException("Format RGB tidak valid. Gunakan format RGB(r, g, b)");
        }

        try {
            int r = Integer.parseInt(parts[0]);
            int g = Integer.parseInt(parts[1]);
            int b = Integer.parseInt(parts[2]);
            return new Color(r, g, b);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Nilai RGB harus berupa angka antara 0-255.");
        }
    }
    
    public static Date toDate(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

}
