package StudyForFun.YearA;

public class PracticeCourse {
    public static void main(String[] args) {
        int[] array = {4,7,1,4,7,1,4,7,1,4,7,1};
        boolean result = isXCopyArray(array,4);
        System.out.println(result);
    }
    public static boolean isXCopyArray(int[] array, int x){
    if(array.length % x == 0){
        int[] part = new int[array.length / x];
        for (int i = 0; i < part.length; i++) {
            part[i] = array[i];
        }
        int[] duplicatePart = new int[array.length];
        for (int i = 0; i < duplicatePart.length; i++) {
            duplicatePart[i] = part[i % (array.length/x)];
        }

        for (int i = 0; i < duplicatePart.length; i++) {
            if(array[i] != duplicatePart[i]){
                return false;
            }
        }
        return true;
    }
    return false;
    }
}
