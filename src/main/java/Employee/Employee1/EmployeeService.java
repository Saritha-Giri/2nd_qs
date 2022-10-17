package Employee.Employee1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService 
{
@Autowired
MyRapo r;
public List<Employee>Display()
{
	return r.findAll();
}
public void savedata(Employee employee) 
{
r.save(employee);

}
public Employee getEmployee(long id)
{

	    return r.findById(id).get();
	}
	public void delete(long id)
	{
	    r.deleteById(id);
	}
	
	
	
}


