//клас Працівник з фіксованою місячною зарплатою.
//Реалізувати методи інтерфейсу в класах : Працівник з погодинною та Працівник з
//фіксованою місячною платою. Формула розрахунку довільна. 
package salary;

public class EmployeeFixedSalary implements Salary {

	private int amountOfDays;
	private int uanPerDay;
	private int fixedSalary;

	public EmployeeFixedSalary(int amountOfDays, int uanPerDay) {
		this.amountOfDays = amountOfDays;
		this.uanPerDay = uanPerDay;
	}

	public int getAmountOfDays() {
		return amountOfDays;
	}

	public void setAmountOfDays(int amountOfDays) {
		this.amountOfDays = amountOfDays;
	}

	public int getUanPerDay() {
		return uanPerDay;
	}

	public void setUanPerDay(int uanPerDay) {
		this.uanPerDay = uanPerDay;
	}

	public int getFixedSalary() {
		return fixedSalary;
	}

	public void setFixedSalary(int fixedSalary) {
		this.fixedSalary = fixedSalary;
	}

	@Override
	public int salary() {
		fixedSalary = amountOfDays * uanPerDay;
		return fixedSalary;
	}

}
