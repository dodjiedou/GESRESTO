package Entites;
/***********************************************************************
 * Module:  Facture.java
 * Author:  francois
 * Purpose: Defines the Class Facture
 ***********************************************************************/

import java.util.*;

public class Facture {
   public int idCmd;

    public Facture(int idCmd) {
        this.idCmd = idCmd;
    }

    public int getIdCmd() {
        return idCmd;
    }

    public void setIdCmd(int idCmd) {
        this.idCmd = idCmd;
    }
   
   
   
}