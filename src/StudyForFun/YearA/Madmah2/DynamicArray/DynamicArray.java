package StudyForFun.YearA.Madmah2.DynamicArray;

public class DynamicArray {
    private int[] array;

    public DynamicArray(){
        this.array = new int[0];
    }

    public int size(){
        return this.array.length;
    }

    public void add(int value){
        int[] newArray = new int[this.array.length+1];

        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        newArray[array.length] = value;
        this.array = newArray;
    }

    public int get(int index){
        return array[index];
    }

    public void removeByIndex(int index){
        if(this.array.length-1 < index){
            return;
        }
        int[] newArray = new int[array.length-1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i != index){
                newArray[j] = this.array.length;
                j++;
            }
        }
        this.array = newArray;
    }

    public void removeByValue(int value){
    int count = 0;
        for (int i = 0; i < this.array.length; i++) {
            if(array[i] == value){
                count++;
            }
        }
        int[] newArray = new int[this.array.length-count];
        int index = 0;
        for (int i = 0; i < this.array.length; i++) {
            if(array[i] != value){
                newArray[index] = this.array[i];
                index++;
            }
        }
        this.array = newArray;
    }

    public void insert(int index, int value){
        int[] newArray = new int[array.length+1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(index == i){
                newArray[j] = value;
                j++;
            } else {
                newArray[j] = array[i];
                j++;
            }
        }
        this.array = newArray;
    }

    public String toString(){
        String printArray = "";
        for (int i = 0; i < array.length; i++) {
            printArray += array[i] + ",";
        }
        return printArray;
    }
}
