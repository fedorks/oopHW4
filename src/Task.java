import java.util.Calendar;

public abstract class Task {

    public final int id;
    private static int count;
    private int endTaskH;
    private int endTaskM;
    private String nameTask;
    private int priority;
    private int timeHour;
    private int timeMinute;
    private int startTaskH;
    private int startTaskM;
    static String typePerson;


    Calendar getTimeNow = Calendar.getInstance();


    public Task(String nameTask, String targetOfTask, int timeHour, int timeMinute, int priority, int endTaskH, int endTaskM) {
        count++;
        this.id = getCount();
        this.nameTask = getNameTask();
        this.startTaskH = getTimeNow.get(Calendar.HOUR_OF_DAY);
        this.startTaskM = getTimeNow.get(Calendar.MINUTE);
        this.nameTask = targetOfTask;
        this.timeHour = timeHour;
        this.timeMinute = timeMinute;
        this.priority = priority;
        this.endTaskH = endTaskH;
        this.endTaskM = endTaskM;
    }

    public String getNameTask() {
        return nameTask;
    }

    public int getTimeHour() {
        return timeHour;
    }

    public int getTimeMinute() {
        return timeMinute;
    }

    private int getCount() {
        return count;
    }

    public String getPerson() {
        return typePerson;
    }

    public String getTask() {
        return "ID: " + id + ". Старт задачи: " + startTaskH + " ч. " + startTaskM + "  мин. Раздел: "
                + getPerson() + " Суть задачи: " + nameTask + ". Время выполнения задачи: " + timeHour + " ч. "
                + timeMinute + " мин. " + ". Приоритет задачи: " + getPriority() + ". Завершить задачу: "
                + endTaskH + " ч. " + endTaskM + " мин.";
    }

    public String getPriority() {
        if (priority == 2) {
            return "Обычный";
        } else if (priority == 1) {
            return "Повышенный";
        } else if (priority == 0) {
            return "Срочный";
        }
        return "Неизвестный";
    }

    public int getEndTaskH() {
        return endTaskH;
    }

    public int getEndTaskM() {
        return endTaskM;
    }
}
