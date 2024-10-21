package com.example.jwbook.ch05;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/products")
public class ProductController extends HttpServlet {
    private ProductService ps = new ProductService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        String view = "";
        String path = "/ch05/";

        if(action.equals("list")) {
            // 모델에 데이터 담자.
            List<Product> products = ps.findAll();
            req.setAttribute("products", products);
            req.getRequestDispatcher(path + "productList.jsp").forward(req, resp);
        } else if(action.equals("info")) {
            // 모델에 데이터 담자.
            req.getRequestDispatcher(path + "productInfo.jsp").forward(req, resp);
        }
    }
}
