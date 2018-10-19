/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ConnectionDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;


public class CartServlet extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session=request.getSession();
            String signuser=(String) session.getAttribute("user");
            Cart c=new Cart();
            c.setSignuser(signuser);
            String p=request.getParameter("pid");
            String pname=request.getParameter("pname");
            int price=Integer.parseInt(request.getParameter("price"));
            String sql="insert into Carttable values('"+signuser+"','"+p+"','"+pname+"',1,"+price+",'incomplete')";
            if(signuser==null){
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            int i=ConnectionDao.cart(c,sql);
            if(i!=0){
                System.out.println("Added to cart");
                request.getRequestDispatcher("cart.jsp").forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CartServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CartServlet.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }


}
