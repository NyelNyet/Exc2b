package LABTEST;

public class PersonalTraining implements Attendable{
    private String trainerName;
    private int sessionDurationMinutes;

    public PersonalTraining(String trainerName, int sessionDurationMinutes){
        this.trainerName = trainerName;
        this.sessionDurationMinutes = sessionDurationMinutes;
    }

    @Override
    public String attendSession() {
        return "Attended personal training with "+this.trainerName+" for "+this.sessionDurationMinutes+" minutes.";
    }

    @Override
    public String cancelSession() {
        return "Cancelled personal training with "+this.trainerName+".";
    }
}
