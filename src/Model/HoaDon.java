/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author NHT_Kurumi
 */
public class HoaDon {
    private String mahd, maban, trangthai, tennv;
    private Date gioden, giocapnhat;
    private float tongtien;

    public HoaDon() {
    }

    public HoaDon(String mahd, String maban, String trangthai, Date gioden, float tongtien) {
        this.mahd = mahd;
        this.maban = maban;
        this.trangthai = trangthai;
        this.gioden = gioden;
        this.tongtien = tongtien;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMaban() {
        return maban;
    }

    public void setMaban(String maban) {
        this.maban = maban;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public Date getGioden() {
        return gioden;
    }

    public void setGioden(Date gioden) {
        this.gioden = gioden;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    
    
}
