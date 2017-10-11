package com.tecsup.lab09.crud.app;

import com.tecsup.lab09.crud.bean.Employee;
import com.tecsup.lab09.crud.dao.EmployeeDAO;
import com.tecsup.lab09.crud.dao.EmployeeDAOimpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO dao = new EmployeeDAOimpl();
		
		int id = -1;
		
		id = dao.create("Juan", "Alberto", (double) 1500);
		
		Employee emp = dao.findById(id);
		
		System.out.println("Create .. " + emp);

		dao.update(id, "Juan2", "Alberto2", (double) 1505);
		
		emp = dao.findById(id);
		
		System.out.println("Update .. " + emp);
				
		/*dao.delete(id);

		emp = dao.findById(id);*/

		System.out.println("Delete .. " + emp);		
		
		
		for (Employee item : dao.findAll()) {
			
			System.out.println(item);
			 
		};
		
	}

}
