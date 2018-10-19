/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ConnectionDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.login;

/**
 *
 * @author peter
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String user=request.getParameter("signuser");
        String password=request.getParameter("signpass1");
        String role=request.getParameter("role");
        
        if(user.equals("Saranyadevi")&&password.equals("password@123")&&role.equals("administrator"))
        {
            HttpSession session=request.getSession();
            session.setAttribute("user", user);
             RequestDispatcher dispatch=request.getRequestDispatcher("WelcomeAdmin.jsp");
             dispatch.include(request,response);
            }else{
            login l = new login();
        
			l.setSignuser(user);
			l.setSignpass1(password);
                        l.setRole(role);
			String sql="Select * from signup where signuser=? and signpass1=?"; 
			ResultSet rs = ConnectionDao.userlogin(l,sql);
			try {
				if(rs.next())
				{	
					HttpSession session=request.getSession();  
			        session.setAttribute("user",user);  
			        System.out.println(session.getAttribute("user"));
					System.out.println("hii");
					getServletContext().getRequestDispatcher("/HomePage.jsp").forward(request, response);
				}
				else
				{
					System.out.println("hey");
					getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
                        }

        }
        }}
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
