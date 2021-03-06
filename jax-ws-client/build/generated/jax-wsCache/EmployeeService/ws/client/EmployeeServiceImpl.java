
package ws.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeeServiceImpl", targetNamespace = "http://localhost:8080/jax-ws-server/services/v1/EmployeeService")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeServiceImpl {


    /**
     * 
     * @return
     *     returns java.util.List<ws.client.Employee>
     */
    @WebMethod
    @WebResult(name = "employee", targetNamespace = "")
    @RequestWrapper(localName = "getEmployeeList", targetNamespace = "http://localhost:8080/jax-ws-server/services/v1/EmployeeService", className = "ws.client.GetEmployeeList")
    @ResponseWrapper(localName = "getEmployeeListResponse", targetNamespace = "http://localhost:8080/jax-ws-server/services/v1/EmployeeService", className = "ws.client.GetEmployeeListResponse")
    public List<Employee> getEmployeeList();

    /**
     * 
     * @param employee
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createEmployee", targetNamespace = "http://localhost:8080/jax-ws-server/services/v1/EmployeeService", className = "ws.client.CreateEmployee")
    @ResponseWrapper(localName = "createEmployeeResponse", targetNamespace = "http://localhost:8080/jax-ws-server/services/v1/EmployeeService", className = "ws.client.CreateEmployeeResponse")
    public boolean createEmployee(
        @WebParam(name = "employee", targetNamespace = "")
        Employee employee);

}
