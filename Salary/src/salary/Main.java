//�������� ���� Main � ����� ���������� ���� �� ����� ������ ���������� ������ � ������ ����������.
package salary;

public class Main {

	public static void main(String[] args) {

		EmployeeHoursSalary employeeHoursSalary = new EmployeeHoursSalary(160, 20);

		System.out.println(employeeHoursSalary.salary());

		EmployeeFixedSalary employeeFixedSalary = new EmployeeFixedSalary(22, 200);

		System.out.println(employeeFixedSalary.salary());
	}
}
