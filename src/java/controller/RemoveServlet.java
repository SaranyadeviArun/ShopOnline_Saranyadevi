/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
import javax.servlet.http.HttpSession;
import model.Remove;

/**
 *
 * @author peter
 */
@WebServlet(name = "RemoveServlet", urlPatterns = {"/RemoveServlet"})
public class RemoveServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session=request.getSession();
            String signuser=(String)session.getAttribute("user");
            System.out.println(signuser);
            Remove r=new Remove();
            r.setSignuser(signuser);
            String p=request.getParameter("remove");
            r.setPid(p);
            System.out.println(p);
            String sql="Delete FROM Carttable WHERE  pid='"+p+"' and status='incomplete'";
            int i = ConnectionDao.remove(r, sql);
            if(i!=0)
            {
                System.out.println("Removed from cart");
                request.getRequestDispatcher("cart.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("cart.jsp").forward(request,response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RemoveServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RemoveServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
