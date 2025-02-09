package StudyForFun.YearA.StudyToExam;

public class madmah1Ex2Part2 {

    public static void main(String[] args) {
        String text = "Hello, this is a java string";
        statistic(text);
    }
    public static void statistic(String text){
        text = text.toUpperCase();
        String isUsedChar = "";


        for (int i = 0; i < text.length(); i++) {
            char currChar = text.charAt(i);

            if(currChar == ' ' || isUsedChar.indexOf(currChar) != -1){
                continue;
            }
            int count = 1;
            for (int j = i+1; j < text.length(); j++) {
                if(currChar == text.charAt(j)){
                    count++;
                }
            }
            System.out.println(currChar + "-" + count);
            isUsedChar += currChar;
        }
    }
}

class exers13{
    public static void main(String[] args) {
        String result2 = pirukLegormim(18);
        System.out.println(result2);
    }
    public static boolean isPrimary(int number){
        for (int i = 2; i < number; i++) {
            if( number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static String pirukLegormim(int number){
        String calculation = "";
        int temp = number;
        if(isPrimary(number)){
            return number + " = " + number;
        }
        else{
            while(number % 2 == 0){
                calculation += "2 ";
                number /= 2;
                if(number > 1){
                    calculation += "* ";
                }
            }

            for (int i = 3; i < Math.sqrt(number); i+=2) {
                while (number % i == 0){
                    calculation += i +" ";
                    number /= i;
                    if(number > 1){
                        calculation += "* ";
                    }
                }
            }
            if(number > 1){
                calculation += number;
            }
            calculation += " = " + temp;
        }
        return calculation;
    }
}

class exers14{
    public static void main(String[] args) {
        String text = "אבגדהחהדגבא";
        boolean result = isPolindrom(text);
        System.out.println(result);
    }
    public static boolean isPolindrom(String text){

        int left = 0;
        int right = text.length()-1;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(left) != text.charAt(right)){
                return false;

            }
            left++;
            right--;
        }
        return true;
    }
}

class exers17{
    public static void main(String[] args) {
        String text = "I want it, I got it";
        String result = rasheTevot(text);
        System.out.println(result);
    }
    public static String rasheTevot(String text){

        String[] textArrey = text.split(" ");

        String originalRasheTevot = "";
        for (int i = 0; i < textArrey.length; i++) {
            originalRasheTevot += textArrey[i].charAt(0);
        }

        String lowerCaseText = originalRasheTevot.toLowerCase();

        String result = "";

        for (int i = 0; i < originalRasheTevot.length(); i++) {
            char currChar = originalRasheTevot.charAt(i);
            char currLowerChar = lowerCaseText.charAt(i);

            if(lowerCaseText.indexOf(currLowerChar) == i){
                result += currChar;
            }
        }
        return result;
    }
}


