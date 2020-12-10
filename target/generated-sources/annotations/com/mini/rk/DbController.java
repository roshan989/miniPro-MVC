package com.mini.rk;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mini.service.DbService;
import com.rk.model.DbModel;


@Controller
public class DbController{
	@RequestMapping("/push")
	public ModelAndView conn(HttpServletRequest req,HttpServletResponse respo) {
		int id=Integer.parseInt(req.getParameter("id"));
	/*	String nm=req.getParameter("Name");
		String book=req.getParameter("book");
		String date=req.getParameter("date");
		String Bnm=req.getParameter("borrowN");*/
		
		DbService ds=new DbService();
		DbModel dm=ds.getparam(id);
		
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("output.jsp");
		mv.addObject("result",dm);
		return mv;
	}
	
       
	
   

	
   

}
