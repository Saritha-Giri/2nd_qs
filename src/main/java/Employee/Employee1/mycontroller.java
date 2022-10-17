package Employee.Employee1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 




@Controller
public class mycontroller 
{
	@Autowired
	EmployeeService service;
	@RequestMapping("/")
	public String showHomePage(Model model)
	{
		List<Employee> list = service.Display();
		for (Employee emp : list)
		{
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getPassword()+"\t"+emp.getAddress());
			
		}
			model.addAttribute("abc", list);
			return "show";
	}
	@RequestMapping("/addData")
	public String addData(Model model)
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "addData";
	}
	@RequestMapping(value = "/save" , method = RequestMethod.POST)
	public String saveData(@ModelAttribute("employee") Employee employee)
	{
		service.savedata(employee);
		return "redirect:/";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView editData(@PathVariable(name="id") int id)
	{
		ModelAndView view = new ModelAndView("edit_data");
		Employee employee = service.getEmployee(id);
		view.addObject("employee", employee);
		return view;
	}
	@RequestMapping("/delete/{id}")
	public String daleteData(@PathVariable(name="id") int id)
	{
		service.delete(id);
		return "redirect:/";
	}
}
