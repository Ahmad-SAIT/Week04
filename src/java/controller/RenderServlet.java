package controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Laptop;
import model.Student;

/**
 *
 * @author aalmasri
 */
public class RenderServlet extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/first.jsp")
                .forward(request, response);
    } 

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        // I will be here
        // reding the data from the form
        Laptop l = new Laptop("Apple");
        Student s = new Student("Bob", "ABC", l);
        request.setAttribute("student", s);
        request.setAttribute("message", false);
        getServletContext().getRequestDispatcher("/WEB-INF/second.jsp")
                .forward(request, response);
    }


}
