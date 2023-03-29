/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doga;

public class Mercedes extends Auto{

    private Boolean elektromos;
    private Integer végsebesseg;
    private Integer fogyasztas;

    public Mercedes(Boolean elektromos, Integer végsebesseg, Integer fogyasztas, String rendszam, String szin, String marka) {
        super(rendszam, szin, marka);
        this.elektromos = elektromos;
        this.végsebesseg = végsebesseg;
        this.fogyasztas = fogyasztas;
    }

    public Mercedes(String rendszam, String marka) {
        super(rendszam, marka);
    }

    

    public Boolean getElektromos() {
        return elektromos;
    }

    public void setElektromos(Boolean elektromos) {
        this.elektromos = elektromos;
    }

    public Integer getVégsebesseg() {
        return végsebesseg;
    }

    public void setVégsebesseg(Integer végsebesseg) {
        this.végsebesseg = végsebesseg;
    }

    public Integer getFogyasztas() {
        return fogyasztas;
    }

    public void setFogyasztas(Integer fogyasztas)throws hibaException{
        
        if(fogyasztas>=0){
            this.fogyasztas = fogyasztas;
        }
        else{
            throw new hibaException("A fogyasztás nem lehet negativ");
        }
    }

    
    
    
}
