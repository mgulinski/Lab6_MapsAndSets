package lab6_mapsandsets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lab6_MapsAndSets {

    public static void main(String[] args) {
	//creating 4 employee objects
	Employee mg = new Employee(333, "Machi", "Gulinski", "333-33-3333");
	Employee ad = new Employee(222, "Alex", "Druzny", "222-22-2222");
	Employee sg = new Employee(555, "Seba", "Gulinski", "555-55-5555");
	Employee eg = new Employee(111, "Evan", "Gulinski", "333-33-3333");


	Map<String, Employee> empmap = new HashMap<String, Employee>();

	empmap.put("333-33-3333", mg);
	empmap.put("222-22-2222", ad);
	empmap.put("555-55-5555", sg);
	empmap.put("333-33-3333", eg);

	// retrieving object using object name and calling its toString
	System.out.println("\nRetrieving employee info using object name:");
	System.out.println(mg);

	// retrieving object info using object's key
	System.out.println("\nRetrieving employee info using object key:");

	Employee e = empmap.get("333-33-3333");
	System.out.println("Retrieving employee with ssn: 333-33-3333: " + e);


	System.out.println("\nDisplay all the employees");

	Set<String> keys = empmap.keySet();

	for (String key : keys) {

	    Employee employee = empmap.get(key);
	    System.out.println(employee);
	}

	// adding employees to collection and using collections.sort to sort the list
	System.out.println("\nAdding employees to Collection in order to sort:\n");
	Collection<Employee> employees = empmap.values();

	List<Employee> emplist = new ArrayList<Employee>(employees);

	Collections.sort(emplist);

	for (Employee emp : emplist) {

	    System.out.println(emp);
	}
    
	System.out.println("\nAdding employees to TreeMap in order to sort:\n");
	
	Map<String, Employee> treemp = new TreeMap<String, Employee>();
	
	treemp.put("333-33-3333", mg);
	treemp.put("222-22-2222", ad);
	treemp.put("555-55-5555", sg);
	treemp.put("333-33-3333", eg);
	
	
	System.out.print("\nUsing a keyset, get the employees out of the treemp TreeMap...\n");
       
	Set keys2 = treemp.keySet();
	
        for(Object key : keys2) {
	    
            Employee temp = (Employee)treemp.get(key);
            System.out.println(temp.toString());
        }
	
    }
}
