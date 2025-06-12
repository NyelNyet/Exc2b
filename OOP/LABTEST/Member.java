package LABTEST;

public abstract class Member {
    private String memberId;
    private String name;
    private String membershipType;
    private boolean isActive;

    public Member(String name, String memberId, String membershipType, boolean isActive){
        this.name = name;
        this.memberId = memberId;
        this.membershipType = membershipType;
        this.isActive = isActive;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMembershipType() {
        return membershipType;
    }
    
    public String getName() {
        return name;
    }

    public abstract double calculateAnnualFess();

    public void displayMemberDetail(){
        System.out.println("\n---Member Details---"+
                           "\nMember ID: "+this.memberId+
                           "\nName: "+this.name+
                           "\nActive Status: "+(isActive ? "Active":"Inactive")+
                           "\nMembership Type: "+this.membershipType);
        System.out.printf("Annual Fees: $%.2f",this.calculateAnnualFess());
    }
}
