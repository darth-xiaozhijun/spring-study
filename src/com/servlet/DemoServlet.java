package com.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//输出文字流
//		PrintWriter out = resp.getWriter();
		//获取响应流
		ServletOutputStream os = resp.getOutputStream();
		InputStream is = new FileInputStream(new File(getServletContext().getRealPath("images"),"a.png"));
		int index = -1;
		while((index=is.read())!=-1){
			os.write(index);
		}
	}
}
