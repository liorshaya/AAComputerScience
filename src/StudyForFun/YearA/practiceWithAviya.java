package StudyForFun.YearA;

public class practiceWithAviya {
    public static void main(String[] args) {
        int result1 = func1("hello", 'l');
        System.out.println(result1);

        String[] array = {"hello", "hey","wow","abch"};
        int result2 = func2(array,'h');
        System.out.println(result2);

        char result3 = mostCommonChar("arrgfrrddfrdf");
        System.out.println(result3);

        String[] array5 = {"sddsd", "dfdfsf","gfsddf", "adfdsfddddd"};
        String result4 = func3(array5, 'd');
        System.out.println(result4);
    }
    public static int func1(String str , char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

    public static int func2(String[] array , char ch){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if(array[i].charAt(j) == ch){
                    count++;
                }
            }

        }
        return count;
    }

    public static char mostCommonChar(String text){
        int mostCharCount = 0;
        char mostChar = text.charAt(0);

        for (int i = 0; i < text.length(); i++) {
            int tempCount = 1;
            for (int j = i+1; j < text.length(); j++) {
                if(text.charAt(i) == text.charAt(j)){
                    tempCount++;

                }
            }
            if(tempCount > mostCharCount){
                mostCharCount = tempCount;
                mostChar = text.charAt(i);
            }

        }
        return mostChar;
    }

    public static String func3(String[] array, char ch){
        int maxCount = 0;
        String maxWord = array[0];
        for (int i = 0; i < array.length; i++) {
            int tempCount = 0;
            for (int j = 0; j < array[i].length(); j++) {
                if(array[i].charAt(j) == ch){
                    tempCount++;
                }
            }
            if(tempCount > maxCount){
                maxCount = tempCount;
                maxWord = array[i];
            }
        }
        return maxWord;
    }
}
