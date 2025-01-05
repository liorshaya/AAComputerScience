package termA.lesson10.Exe1;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("John", "Doe", 25, 10, 10, new User[0], new User[0]);
        User user2 = new User("Alice", "Smith", 22, 8, 3, new User[0], new User[0]);
        User user3 = new User("Bob", "Brown", 30, 5, 2, new User[0], new User[0]);
        User user4 = new User("Emma", "Johnson", 27, 6, 7, new User[0], new User[0]);
        User user5 = new User("Liam", "Davis", 28, 15, 4, new User[0], new User[0]);
        User user6 = new User("Sophia", "Miller", 24, 9, 8, new User[0], new User[0]);
        User user7 = new User("James", "Wilson", 35, 12, 1, new User[0], new User[0]);
        User user8 = new User("Isabella", "Moore", 21, 4, 5, new User[0], new User[0]);
        User user9 = new User("Lucas", "Taylor", 29, 7, 6, new User[0], new User[0]);
        User user10 = new User("Mia", "Anderson", 20, 11, 3, new User[0], new User[0]);

        user1.setFollowing(new User[]{user2, user3});
        user1.setFollowers(new User[]{user1, user2,user3,user4,user5,user6,user7,user8,user9,user10,user2});

        user2.setFollowing(new User[]{user1, user3});
        user2.setFollowers(new User[]{user5, user7});

        user3.setFollowing(new User[]{user4, user9});
        user3.setFollowers(new User[]{user2, user1});

        user4.setFollowing(new User[]{user3, user6});
        user4.setFollowers(new User[]{user8, user5});

        user5.setFollowing(new User[]{user1, user2});
        user5.setFollowers(new User[]{user4, user3});

        user6.setFollowing(new User[]{user10, user4});
        user6.setFollowers(new User[]{user8, user2});

        user7.setFollowing(new User[]{user2, user3});
        user7.setFollowers(new User[]{user4, user5});

        user8.setFollowing(new User[]{user7, user6});
        user8.setFollowers(new User[]{user2, user5});

        user9.setFollowing(new User[]{user3, user1});
        user9.setFollowers(new User[]{user10, user7});

        user10.setFollowing(new User[]{user6, user8});
        user10.setFollowers(new User[]{user8, user9});

        boolean checkValidUsername = user1.isValidName();
        System.out.println(checkValidUsername);

        boolean checkVip = user1.isVip();
        System.out.println(checkVip);




        User[] users = {user1, user2, user3, user4, user5, user6, user7, user8, user9, user10};
    }


}
