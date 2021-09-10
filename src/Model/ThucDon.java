/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author NHT_Kurumi
 */
public class ThucDon {
    private String mamon, manhom, tenmon, dvtinh; 
    private float dongia;

    public ThucDon() {
    }

    public ThucDon(String mamon, String tenmon, String dvtinh, float dongia) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.dvtinh = dvtinh;
        this.dongia = dongia;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getDvtinh() {
        return dvtinh;
    }

    public void setDvtinh(String dvtinh) {
        this.dvtinh = dvtinh;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }
    
    
}
