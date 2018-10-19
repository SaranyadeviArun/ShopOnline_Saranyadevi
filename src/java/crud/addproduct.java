/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import dao.ConnectionDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.product;

/**
 *
 * @author peter
 */
@WebServlet(name = "addproduct", urlPatterns = {"/addproduct"})
public class addproduct extends HttpServlet {

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String pid=request.getParameter("pid");
            String pname=request.getParameter("pname");
            int quantity=Integer.parseInt(request.getParameter("qty"));
            int price=Integer.parseInt(request.getParameter("price"));
            product pdt=new product();
            pdt.setPid(pid);
            pdt.setProductname(pname);
            pdt.setQuantity(quantity);
            pdt.setMrp(price);
            String sql="insert into product values(?,?,?,?)";
            int i=ConnectionDao.product(pdt,sql);
            if(i!=0){
                System.out.println("Added to table");
                request.getRequestDispatcher("viewproduct.jsp").forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(addproduct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addproduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
