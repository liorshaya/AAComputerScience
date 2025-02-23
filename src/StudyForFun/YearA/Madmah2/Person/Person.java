package StudyForFun.YearA.Madmah2.Person;

public class Person {
    private String name;
    private int age;
    private Person[] children;
        
    public Person(String name , int age){
        this.name = name;
        this.age = age;
        this.children = new Person[0];
    }
    
    public boolean hasChildern(){
        return this.children.length > 0;
    }

    public boolean isGrandFather(){
        if(hasChildern()){
            for (int i = 0; i < this.children.length; i++) {
                if(children[i].hasChildern() ){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addChild(Person child){
        if(this.age - child.age > 18){
            Person[] newArray = new Person[this.children.length+1];
            for (int i = 0; i < this.children.length; i++) {
                newArray[i] = this.children[i];
            }
            newArray[this.children.length] = child;
            this.children = newArray;
            return true;
        }
        return false;
    }

    public Person getYoungestChild(){
        if(hasChildern()){
            int youngestAge = this.children[0].age;
            Person youngestPer = this.children[0];
            for (int i = 0; i < this.children.length; i++) {
                if(youngestAge > this.children[i].age){
                    youngestAge = this.children[i].age;
                    youngestPer = this.children[i];
                }
            }
            return youngestPer;
        }
        return null;
    }
    
    public char mostCommonStartingLetter(){

        int arrSize = 1;

        if(hasChildern()){
            arrSize += this.children.length;
        }

        if(isGrandFather()){
            for (int i = 0; i < this.children.length; i++) {
                if(this.children[i].hasChildern()){
                    arrSize += this.children[i].children.length;
                }
            }
        }
        char[] newArray = new char[arrSize];

        newArray[0] = this.name.charAt(0);
        int index = 1;
        if(hasChildern()){
            for (int i = 0; i < this.children.length; i++) {
                newArray[index] = this.children[i].name.charAt(0);
                index++;
            }
        }

        if(isGrandFather()){
            for (int i = 0; i < this.children.length; i++) {
                for (int j = 0; j < this.children[i].children.length; j++) {
                    newArray[index] = this.children[i].children[j].name.charAt(0);
                    index++;
                }
            }
        }

        char mostCommonLetter = '\0';
        int mostCount = 0;

        for (int i = 0; i < newArray.length; i++) {
            int currCount = 0;
            for (int j = i+1; j < newArray.length; j++) {
                if(newArray[i] == newArray[j]){
                    currCount++;
                }
            }
            if(currCount > mostCount){
                mostCount = currCount;
                mostCommonLetter = newArray[i];
            }
        }
        return mostCommonLetter;
    }

    public String toString(){
        return this.name + "age: " + this.age;
    }

    public int compareGrandchildren(Person other){
        int meGF = this.countChilders();
        int otherGF = other.countChilders();

        if(meGF > otherGF){
            return 1;
        } else if (otherGF > meGF) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public int countChilders(){
        int count = 0;
        for (int i = 0; i < this.children.length; i++) {
            count+= this.children[i].children.length;
        }
        return count;
    }
}
