package StudyForFun.YearA.Ex1;

public class Person {
    private String name;
    private int age;
    private Person[] children;

    public boolean hasChildren(){
        if(this.children.length > 0 ){
            return true;
        }
        return false;
    }

    public boolean isGrandFather(){
        if(hasChildren()){
            for (int i = 0; i < this.children.length; i++) {
                if(this.children[i].hasChildren()){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addChild(Person child){
        int ageDifference = this.age - child.age;
        if(ageDifference >= 18 ){
            Person[] childrenArray = new Person[this.children.length +1];
            for (int i = 0; i < this.children.length; i++) {
                childrenArray[i] = this.children[i];
            }
            childrenArray[this.children.length] = child;
            this.children = childrenArray;
            return true;
        }
        return false;
    }

    public Person getYoungestChild(){
        if(!hasChildren()){
            return null;
        }
        Person youngestChild = this.children[0];
        for (int i = 1; i < this.children.length; i++) {
            if(this.children[i].age < youngestChild.age){
                youngestChild = this.children[i];
            }
        }
        return youngestChild;
    }

    public char mostCommonStartingLetter(){
        char mostStartLetter = name.charAt(0);
        return 'g';
    }

    public int compareGrandChildren(Person other){
        int thisGrand = 0;
        int otherGrand = 0;

        for (int i = 0; i < this.children.length; i++) {
            thisGrand += this.children[i].children.length;
        }

        for (int i = 0; i < other.children.length; i++) {
            otherGrand += other.children[i].children.length;
        }

        if(thisGrand == otherGrand){
            return 0;
        }
        else if(thisGrand > otherGrand){
            return 1;
        }
        return -1;
    }
}
