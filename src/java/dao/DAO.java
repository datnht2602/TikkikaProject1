/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.AccountDTO;
import entity.Category;
import entity.Items;
import entity.Product;
import helper.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Derek
 */
public class DAO {
      Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        public List<Product> getAllProduct(){
            List<Product> list = new ArrayList<>();
            String sql ="select * from PRODUCT";
            try{
                con = new DBUtils().getConnection();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
              while(rs.next()){
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    String image = rs.getString(3);
                    int price = rs.getInt(4);
                    String title = rs.getString(5);
                    String description = rs.getString(6);
                    int cateID= rs.getInt(7);
                    int sell_ID = rs.getInt(8);
                    Product dto = new Product(id, price, cateID, sell_ID, name, image, title, description);
                    list.add(dto);
            } 
            }catch(Exception e){
                
            }
            return list;
        }
              public List<Product> getRamdomProduct(){
            List<Product> list = new ArrayList<>();
            String sql ="SELECT TOP 4 id, name, image, price, title, description, cateID, sell_ID FROM product ORDER BY NEWID()";
            try{
                con = new DBUtils().getConnection();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
              while(rs.next()){
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    String image = rs.getString(3);
                    int price = rs.getInt(4);
                    String title = rs.getString(5);
                    String description = rs.getString(6);
                    int cateID= rs.getInt(7);
                    int sell_ID = rs.getInt(8);
                    Product dto = new Product(id, price, cateID, sell_ID, name, image, title, description);
                 
                    list.add(dto);
            } 
            }catch(Exception e){
                
            }
            return list;
        }
               public List<Category> getAllCategory(){
            List<Category> list = new ArrayList<>();
            String sql ="select * from Category";
            try{
                con = new DBUtils().getConnection();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
              while(rs.next()){
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    Category dto = new Category(id, name);
                    list.add(dto);
            } 
            }catch(Exception e){
                
            }
            return list;
        }
            public List<Product> getProductById(String cid){
            List<Product> list = new ArrayList<>();
            String sql ="select * from Product where cateID=?";
            try{
                con = new DBUtils().getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1,cid);
            rs = stm.executeQuery();
              while(rs.next()){
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    String image = rs.getString(3);
                    int price = rs.getInt(4);
                    String title = rs.getString(5);
                    String description = rs.getString(6);
                    int cateID= rs.getInt(7);
                    int sell_ID = rs.getInt(8);
                    Product dto = new Product(id, price, cateID, sell_ID, name, image, title, description);
                    list.add(dto);
            } 
            }catch(Exception e){
                
            }
            return list;
        }
             public Product getProductByPId(String pid){
            String sql ="select * from Product where id=?";
            try{
                con = new DBUtils().getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1,pid);
            rs = stm.executeQuery();
              while(rs.next()){
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    String image = rs.getString(3);
                    int price = rs.getInt(4);
                    String title = rs.getString(5);
                    String description = rs.getString(6);
                    int cateID= rs.getInt(7);
                    int sell_ID = rs.getInt(8);
                   return new Product(id, price, cateID, sell_ID, name, image, title, description);
                      
            } 
            }catch(Exception e){
                
            }
            return null;
        }
             public List<Product> getProductBySearch(String search){
            List<Product> list = new ArrayList<>();
            String sql ="select * from product where name like ?";
            try{
                con = new DBUtils().getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1,"%" +search+ "%");
            rs = stm.executeQuery();
              while(rs.next()){
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    String image = rs.getString(3);
                    int price = rs.getInt(4);
                    String title = rs.getString(5);
                    String description = rs.getString(6);
                    int cateID= rs.getInt(7);
                    int sell_ID = rs.getInt(8);
                    Product dto = new Product(id, price, cateID, sell_ID, name, image, title, description);
                    list.add(dto);
            } 
            }catch(Exception e){
                
            }
            return list;
        }
               public AccountDTO login(String user, String pass) {
        String query = " select * from ACCOUNT where [user]=? and pass=?";
        try {
            con = new DBUtils().getConnection();
            stm = con.prepareStatement(query);
            stm.setString(1, user);
            stm.setString(2, pass);
            rs = stm.executeQuery();
            while (rs.next()) {
                return new AccountDTO(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }

        return null;
    }
         public AccountDTO checkExistAcc(String user) {
        String query = " select * from ACCOUNT where [user]=?";
        try {
            con = new DBUtils().getConnection();
            stm = con.prepareStatement(query);
            stm.setString(1, user);
            rs = stm.executeQuery();
            while (rs.next()) {
                return new AccountDTO(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }

        return null;
    }
     public void signup(String user, String pass){
         String query= "insert into Account values(?,?,0,0)";
          try {
            con = new DBUtils().getConnection();
            stm = con.prepareStatement(query);
            stm.setString(1, user);
            stm.setString(2, pass);
          stm.executeUpdate();
        } catch (Exception e) {
        }
          
}
          public List<Product> getProductBySellId(int cid){
            List<Product> list = new ArrayList<>();
            String sql ="select * from Product where sell_ID=?";
            try{
                con = new DBUtils().getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1,cid);
            rs = stm.executeQuery();
              while(rs.next()){
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    String image = rs.getString(3);
                    int price = rs.getInt(4);
                    String title = rs.getString(5);
                    String description = rs.getString(6);
                    int cateID= rs.getInt(7);
                    int sell_ID = rs.getInt(8);
                    Product dto = new Product(id, price, cateID, sell_ID, name, image, title, description);
                    list.add(dto);
            } 
            }catch(Exception e){
                
            }
            return list;
        }
          public boolean deleteProduct(String pk){
         String sql = "delete from PRODUCT where name = ?";
        try {
            con = new DBUtils().getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, pk);
            int rs = stm.executeUpdate();
                if(rs > 0){
                    return true;
                }
        } catch (Exception e) {
        }
        return false;
    }
       public boolean addProduct(String name, String image, int price, String title, String description,int cateId,int SellID){
        String sql = "insert into Product values(? ,? ,?,?,?,?,?)";
        try {
            con = new DBUtils().getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, name);
            stm.setString(2, image);
            stm.setInt(3, price);
            stm.setString(4, title);
            stm.setString(5, description);
            stm.setInt(6,cateId);
            stm.setInt(7,SellID);
            int rs = stm.executeUpdate();
            System.out.println("Add Product:" + name);
                if(rs > 0){
                    return true;
                }
        } catch (Exception e) {
        }
        return false;
    }
            public boolean updateProduct(String name, String image, int price, String title, String description,int cateId,int SellID,String id){
            String sql = "Update PRODUCT Set name = ?,image =?, price= ?, title=?, description=?,cateID=?  where id = ?";
        try {
            con = new DBUtils().getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, name);
          stm.setString(2,image);
          stm.setInt(3, price);
          stm.setString(4, title);
          stm.setString(5,description);
          stm.setInt(6,cateId);
          stm.setString(7,id);
            int rs = stm.executeUpdate();
                if(rs > 0){
                    return true;
                }
        } catch (Exception e) {
        }
        return false;
       }
            public double getTotalCartPrice(List<Items> list ){
                double sum = 0;
                try{
                    if(list.size()>0){
                        for(Items item: list){
                            String sql=" select price from product where id = ?";
                            con = new DBUtils().getConnection();
                             stm = con.prepareStatement(sql);
                            stm.setInt(1, item.getProduct().getId());
                             rs = stm.executeQuery();
                            while(rs.next()){
                                sum+=rs.getDouble("price")*item.getQuantity();
                            }
                                    
                        }
                    }
                }catch(Exception e){
                    
                }
                return sum;
            }
            public List<AccountDTO> displayAccount() {
        List<AccountDTO> list = new ArrayList<>();
        String sql = "Select * from ACCOUNT";
        try {
            con = new DBUtils().getConnection();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new AccountDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public AccountDTO searchAccount(int uID) {
        String sql = "select * from ACCOUNT where uID = ?";
        try {
            con = new DBUtils().getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, uID);
            rs = stm.executeQuery();
            while (rs.next()) {
                return new AccountDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public boolean UpdateAccount(int Uid,String username, String password, int issell, int role){
        String sql = "update ACCOUNT set pass=?, isSell=?, isAdmin =? where uID = ?";
        try {
            con = new DBUtils().getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, password);
            stm.setInt(2, issell);
            stm.setInt(3, role);
            stm.setInt(4, Uid);
            int rs=stm.executeUpdate();
        if(rs > 0){
                    return true;
                }
        } catch (Exception e) {
        }
        return false;
    }
    public void deleteAccount(String username){
        String sql = "delete from ACCOUNT where [user] = ?";
        try {
            con = new DBUtils().getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
}
