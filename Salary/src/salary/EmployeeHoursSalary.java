//�������� ���� ��������� � ���������� ���������, �� ���� ��������� � ���������� ������� ���������.
//���������� ������ ���������� � ������ : ��������� � ���������� �� ��������� �
//���������� ������� ������. ������� ���������� �������. 

package salary;

public class EmployeeHoursSalary implements Salary{

	private int amountOfWorkedHours;
	private int uanPerHour;
	private int hoursSalary;
	
	
	public EmployeeHoursSalary(int amountOfWorkedHours, int uanPerHour) {
		this.amountOfWorkedHours = amountOfWorkedHours;
		this.uanPerHour = uanPerHour;
	}


	public int getAmountOfWorkedHours() {
		return amountOfWorkedHours;
	}


	public void setAmountOfWorkedHours(int amountOfWorkedHours) {
		this.amountOfWorkedHours = amountOfWorkedHours;
	}


	public int getUanPerHour() {
		return uanPerHour;
	}


	public void setUanPerHour(int uanPerHour) {
		this.uanPerHour = uanPerHour;
	}


	public int getHoursSalary() {
		return hoursSalary;
	}


	public void setHoursSalary(int hoursSalary) {
		this.hoursSalary = hoursSalary;
	}


	@Override
	public int salary() {
		hoursSalary = amountOfWorkedHours * uanPerHour;
		return hoursSalary;
	}

}
