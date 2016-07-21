
public class AllWork {
	private static final int NUMBER_OF_TASKS = 10;
	Task[] tasks;
	int freePlacesForTasks;
	int currentUnassignedTask;

	AllWork() {
		this.freePlacesForTasks = NUMBER_OF_TASKS;
		this.tasks = new Task[freePlacesForTasks];
		this.currentUnassignedTask = 0;
	}

	public void addTask(Task task) {
		if (this.tasks.length - freePlacesForTasks < NUMBER_OF_TASKS) {
			this.tasks[this.tasks.length - freePlacesForTasks] = task;
			this.freePlacesForTasks -= 1;
		}
	}

	public Task getNextTask() {
		if (this.currentUnassignedTask == this.tasks.length - 1) {
			return this.tasks[this.currentUnassignedTask];
		}
		if (this.currentUnassignedTask < this.tasks.length - 1) {
			this.currentUnassignedTask += 1;
			return this.tasks[this.currentUnassignedTask - 1];
		} else {
			System.out.println("No tasks");
			return null;
		}
	}

	public boolean isAllWorkDone() {
		for (int index = 0; index < this.tasks.length; index++) {
			if (this.tasks[index].getWorkingHours() != 0) {
				return false;
			}
		}
		return true;
	}
}
