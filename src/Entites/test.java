/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

import DatabaseOperation.ArticleDb;
import DatabaseOperation.PersonnelDb;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;
import Entites.Personnel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import main.login;





/**
 *
 * @author EDOU Dodji
 */
public class test {
    public static void main(String [] args) throws FileNotFoundException{
      /*/* Article nouveau =new Article(5,4,"description","desc", 490000,"description");
            ArticleDb.ajouterArticle(nouveau);
        : System.out.println(nouveau.toString());
            
            ArrayList<Article> article =new ArrayList<>();
            article=(ArrayList<Article>) ArticleDb.consulterArticle();
             for(int i=0;i<article.size();i++){
			 System.out.println(article.get(i).toString());
		 }
             
            Article nouveau =new Article(4,4,"description","desc", 490,"description");
            ArticleDb.modifierArticle(nouveau);
            System.out.println(nouveau.toString());
                        
              ArticleDb.supprimerArticle(5);
              article=(ArrayList<Article>) ArticleDb.consulterArticle();
             for(int i=0;i<article.size();i++){
			 System.out.println(article.get(i).toString());
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
      java.util.Date myDate=format.parse("06-07-2021");
      java.sql.Date dateDuJour = new java.sql.Date(myDate);
      System.out.println(dateDuJour);
        }
      String location ="G:\\Restaurant\\etat2.png";
      File monImage=new File(location);
      FileInputStream istreamImage=new FileInputStream(monImage);
      Date date=new Date() ;
      SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
      String dateDuJour;
      dateDuJour = sdf.format(date);
      System.out.println(dateDuJour);
     // java.sql.Date dDJ = new java.sql.Date((long)dateDuJour);
          
      Personnel p1 = new Personnel(6,"EDOU",
                "Dodji",97134743,"dodjiedu@gmail.com",
                "dhhhasqhq",null,
                90000, istreamImage,
                "htfredd","Serveur");
       PersonnelDb.ajouterPersonnel(p1);
       User u1=new User("edod", "essi1996", 1, 6,
               "EDOU","Dodji",97134743,
               "dodjiedu@gmail.com",
               "dhhhasqhq",null,
                90000, istreamImage,
                "htfredd","Serveur"
               );
      UserDb.ajouterUser(u1);
      
      Personnel p2 = new Personnel(7,"EDOU",
                "Dodji",97134743,"dodjiedu@gmail.com",
                "dhhhasqhq",null,
                90000, istreamImage,
                "htfredd","Admin");
       PersonnelDb.ajouterPersonnel(p2);
       User u2=new User("koko", "essi96", 2, 7,
               "EDOU","Dodji",97134743,
               "dodjiedu@gmail.com",
               "dhhhasqhq",null,
                90000, istreamImage,
                "htfredd","Admin"
               );
      UserDb.ajouterUser(u2);
      
      Personnel p3 = new Personnel(8,"EDOU",
                "Dodji",97134743,"dodjiedu@gmail.com",
                "dhhhasqhq",null,
                90000, istreamImage,
                "htfredd","Gerant");
       PersonnelDb.ajouterPersonnel(p3);
       User u3=new User("kanko", "essi6", 3, 8,
               "EDOU","Dodji",97134743,
               "dodjiedu@gmail.com",
               "dhhhasqhq",null,
                90000, istreamImage,
                "htfredd","Gerant"
               );
      UserDb.ajouterUser(u3);
        System.out.println(UserDb.login("edod","essi1996"));
    */
        login ma = new login();
        ma.setVisible(true);
        
      
    }
     

 }
