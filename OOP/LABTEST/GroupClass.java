package LABTEST;

public class GroupClass implements Attendable{
    private String className;
    private String schedule;
    private int maxCapacity;

    public GroupClass(String className, String schedule, int maxCapacity){
        this.className = className;
        this.schedule = schedule;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String attendSession() {
        return "Attended "+this.className+" on "+this.schedule+".";
    }

    @Override
    public String cancelSession() {
        return "Cancelled "+this.className+" on "+this.schedule+".";
    }
}
