/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
/**
 *
 * @author Vann
 */
public class Post implements DBInfo {

    private String pId;
    private String pTitle;
    private String pPic;
    private String pContent;
    private String date;

    public Post(String pId, String pTitle, String pPic, String pContent, String date) throws ParseException {
        this.pId = pId;
        this.pTitle = pTitle;
        this.pPic = pPic;
        this.pContent = pContent;        
        this.date = date;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpTitle() {
        return pTitle;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle;
    }

    public String getpPic() {
        return pPic;
    }

    public void setpPic(String pPic) {
        this.pPic = pPic;
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    @Override
    public String toString() {
        return "Post{" + "pId=" + pId + ", pTitle=" + pTitle + ", pPic=" + pPic + ", pContent=" + pContent + ", date=" + date + '}';
    }

    public static ArrayList<Post> getP() {
        ArrayList<Post> ap = new ArrayList<>();
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from post");
            while (rs.next()) {
                String id = rs.getString(1);
                String title = rs.getString(2);
                String pic = rs.getString(3);
                String content = rs.getString(4);
                String date = rs.getDate(5).toString();               
                ap.add(new Post(id, title, pic, content, date));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException | ParseException e) {
            e.printStackTrace();
        }
        return ap;
    }
    
    
    
    public static void main(String[] args) {
        ArrayList<Post> ap = getP();
        System.out.println(ap.toString());
    }
}
