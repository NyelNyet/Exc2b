package LABTEST;

public class StandardMember extends Member{

    public StandardMember(String name, String memberId, boolean isActive){
        super(name,memberId,"Standard", isActive);
    }

    @Override
    public void displayMemberDetail() {
        super.displayMemberDetail();
    }

    @Override
    public double calculateAnnualFess() {
        return 500;
    }
}
