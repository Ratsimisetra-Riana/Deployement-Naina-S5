package Controller;

import jakarta.servlet.*; 
import jakarta.servlet.http.*;
import java.io.*;

public class FrontServlet extends HttpServlet{

    public FrontServlet(){

    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
        RequestDispatcher rd=req.getRequestDispatcher("Hello.jsp");//alefa any amnle vue prédéfinie
        rd.forward(req,res);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
        RequestDispatcher rd=req.getRequestDispatcher("Hello.jsp");//alefa any amnle vue prédéfinie
        rd.forward(req,res);
    }
}
