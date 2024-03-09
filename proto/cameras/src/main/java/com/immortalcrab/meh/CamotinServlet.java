package com.immortalcrab.meh;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.ServletException;
import java.io.IOException;

import java.io.PrintWriter;

public class CamotinServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ShortcutConfig sc = null;

		try {
			sc = ShortcutConfigHelper.fetchFromEvar("SHORTCURT_CONFIG");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		res.setContentType("text/html");// setting the content type
		PrintWriter pw = res.getWriter();// get the stream to write the data

		// writing html in the stream
		pw.println("<html><body>");
		pw.println("Welcome to servlet</br>");

		sc.getCameras().stream().forEach((c) -> pw.println(c.getUri() + "</br>"));
		pw.println("</body></html>");

		pw.close();
	}
}
