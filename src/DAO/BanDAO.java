/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.MyConnection;
import Model.Ban;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author NHT_Kurumi
 */
public class BanDAO {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public List<Ban> getListBan(int maban) {
        List<Ban> ListBan = new ArrayList<Ban>();

        conn = MyConnection.getMyConnection();

        String sql;
        if (maban == 0) {
            sql = "Select * From ban";
        } else {
            sql = "Select * From ban Where MaBan = '"+maban+"'";
        }

        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Ban ban = new Ban();

                ban.setMaban(rs.getInt("MaBan"));
                ban.setTenban(rs.getString("TenBan"));
                ban.setTrangthai(rs.getString("TrangThai"));

                ListBan.add(ban);
            }
            ps.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi !");
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                    System.out.println("Đóng kết nối");
                } catch (Exception ex) {
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Đóng kết nối");
                } catch (Exception ex) {
                }
            }
            return ListBan;
        }
    }
}