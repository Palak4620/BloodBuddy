package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import campmodel.camp;
import java.sql.*;
import java.util.*;
import myconnection.OnlineConnection;
import model.Donar;
import signinmodel.signin;

/**
 *
 * @author Asus
 */
public class BloodDAO {
 
     public Donar searchByID(int did)
     {
            Donar B=new Donar();
      try
      {      
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        con=OnlineConnection.getConnection();
        String sql;
        sql="select * from donar where donar_id=?";
        ps=con.prepareStatement(sql);
        ps.setInt(1, did);
        rs=ps.executeQuery();
        if(rs.next())
        {    
                B.setDid(rs.getInt(1));
                B.setName(rs.getString(2));
                B.setFname(rs.getString(3));
                B.setMname(rs.getString(4));
                B.setPhoneno(rs.getString(5));
                B.setEmail(rs.getString(6));
                B.setBgroup(rs.getString(7));
                B.setGender(rs.getString(8));
                B.setCity(rs.getString(9));
                B.setAddress(rs.getString(10));
        }
        else{
            B=null;
        }
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
     return (B);  
 }
     public boolean updateData(Donar B)    
  {
       int n=0;
      try
      {      
        Connection con=null;
        PreparedStatement ps=null;
        con=OnlineConnection.getConnection();
        String sql;
        sql="update donar set full_name=?,father_name=?,mother_name=?,phoneno=?,email=?,blood_group=?,gender=?,city=?,address=? where donar_id=?";
        ps=con.prepareStatement(sql);
         ps.setInt(10, B.getDid());
            ps.setString(1, B.getName());
            ps.setString(2, B.getFname());
            ps.setString(3, B.getMname());
            ps.setString(4, B.getPhoneno());
            ps.setString(5, B.getEmail());
            ps.setString(6, B.getBgroup());
            ps.setString(7, B.getGender());
            ps.setString(8, B.getCity());
            ps.setString(9, B.getAddress());   
            
        n=ps.executeUpdate();
          if(n>0)
             return true;
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      return false;
  }
      public boolean deleteStudent(int did)
  {
       int n=0;
      try
      {      
        Connection con=null;
        PreparedStatement ps=null;
        con=OnlineConnection.getConnection();
        String sql;
        sql="delete from donar where donar_id=?";
        ps=con.prepareStatement(sql);
        ps.setInt(1, did);
        n=ps.executeUpdate();
        if(n>0)  
            return true;
          
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      
      
    return false;  
  }
    public List<Donar> searchAllRecord() {

        List<Donar> mylist = new ArrayList<Donar>();
        try {
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            con = OnlineConnection.getConnection();
            String sql;
            sql = "select * from donar";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Donar B = new Donar();
                B.setDid(rs.getInt(1));
                B.setName(rs.getString(2));
                B.setFname(rs.getString(3));
                B.setMname(rs.getString(4));
                B.setPhoneno(rs.getString(5));
                B.setEmail(rs.getString(6));
                B.setBgroup(rs.getString(7));
                B.setGender(rs.getString(8));
                B.setCity(rs.getString(9));
                B.setAddress(rs.getString(10));
                mylist.add(B);
                B = null;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return mylist;
    }
     public boolean rinsertData(Donar B)
    {
        int n=0;
        try{
            Connection con=null;
            PreparedStatement ps=null;
            con=OnlineConnection.getConnection();
            String sql;
            sql="insert into register values(?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setString(1, B.getName());
            ps.setString(2, B.getEmail());
            ps.setString(3, B.getpass());
            n=ps.executeUpdate();
            if(n>0)
            {
                return true;
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return false;
    }

    public boolean insertdata(Donar B) {
        int n = 0;
        try {
            Connection con = null;
            PreparedStatement ps = null;
            con = OnlineConnection.getConnection();
            String sql;
            sql = "insert into donar values(?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, B.getDid());
            ps.setString(2, B.getName());
            ps.setString(3, B.getFname());
            ps.setString(4, B.getMname());
            ps.setString(5, B.getPhoneno());
            ps.setString(6, B.getEmail());
            ps.setString(7, B.getBgroup());
            ps.setString(8, B.getGender());
            ps.setString(9, B.getCity());
            ps.setString(10, B.getAddress());
            n = ps.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean checklogin(String user, String pass) {
        try {
            Connection con = null;
            PreparedStatement ps = null;
            con = OnlineConnection.getConnection();
            ResultSet rs = null;
            String sql;
            sql = "select * from login where user=? and pass=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
     

    public List<Donar> searchByBG(String bloodGroup) {

        List<Donar> mylist = new ArrayList<Donar>();
        try {
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            con = OnlineConnection.getConnection();
            String sql;
            sql = "select * from donar where blood_group=?";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Donar B = new Donar();
                B.setDid(rs.getInt(1));
                B.setName(rs.getString(2));
                B.setFname(rs.getString(3));
                B.setMname(rs.getString(4));
                B.setPhoneno(rs.getString(5));
                B.setEmail(rs.getString(6));
                B.setBgroup(rs.getString(7));
                B.setGender(rs.getString(8));
                B.setCity(rs.getString(9));
                B.setAddress(rs.getString(10));
                mylist.add(B);
                B = null;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return mylist;
    }
    public List<Donar> searchByCity(String city, String bgroup) {
    List<Donar> mylist = new ArrayList<Donar>();
    try {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        con = OnlineConnection.getConnection();
        String sql = "SELECT * FROM donar WHERE city=? AND blood_group=?";
        ps = con.prepareStatement(sql);
        ps.setString(1, city);
        ps.setString(2, bgroup);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            Donar B = new Donar();
            B.setDid(rs.getInt(1));
            B.setName(rs.getString(2));
            B.setFname(rs.getString(3));
            B.setMname(rs.getString(4));
            B.setPhoneno(rs.getString(5));
            B.setEmail(rs.getString(6));
            B.setBgroup(rs.getString(7));
            B.setGender(rs.getString(8));
            B.setCity(rs.getString(9));
            B.setAddress(rs.getString(10));
            mylist.add(B);
        }
        } catch (Exception e) {
        System.out.println(e);
    }
    return mylist;
}
    public boolean signin(signin s)
    {
        PreparedStatement ps=null; 
        Connection con=null;
        int n=0;
        try{
        con=OnlineConnection.getConnection();
        String sql="insert into register values(?,?,?,?,?,?,?,?,?,?,?)";
        ps=con.prepareStatement(sql);
        ps.setString(1,s.getName());
        ps.setString(2, s.getGender());
         ps.setString(3,s.getMobile());
        ps.setString(4, s.getState());
         ps.setString(5,s.getAddress());
        ps.setInt(6, s.getAge());
         ps.setString(7,s.getFname());
        ps.setString(8, s.getEmail());
         ps.setString(9,s.getDistrict());
        ps.setInt(10, s.getPincode());
                ps.setString(11, s.getPass());

        
        n=ps.executeUpdate();
        if(n>0)
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return false;   
    }
}
   

