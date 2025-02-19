package StudyForFun.YearA.Madmah2;

public class Act {
    private String name;
    private int length;
    private Actor[] actors;
    private int level;

    public Act(String name , int length , int level){
        this.name = name;
        this.length = length;
        this.actors = new Actor[0];
        this.level = level;
    }

    public boolean addActor(Actor toad){
        boolean toAdd = false;
        if(this.level == 0){
            toAdd = true;
        } else if (this.level == 1) {
            if(toad.getAge() >= 16 && toad.getActs() >= 3){
                toAdd = true;
            }
        } else if (this.level == 2) {
            if(toad.getAge() >= 25 && toad.getActs() >= 5){
                toAdd = true;
            }
        }
        for (int i = 0; i < this.actors.length; i++) {
            if(actors[i].equals(toad.getName()) && actors[i].getAge() == toad.getAge()){
                toAdd = false;
            }
        }

        if(toAdd){
            Actor[] newArray = new Actor[this.actors.length + 1];

            for (int i = 0; i < this.actors.length; i++) {
                newArray[i] = this.actors[i];
            }
            newArray[this.actors.length] = toad;
            this.actors = newArray;
            return true;
        }
        return false;
    }

    public static String mostExpActor(Actor[] actors){
        String mostActorName = actors[0].getName();
        int mostActs = actors[0].getActs();

        for (int i = 0; i < actors.length; i++) {
            if(actors[i].getActs() > mostActs){
                mostActs = actors[i].getActs();
                mostActorName = actors[i].getName();
            }
        }
        return mostActorName;
    }



}
