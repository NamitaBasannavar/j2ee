package com.cognizant.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadTextFile
 */
@WebServlet("/DownloadTextFile")
public class DownloadTextFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadTextFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("Hello World!");
		System.out.println("Welcome to Programming");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String filename = "N.txt";
		String filepath = "c:\\";
		response.setHeader("Content Disposition", "attchment ; filename=\""+filename+"\"");
		
		FileInputStream fileInputStream = new FileInputStream(filepath + filename);
		
		int i;
		while((i=fileInputStream.read())!=-1) {
			out.write(i);
			
		}
		fileInputStream.close();
		out.close();
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
