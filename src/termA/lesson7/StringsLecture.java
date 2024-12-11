package termA.lesson7;

//Ex1
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

class Ex2{
    public static void main(String[] args) {
    char[] array = {'l','i','o','r'};
    boolean result = contains(array, 'r');
    System.out.println(result);
    }

    public static boolean contains(char[] arr , char toSearch){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == toSearch){
                return true;
            }
        }
        return false;
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

class Ex4{
    public static void main(String[] args) {
        char[] array = {'l','i','o','r','o'};
        boolean result = hasDuplicates(array);
        System.out.println(result);
    }
    public static boolean hasDuplicates(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

class Ex5{
    public static void main(String[] args) {
        char[] array = {'M','A','M','A'};
        char[] result = replace(array,'M','P');
        System.out.println(result);
    }
    public static char[] replace(char[] arr , char original , char replacement){
        char[] newArray = new char[arr.length];


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == original) {
                newArray[i] = replacement;
            }
            else{
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }
}

