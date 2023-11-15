package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/calcu")
public class Denservlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("nextOperation", "");
		request.setAttribute("result", "");
		request.setAttribute("resultFinal", "");
		
		String view = "/WEB-INF/views/calcu.jsp";
        request.getRequestDispatcher(view).forward(request, response);
	}
	
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String previousValue = request.getParameter("previousValue");
        String currentValue = request.getParameter("currentValue");
        String operation = request.getParameter("operation");
        String subOperation = request.getParameter("subOperation");
        String equalPressed = request.getParameter("equalPressed");
        
        String result = "";
        
        try {
            double prevVal = Double.parseDouble(previousValue);
            double currVal = Double.parseDouble(currentValue);
            result = performOperation(prevVal, currVal, operation);
            request.setAttribute("nextOperation", subOperation);
        } catch (Exception e) {
            result = "エラー";
        }
        
        if ("true".equals(equalPressed)) {
            request.setAttribute("resultFinal", result);
            request.setAttribute("result", "");
        } else {
            request.setAttribute("result", result);
            request.setAttribute("resultFinal", "");
        }

    	String view = "/WEB-INF/views/calcu.jsp";
        request.getRequestDispatcher(view).forward(request, response);
    }

    private String performOperation(double prevVal, double currVal, String operation) {
    	double result;
        switch (operation) {
            case "+":
                result = prevVal + currVal;
                break;
            case "-":
                result = prevVal - currVal;
                break;
            case "*":
                result = prevVal * currVal;
                break;
            case "/":
                if (currVal == 0) return "無限大";
                result = prevVal / currVal;
                break;
            default:
                return "無効な演算";
        }

        if (result == (long) result) {
            return String.format("%d", (long) result);
        } else {
            return String.format("%s", result);
        }
    }
    
   
    
}
