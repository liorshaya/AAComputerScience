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
}
