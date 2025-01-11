
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Donar;
import model.camp;
import myconnection.OnlineConnection;

/**
 *
 * @author Asus
 */
public class campDAO {
     public boolean insertdata(camp B) {
        int n = 0;
        try {
            Connection con = null;
            PreparedStatement ps = null;
            con = OnlineConnection.getConnection();
            String sql;
            sql = "insert into camp values(?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, B.getOrganization_name());
            ps.setString(2, B.getCamp_Name());
            ps.setString(3, B.getOrganizer_name());
            ps.setString(4, B.getOrganizer_no());
            ps.setString(5, B.getOrganizer_Email_Id());
            ps.setString(6, B.getCity_name());
            ps.setString(7, B.getState());
            ps.setString(8, B.getCamp_date());
            ps.setString(9, B.getEstimated_participants());
            ps.setString(10, B.getCamp_Address());
            n = ps.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
     public List<camp> searchByCity(String city, String state) {
    List<camp> mylist = new ArrayList<camp>();
    try {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        con = OnlineConnection.getConnection();
        String sql = "SELECT * FROM camp WHERE city=? AND state=?";
        ps = con.prepareStatement(sql);
        ps.setString(1, city);
        ps.setString(2, state);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            camp B = new camp();
            B.setCamp_Name(rs.getString(1));
            B.setCamp_date(rs.getString(2));
            B.setOrganization_name(rs.getString(3));
            B.setOrganizer_no(rs.getString(4));
            B.setCity_name(rs.getString(5));
            B.setState(rs.getString(5));
            B.setCamp_Address(rs.getString(7));
            mylist.add(B);
        }
        } catch (Exception e) {
        System.out.println(e);
    }
    return mylist;
     }
}
