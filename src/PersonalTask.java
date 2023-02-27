public class PersonalTask extends Task{


    public PersonalTask(String nameTask, String targetOfTask, int timeHour, int timeMinute, int priority, int deadLineH, int deadLineM) {
        super(nameTask, targetOfTask, timeHour, timeMinute, priority, deadLineH, deadLineM);

    }

    @Override
    public String getPerson() {
        return "Личные задачи.";
    }
}