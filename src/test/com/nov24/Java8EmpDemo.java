package test.com.nov24;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8EmpDemo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(1, 1000));
		empList.add(new Employee(2, 1000));
		empList.add(new Employee(3, 1500));
		empList.add(new Employee(4, 2000));
		empList.add(new Employee(5, 2500));
		empList.add(new Employee(6, 3500));

		// 1. sorting employee in descending order
		// 2. fetching top 3 salaried employee just added .limit(3)
		// 3. Fetch all employees having salary less than 3rd higest salary : for this
		// just replace .limit with .skip()
		List<Employee> empSortedList = empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.limit(3).collect(Collectors.toList());
		System.out.println("empSortedList :" + empSortedList);

	}

}
