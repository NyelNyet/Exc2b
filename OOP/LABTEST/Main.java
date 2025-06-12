package LABTEST;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Member mAli = new StandardMember("Ali Boestaman","M001",true);
        Member mBorhanuddin = new PremiumMember("Borhanuddin", "M002", "Coach Razak",true);
        Member mAmnah = new StandardMember("Cik Amnah", "M003", false);

        GroupClass gcArchery = new GroupClass("Archery", "Tuesday 6:00 PM", 20);
        GroupClass gcSwimming = new GroupClass("Swimming", "Wednesday 7:00 AM", 15);
        PersonalTraining pt = new PersonalTraining("Mike", 60);

        List<Member> memberList = new ArrayList<>(Arrays.asList(mAli,mBorhanuddin,mAmnah));
        List<Attendable> actionList = new ArrayList<>(Arrays.asList(gcArchery,gcSwimming,pt));


        memberList.forEach(x ->{
            x.displayMemberDetail();
            System.out.println();
        });

        System.out.println();

        actionList.forEach(x ->{
            System.out.println("---Activity Actions---");
            System.out.println(x.attendSession());
            System.out.println(x.cancelSession());
            System.out.println();
        });
    }
    
    
}
