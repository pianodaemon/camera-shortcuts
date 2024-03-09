package com.immortalcrab.meh;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.ServletException;
import java.io.IOException;

import java.io.PrintWriter;

public class CamotinServlet extends HttpServlet {

    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {  
        res.setContentType("text/html");//setting the content type  
        PrintWriter pw=res.getWriter();//get the stream to write the data  
  
        //writing html in the stream  
        pw.println("<html><body>");  
        pw.println("Welcome to servlet");  
        pw.println("</body></html>");  
  
        pw.close(); 
    }
}