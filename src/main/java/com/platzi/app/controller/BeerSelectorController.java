package com.platzi.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.platzi.app.service.BeerSelectorService;
import com.platzi.app.service.SimpleBeerExpert;

public class BeerSelectorController extends HttpServlet {

    private BeerSelectorService beerSelectorService = new SimpleBeerExpert();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("Beer selection advice: ");
        String beerColor = request.getParameter("color");
        List<String> brands = beerSelectorService.getBrands(beerColor);
        for(String brand : brands){
            writer.println("<br>Try: <strong>" + brand + "</strong>");
        }

    }
    
}
