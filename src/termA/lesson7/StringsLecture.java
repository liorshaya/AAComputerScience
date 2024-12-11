package termA.lesson7;

public class StringsLecture {

    public static void main(String[] args) {
        char[] arr1 = {1,2,3,4};
        char[] arr2 = {1,2,3,4};
        boolean result = equalData(arr1 , arr2);
        System.out.println(result);

    }
    public static boolean equalData(char[] arr1 , char[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] != arr2[i]){
                    return false;
                }
        }
        return true;
    }
}

class Ex3{
    public static void main(String[] args) {
        char[] arr = {'1','2','3','4'};
        int toFindNumber = indexOf(arr,'4');
        System.out.println(toFindNumber);
    }
    
    public static int indexOf(char[] arr, char toFind){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == toFind){
                return i;
            }
        }
        return -1;
    }
}

