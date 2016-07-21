
public class AllWork {
	private static final int RIGHT_END_OF_OPEN_INTERVAL_FOR_FREE_PLACES = 11;
	private static final int LEFT_END_OF_OPEN_INTERVAL_FOR_FREE_PLACES = -1;
	private static final int NUMBER_OF_TASKS = 10;
	Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;

	AllWork() {
		this.freePlacesForTasks = NUMBER_OF_TASKS;
		this.tasks = new Task[freePlacesForTasks];
		this.currentUnassignedTask=0;
	}
	
	public void addTask(Task task){
		if(this.tasks.length-freePlacesForTasks<NUMBER_OF_TASKS){
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
		if (freePlacesForTasks > LEFT_END_OF_OPEN_INTERVAL_FOR_FREE_PLACES && freePlacesForTasks < RIGHT_END_OF_OPEN_INTERVAL_FOR_FREE_PLACES) {
			this.freePlacesForTasks = freePlacesForTasks;
		}
	}

	public int getCurrentUnassignedTask() {
		return currentUnassignedTask;
	}

	public void setCurrentUnassignedTask(int currentUnassignedTask) {
		if (currentUnassignedTask > LEFT_END_OF_OPEN_INTERVAL_FOR_FREE_PLACES && currentUnassignedTask < RIGHT_END_OF_OPEN_INTERVAL_FOR_FREE_PLACES) {
			this.currentUnassignedTask = currentUnassignedTask;
		}
	}

}
