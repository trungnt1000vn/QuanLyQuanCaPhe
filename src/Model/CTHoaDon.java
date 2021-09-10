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
public class CTHoaDon extends ThucDon{
    private String mahd;
    private int soluong;
    private float thanhtien;

    public CTHoaDon() {
    }   

    public CTHoaDon(String mahd, int soluong, float thanhtien, String mamon, String tenmon, String dvtinh, float dongia) {
        super(mamon, tenmon, dvtinh, dongia);
        this.mahd = mahd;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(float thanhtien) {
        this.thanhtien = thanhtien;
    }
    
    
}
