package dao;
import java.sql.*;
import java.util.*;
import model.bloodbank;
import myconnection.OnlineConnection;
import model.bloodbank;

public class bloodbankDAO {
        public boolean insertdata(bloodbank B) {
        int n = 0;
        try {
            Connection con = null;
            PreparedStatement ps = null;
            con = OnlineConnection.getConnection();
            String sql;
            sql = "insert into bloodbank values(?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, B.getLicno());
            ps.setString(2, B.getBname());
            ps.setString(3, B.getHname());
            ps.setString(4, B.getCategory());
            ps.setString(5, B.getContact_person());
            ps.setString(6, B.getContact_no());
            ps.setString(7, B.getEmail());
            ps.setString(8, B.getHelplineno());
            ps.setString(9, B.getState());
            ps.setString(10, B.getCity());
            ps.setString(11, B.getAddress());
            ps.setString(12, B.getPass());
            n = ps.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
        
        public List<bloodbank> searchByCity(String city) {
    List<bloodbank> mylist = new ArrayList<bloodbank>();
    try {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        con = OnlineConnection.getConnection();
        String sql = "SELECT * FROM bloodbank WHERE city=?";
        ps = con.prepareStatement(sql);
        ps.setString(1, city);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            bloodbank B = new bloodbank();
            B.setLicno(rs.getInt(1));
            B.setBname(rs.getString(2));
            B.setHname(rs.getString(3));
            B.setCategory(rs.getString(4));
            B.setContact_person(rs.getString(5));
            B.setContact_no(rs.getString(6));
            B.setEmail(rs.getString(7));
            B.setHelplineno(rs.getString(8));
            B.setState(rs.getString(9));
            B.setCity(rs.getString(10));
            B.setAddress(rs.getString(10));
            B.setPass(rs.getString(10));
            mylist.add(B);
        }
        } catch (Exception e) {
        System.out.println(e);
    }
    return mylist;
}
}
