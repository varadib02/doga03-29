/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doga;

/**
 *
 * @author User
 */
public class Ferrari extends Auto{
    
    private Integer db;
    private Integer fogyasztas;
    private String ablakszam;

    public Ferrari(Integer db, Integer fogyasztas, String ablakszam, String rendszam, String szin, String marka) {
        super(rendszam, szin, marka);
        this.db = db;
        this.fogyasztas = fogyasztas;
        this.ablakszam = ablakszam;
    }

    public Ferrari() {
        
    }

    public Integer getDb() {
        return db;
    }

    public void setDb(Integer db) {
        this.db = db;
    }

    public Integer getFogyasztas() {
        return fogyasztas;
    }

    public void setFogyasztas(Integer fogyasztas) {
        this.fogyasztas = fogyasztas;
    }

    public String getAblakszam() {
        return ablakszam;
    }

    public void setAblakszam(String ablakszam) {
        this.ablakszam = ablakszam;
    }
    
    
    
}
