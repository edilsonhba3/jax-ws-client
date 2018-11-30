
package ws.client.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ws.client.Employee;
import ws.client.EmployeeService;
import ws.client.EmployeeServiceImpl;

public class TestWsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            EmployeeService ser = new EmployeeService();
            EmployeeServiceImpl se = ser.getEmployeeServiceImplPort();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TestWsServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>count employees from ws " + se.getEmployeeList().size() + "</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Long id = Long.parseLong(request.getParameter("id"));
        String name = (String) request.getParameter("name");
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            EmployeeService ser = new EmployeeService();
            EmployeeServiceImpl se = ser.getEmployeeServiceImplPort();
            
            
            Employee emp = new Employee();
            emp.setId(id);
            emp.setName(name);
            
            
            System.out.println("id " +id);
            System.out.println("name " +name);
            
            
            
            se.createEmployee(emp);
            System.out.println("created successfull");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TestWsServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>employee created successfull.</h3>");
            out.println("<h3>count employees from ws " + se.getEmployeeList().size() + "</h3>");
            
            out.println("<p><a href='/jax-ws-client'>home</a></p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
