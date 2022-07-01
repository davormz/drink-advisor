package com.platzi.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.platzi.app.service.BeerSelectorService;
import com.platzi.app.service.SimpleBeerExpert;

public class BeerSelectorController extends HttpServlet {

    private BeerSelectorService beerSelectorService = new SimpleBeerExpert();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String beerColor = request.getParameter("color");
        List<String> brands = beerSelectorService.getBrands(beerColor);
        request.setAttribute("brands", brands);
        RequestDispatcher view = request.getRequestDispatcher("pages/results.jsp");
        view.forward(request, response);
    }
    
}
