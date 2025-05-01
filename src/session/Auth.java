/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session;

/**
 *
 * @author Acer
 */
public class Auth {
    private static Auth instance;
    private boolean isAuth;
    private int authUser;
    private String username;
    private String namaLengkap;
    private String nomorWa;
    private String email;
    private String alamat;

    // Private constructor to prevent instantiation
    private Auth() {
        this.isAuth = false;
        this.authUser = -1; // default value when no user is authenticated
    }

    // Public method to provide access to the single instance
    public static Auth getInstance() {
        if (instance == null) {
            instance = new Auth();
        }
        return instance;
    }

    // Getter and Setter for isAuth
    public boolean isAuth() {
        return isAuth;
    }

    public void setAuth(boolean isAuth) {
        this.isAuth = isAuth;
    }

    // Getter and Setter for authUser
    public int getAuthUser() {
        return authUser;
    }

    public void setAuthUser(int authUser) {
        this.authUser = authUser;
    }
    
    /**
     * @return the namaLengkap
     */
    public String getNamaLengkap() {
        return namaLengkap;
    }

    /**
     * @param namaLengkap the namaLengkap to set
     */
    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    /**
     * @return the nomorWa
     */
    public String getNomorWa() {
        return nomorWa;
    }

    /**
     * @param nomorWa the nomorWa to set
     */
    public void setNomorWa(String nomorWa) {
        this.nomorWa = nomorWa;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void clear(){
        this.isAuth = false;
        this.authUser = -1;
        this.username = null;
        this.namaLengkap = null;
        this.nomorWa = null;
        this.email = null;
        this.alamat = null;
    }
}
