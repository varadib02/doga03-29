/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doga;

public abstract class Auto {
    protected String rendszam;
    protected String szin;
    protected String marka;
    protected Integer megtettKm=0;
    protected Integer eves=0;
    protected Boolean valtoztathato=false;
    

    public Auto(String rendszam, String szin, String marka) {
        this.rendszam = rendszam;
        this.szin = szin;
        this.marka = marka;
    }

    public Auto(String rendszam, String marka) {
        this.rendszam = rendszam;
        this.marka = marka;
    }
    
    public Auto() {
    }

    public void EvekNovelese() {
        this.eves ++;
        this.valtoztathato=true;
    }
    
    
    public String getRendszam() {
        return rendszam;
    }
    public void setRendszam(String rendszam){
        if(this.valtoztathato==true){
            this.rendszam = rendszam;
            this.valtoztathato=false;
        }
        
    }
    
    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        if(this.valtoztathato==true){this.szin = szin;
        this.valtoztathato=false;
        }
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Integer getMegtettKm() {
        return megtettKm;
    }

    public void KmNoveles(Integer maMegtettKm)throws hibaException {
        if(maMegtettKm>=0){
            this.megtettKm += maMegtettKm;
        }
        else{
            throw new hibaException("Nem lehet negatív");
        }
        
    }
    
    
    
}
