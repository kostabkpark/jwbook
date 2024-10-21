package com.example.jwbook.ch04;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    int n1 = Integer.parseInt(req.getParameter("n1"));
    int n2 = Integer.parseInt(req.getParameter("n2"));
    String op = req.getParameter("op");
    int result=0;
    log.info("number 1 ==> {}" , n1);
    log.info("number 2 ==> {}" , n2);
    log.info("op ==> {}" , op);
    req.setAttribute("n1", n1);
    req.setAttribute("n2", n2);
    req.setAttribute("op", op);
    switch (op) {
      case "+":
        result = n1 + n2;
        break;
      case "-":
        result = n1 - n2;
        break;
      case "*":
        result = n1 * n2;
        break;
      case "/":
        if (n2 == 0) {
          throw new ServletException("0으로는 나눌 수 없습니다.");
        }
        result = n1 / n2;
        break;
      default:
        throw new ServletException("Invalid operator");
    }

    req.setAttribute("result", result);
    req.getRequestDispatcher("/calcResult.jsp").forward(req, resp);
//    resp.setCharacterEncoding("UTF-8");
//    resp.setContentType("text/html;");
    //resp.getWriter().println("처리중");
  }
}
