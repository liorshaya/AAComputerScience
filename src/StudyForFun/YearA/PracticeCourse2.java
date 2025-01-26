package StudyForFun.YearA;

public class PracticeCourse2 {
    public static void main(String[] args) {
        String[] array = {"Apple","Home","Friend","Today","Baby","Black"};
        printArray(arrayWith5DiditWords(array,5));
    }
    public static String[] arrayWith5DiditWords(String[] array , int size){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() == size){
                count++;
            }
        }
        String[] newArray = new String[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() == size){
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }

    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
