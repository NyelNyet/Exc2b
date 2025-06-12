package LABTEST;

public class PremiumMember extends Member{
    private String trainerAssigned;

    public PremiumMember(String name, String memberId, String trainerAssigned, boolean isActive){
        super(name, memberId, "Premium", isActive);
        this.trainerAssigned = trainerAssigned;
    }

    public String getTrainerAssigned() {
        return trainerAssigned;
    }

    @Override
    public void displayMemberDetail() {
        super.displayMemberDetail();
        System.out.println("\nTrainer: "+this.getTrainerAssigned());
    }

    @Override
    public double calculateAnnualFess() {
        return 1200;
    }
    
}
