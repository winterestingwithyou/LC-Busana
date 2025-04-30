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
}
