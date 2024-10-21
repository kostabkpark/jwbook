package com.example.jwbook.ch05;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
@WebServlet("/ch05/calc")
public class CalcServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Calculator cal = new Calculator();

    int n1 = Integer.parseInt(req.getParameter("n1"));
    int n2 = Integer.parseInt(req.getParameter("n2"));
    String op = req.getParameter("op");
    int result=0;
    log.info("number 1 ==> {}" , n1);
    log.info("number 2 ==> {}" , n2);
    log.info("op ==> {}" , op);

    cal.setN1(n1);
    cal.setN2(n2);
    cal.setOp(op);

    req.setAttribute("cal", cal);
//    req.setAttribute("n2", n2);
//    req.setAttribute("op", op);


    String path = "/ch05/";
    req.setAttribute("result", result);
    req.getRequestDispatcher(path + "calcResult.jsp").forward(req, resp);
//    resp.setCharacterEncoding("UTF-8");
//    resp.setContentType("text/html;");
    //resp.getWriter().println("처리중");
  }
}
