package termA.lesson10.Ex2;

public class Main {
    public static void main(String[] args) {
        Task[] allTasks = new Task[11];

        Team team1 = new Team();
        team1.teamName = "Monsters";

        Team team2 = new Team();
        team2.teamName = "The Hero's";

        Member member1 = new Member();
        member1.firstName = "Nehorai";
        member1.lastName = "Tubul";
        member1.yearsInTech= 5;
        member1.yearsInCompany= 2;
        member1.team = team1;

        Member member2 = new Member();
        member2.firstName = "Avi";
        member2.lastName = "Bavi";
        member2.yearsInTech = 4;
        member2.yearsInCompany = 1;
        member2.team = team2;

        Member member3 = new Member();
        member3.firstName = "Benni";
        member3.lastName = "Meni";
        member3.yearsInTech= 2;
        member3.yearsInCompany= 3;
        member3.team = team1;

        Member member4 = new Member();
        member4.firstName = "Lior";
        member4.lastName = "Or";
        member4.yearsInTech= 5;
        member4.yearsInCompany= 7;
        member4.team = team1;

        Member member5 = new Member();
        member5.firstName = "Moti";
        member5.lastName = "Luhim";
        member5.yearsInTech= 20;
        member5.yearsInCompany= 14;
        member5.team = team2;

        team1.teamLeader = member1;
        team2.teamLeader = member2;



        allTasks[0] = new Task();
        allTasks[0].leaderTask = member2;
        allTasks[0].statusTask = 2;

        allTasks[1] = new Task();
        allTasks[1].leaderTask = member3;
        allTasks[1].statusTask = 1;

        allTasks[2] = new Task();
        allTasks[2].leaderTask = member3;
        allTasks[2].statusTask = 2;

        allTasks[3] = new Task();
        allTasks[3].leaderTask = member1;
        allTasks[3].statusTask = 2;

        allTasks[4] = new Task();
        allTasks[4].leaderTask = member3;
        allTasks[4].statusTask = 1;

        allTasks[5] = new Task();
        allTasks[5].leaderTask = member5;
        allTasks[5].statusTask = 2;

        allTasks[6] = new Task();
        allTasks[6].leaderTask = member5;
        allTasks[6].statusTask = 2;

        allTasks[7] = new Task();
        allTasks[7].leaderTask = member4;
        allTasks[7].statusTask = 2;

        allTasks[8] = new Task();
        allTasks[8].leaderTask = member3;
        allTasks[8].statusTask = 2;

        allTasks[9] = new Task();
        allTasks[9].leaderTask = member5;
        allTasks[9].statusTask = 2;

        allTasks[10] = new Task();
        allTasks[10].leaderTask = member3;
        allTasks[10].statusTask = 2;

        System.out.println(mostProductiveMember(allTasks).lastName);


    }
    public static Member mostProductiveMember (Task[] allTasks){
        int mostCounter = 0;
        Member mostTaskMember = allTasks[0].leaderTask;
        for (int i = 0; i < allTasks.length; i++) {
            int count = 0;
            if(allTasks[i].statusTask == 2 && (allTasks[i].leaderTask.team.teamLeader != allTasks[i].leaderTask)){
                Member currentMember = allTasks[i].leaderTask;
                for (int j = 0; j < allTasks.length; j++) {
                    if(currentMember == allTasks[j].leaderTask){
                        count++;
                    }
                }
                if(count > mostCounter){
                    mostTaskMember = currentMember;
                    mostCounter = count;
                }
            }
        }
        return mostTaskMember;
    }
}
