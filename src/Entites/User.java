
package Entites;

/***********************************************************************
 * Module:  User.java
 * Author:  francois
 * Purpose: Defines the Class User
 ***********************************************************************/

import java.io.FileInputStream;



public class User extends Personnel {
   private String userName;
   private String password;
   

   
    public User(String userName, String password, String nom, String prenom, int tel, String Email,String datEmbauch, double salaireMensuel,byte[] imgPesonnel, String adresse, String type) {
        super(nom, prenom, tel, Email,datEmbauch, salaireMensuel, imgPesonnel, adresse, type);
        this.userName = userName;
        this.password = password;
        
        
    }

    
    

   
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
}