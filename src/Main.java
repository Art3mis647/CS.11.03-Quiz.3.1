public class Main {

    public static char calculateGrade(int grade){
        if (grade >=90){
            return 'A';
        }
        if (grade >=80){
            return 'B';
        }
        if (grade >=70){
            return 'C';
        }
        if (grade >=60){
            return 'D';
        }
        if (grade >=50){
            return 'E';
        }
        return 'F';
    }

    public static String fizzBuzz(int n){
        String returnString = "";
        if (n%3 == 0){
            returnString = returnString + "fizz";
        }
        if (n%5 == 0){
            returnString = returnString + "buzz";
        }
        if (!(n%5 == 0) && !(n%3 == 0)){
            returnString = returnString + "unlucky";
        }
        return returnString;
    }

    public static String frontBack(String n){
        if(n.length()<2){
            return n;
        }
        String nFront = n.substring (0, 2);
        return nFront + n + nFront;
    }

    public static boolean twoAsOne(int a, int b, int c){
        return (a + b == c) || (a + c == b) || (b + c == a);
    }

    public static String endUp(String n){
        if (n.length()<3){
            return n.toUpperCase();
        }
        String nEnd = n.substring(n.length()-3).toUpperCase();
        return n.substring(0, n.length()-3) + nEnd;

    }

}
