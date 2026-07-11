package com.fakenews;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/news")
public class NewsServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String newsText = request.getParameter("newsText");

        String prediction;
        String reason;

        String lowerText = newsText.toLowerCase();

        if (lowerText.contains("shocking") ||
            lowerText.contains("100% guaranteed") ||
            lowerText.contains("miracle") ||
            lowerText.contains("click here") ||
            lowerText.contains("unbelievable")) {
            prediction = "Fake News";
            reason = "The text contains suspicious words often used in misleading content.";
        } else {
            prediction = "Real News";
            reason = "The text looks normal and does not contain obvious misleading keywords.";
        }

        request.setAttribute("newsText", newsText);
        request.setAttribute("prediction", prediction);
        request.setAttribute("reason", reason);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}