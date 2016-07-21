
public class AllWork {
	Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;

	AllWork() {
		this.freePlacesForTasks = 10;
		this.tasks = new Task[freePlacesForTasks];
		this.currentUnassignedTask=0;
	}
	
	public void addTask(Task task){
		if(this.tasks.length-freePlacesForTasks<10){
			this.tasks[this.tasks.length-freePlacesForTasks]=task;
			this.setFreePlacesForTasks(this.freePlacesForTasks-1);
		}
	}
	
	public Task getNextTask(){
		this.setCurrentUnassignedTask(this.getCurrentUnassignedTask()+1);
		return this.tasks[this.getCurrentUnassignedTask()-1];
	}
	
	public boolean isAllWorkDone(){
		for(int index=0; index<this.tasks.length; index++){
			if(this.tasks[index].getWorkingHours()!=0){
				return false;
			}
		}
		return true;
	}
	
	

	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}

	public void setFreePlacesForTasks(int freePlacesForTasks) {
		if (freePlacesForTasks > -1 && freePlacesForTasks < 11) {
			this.freePlacesForTasks = freePlacesForTasks;
		}
	}

	public int getCurrentUnassignedTask() {
		return currentUnassignedTask;
	}

	public void setCurrentUnassignedTask(int currentUnassignedTask) {
		if (currentUnassignedTask > -1 && currentUnassignedTask < 11) {
			this.currentUnassignedTask = currentUnassignedTask;
		}
	}

}
