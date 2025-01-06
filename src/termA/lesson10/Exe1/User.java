package termA.lesson10.Exe1;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private int imagesCount;
    private int videosCount;
    private User[] following;
    private User[] followers;

    public User(String firstName, String lastName , int age , int imagesCount , int videosCount , User[] following , User[] followers){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.imagesCount = imagesCount;
        this.videosCount = videosCount;
        this.following = following;
        this.followers = followers;
    }

    public User[] getFollowing() {
        return this.following;
    }


    public User[] getFollowers() {
        return this.followers;
    }

    public void setFollowing(User[] following) {
        this.following = following;
    }

    public void setFollowers(User[] followers) {
        this.followers = followers;
    }



    public boolean isValidName(){
        for (int i = 0; i < this.firstName.length(); i++) {
            char currChar = this.firstName.charAt(i);
            if(currChar >= '0' && currChar <='9'){
                return false;
            }
        }
        for (int i = 0; i < this.lastName.length(); i++) {
            char currChar = this.lastName.charAt(i);
            if(currChar >= '0' && currChar <= '9'){
                return false;
            }
        }
        return true;
    }


    public boolean isVip(){
        if(isValidName()){
            if(this.imagesCount >= 10){
                if (this.videosCount >= 10){
                    int counter = 0;
                    for (int i = 0; i < followers.length; i++) {
                        if (followers[i].isValidName()){
                            counter++;
                        }
                    }
                    if(counter >= 10){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int countMutualConnections(){
        int counter = 0;
        for (int i = 0; i < this.following.length; i++) {
            for (int j = 0; j < this.followers.length; j++) {
                if(this.following[i] == this.followers[j]){
                    counter++;
                }
            }
        }
        return counter;
    }

    public void removeFakeUsers(){
        int count = 0;
        for (int i = 0; i < following.length; i++) {
            User currUser = this.followers[i];
            if(!this.following[i].isValidName()){
               count++;
           }
           if(this.following[i].imagesCount == 0) {
               count++;
           }
           if(this.following[i].videosCount == 0){
               count++;
           }
           if(this.following[i].countMutualConnections() == 0){
               count++;
           }
           if(count >= 3){
               User[] newFollowing = new User[this.following.length - 1];
               for (int j = 0; j < this.following.length; j++) {
                   if (this.following[i] == currUser){
                       continue;
                   }
                   newFollowing[i] = this.following[i];
               }
               User[] newFollowers = new User[this.followers.length - 1];
               boolean isInFollowers = false;
               for (int j = 0; j < this.following.length; j++) {
                   if (this.followers[j] == currUser){
                       isInFollowers = true;
                       continue;
                   }
                   newFollowers[j] = this.followers[j];
               }
               if (isInFollowers){
                   this.followers = newFollowers;
               }

           }
       }
    }
}
