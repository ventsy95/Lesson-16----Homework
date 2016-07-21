
public class Office {

	public static void main(String[] args) {
		int day = 1;
		AllWork office = new AllWork();
		Task writeDocument = new Task("Writing a document", 8);
		Task writeProgram = new Task("Writing a program", 6);
		Task callClient = new Task("Calling clients", 10);
		Task receiveCall = new Task("Receiving calls from clients", 8);
		Task bossAroundPeople = new Task("Bossing people around", 4);
		Task printDocument = new Task("Printing documents", 3);
		Task makeSchedule = new Task("Making a schedule", 2);
		Task helpInterns = new Task("Helping interns", 9);
		Task makeAMeeting = new Task("Making a meeting", 2);
		Task sendPackage = new Task("Sending packages", 8);
		office.addTask(writeProgram);
		office.addTask(writeDocument);
		office.addTask(callClient);
		office.addTask(receiveCall);
		office.addTask(bossAroundPeople);
		office.addTask(printDocument);
		office.addTask(makeSchedule);
		office.addTask(helpInterns);
		office.addTask(makeAMeeting);
		office.addTask(sendPackage);
		Employee joro = new Employee("Joro");
		Employee jivka = new Employee("Jivka");
		Employee ivan = new Employee("Ivan");
		Employee ivelina = new Employee("Ivelina");
		Employee.setAllWork(office);
		
		while (true) {
			joro.startWorkingDay();
			jivka.startWorkingDay();
			ivan.startWorkingDay();
			ivelina.startWorkingDay();
			joro.work(day, office.getNextTask());
			jivka.work(day, office.getNextTask());
			ivan.work(day, office.getNextTask());
			ivelina.work(day, office.getNextTask());
			if (office.isAllWorkDone()) {
				break;
			} else {
				day += 1;
				continue;
			}
		}

	}

}
