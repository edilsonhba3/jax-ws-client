
package ws.client;

import java.util.List;

public class ConsumeWsClient {
    public static void main(String[] args) {
        EmployeeService ser = new EmployeeService();
        EmployeeServiceImpl se = ser.getEmployeeServiceImplPort();
        
        Employee emp = new Employee();
        emp.setId(1L);
        emp.setName("name 1");
        
        se.createEmployee(emp);
        
        System.out.println("created");
        
        List<Employee> employees = se.getEmployeeList();
        
        System.out.println("retrevie data");
        employees.forEach(x ->{
            System.out.println("id = " + x.getId() +" name = "+ x.getName());
        });
    }
}
