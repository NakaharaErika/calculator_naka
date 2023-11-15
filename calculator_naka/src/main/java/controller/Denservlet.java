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
		//隠し演算子欄と入力値欄と直近値欄をクリア
		request.setAttribute("nextOperation", "");
		request.setAttribute("result", "");
		request.setAttribute("resultFinal", "");
		request.setAttribute("equalPressed", "");
		
		String view = "/WEB-INF/views/calcu.jsp";
        request.getRequestDispatcher(view).forward(request, response);
	}
	
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String previousValue = request.getParameter("previousValue");//直近値
        String currentValue = request.getParameter("currentValue");//入力値
        String operation = request.getParameter("operation");//演算子
        String subOperation = request.getParameter("subOperation");//隠し演算子
        String equalPressed = request.getParameter("equalPressed");//イコールフラグ
        
        String result = "";
        
        try {
            double prevVal = Double.parseDouble(previousValue);//String型から変換
            double currVal = Double.parseDouble(currentValue);//String型から変換
            result = performOperation(prevVal, currVal, operation);//直近値と入力値と演算子を渡して計算
            request.setAttribute("nextOperation", subOperation);//隠し演算子欄に入力した演算子を入れるに入れる
        } catch (Exception e) {
            result = "エラー";
        }
        
        if ("true".equals(equalPressed)) {//イコールボタンを押した時か、演算子ボタンを押した時かで、結果値を入れる場所を変える
            request.setAttribute("resultFinal", result);//イコールフラグが立っている時は、結果を入力値欄にでかでかと表示
            request.setAttribute("result", "");
            request.setAttribute("equalPressed", "true");//イコールフラグを立てっぱなしにしておいて、上書きを防ぐ
        } else {
            request.setAttribute("result", result);//結果値欄に表示
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
                return "変なことしないでね";
        }

        if (result == (long) result) {
            return String.format("%d", (long) result);
        } else {
            return String.format("%s", result);
        }
    }
    
   
    
}
