public class WorkTask extends Task{


    public WorkTask(String nameTask, String targetOfTask, int timeHour, int timeMinute, int priority, int deadLineH, int deadLineM) {
        super(nameTask, targetOfTask, timeHour, timeMinute, priority, deadLineH, deadLineM);
    }

    @Override
    public String getPerson() {
        return "Рабочие задачи.";
    }

}
