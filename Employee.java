
public class Employee {
	private String name;
	private Task currentTask;
	private double hoursLeft;
	private static AllWork allWork;

	Employee(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		} else {
			System.out.println("Incorrect input.");
		}
	}

	public void startWorkingDay(){
		this.setHoursLeft(8);
	}
	
	public void work() {
		if (this.currentTask != null) {
			if (this.currentTask.getWorkingHours() - this.hoursLeft < 0) {
				this.hoursLeft -= this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
				
			} else {
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
				this.hoursLeft = 0;
			}
		} else {
			System.out.println("Current task doesn't exist.");
		}
		showReport(this.name, this.hoursLeft, this.currentTask);
	}

	public void showReport(String name, double hoursLeft, Task task) {
		System.out.println("Employee name: " + name);
		System.out.println("Task name: " + task.getName());
		System.out.println("Time left for employee: " + hoursLeft);
		System.out.println("Time left till end of task: " + task.getWorkingHours());
	}

	public String getName() {
		return name;
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		} else {
			System.out.println("Current task doesn't exist.");
		}
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		} else {
			System.out.println("Incorrect hours left.");
		}
	}
	
	public static AllWork getAllWork() {
		return allWork;
	}

	public static void setAllWork(AllWork allWork) {
		Employee.allWork = allWork;
	}

}
