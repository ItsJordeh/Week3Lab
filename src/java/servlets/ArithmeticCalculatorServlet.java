/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jordan Davis
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

         String operation = request.getParameter("operation");
         String value1String = request.getParameter("value1");
         String value2String = request.getParameter("value2");
         String result;
         
        try{
        int value1 = Integer.parseInt(value1String);
        int value2 = Integer.parseInt(value2String);
        int calcValue;
        
        switch(operation)
         {
             case "+":
                 calcValue = value1 + value2;
                 result = ("Result: " + calcValue);
                 break;
                 
             case "-":
                 calcValue = value1 - value2;
                 result = ("Result: " + calcValue);
                 break;
               
             case "*":
                 calcValue = value1 * value2;
                 result = ("Result: " + calcValue);
                 break;
             
             case "%":
                 calcValue = value1 % value2;
                 result = ("Result: " + calcValue);
                 break;
             default:
                 result = "---";
                 break;
                 
         }
        
        }
        catch(NumberFormatException e)
        {
            result = "Please enter a valid number!";
        }

        request.setAttribute("result", result);
        request.setAttribute("value1", value1String);
        request.setAttribute("value2", value2String);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
        
    }

}
