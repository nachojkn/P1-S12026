package intro;


import java.util.Scanner;

public class EjStrings_2 {

    public static int charInString(String word, char c) {
        int wordLen = word.length();
        int answer = 0;
        for (int i = 0; i < wordLen; i++) {
            if (word.charAt(i) == c){
                answer++;
            }
        }
        return answer;
    }

    public static boolean palindrome(String word) {
        int wordLen = word.length();
        int contMatch = 0;
        int mitadWord = wordLen/2; //Math.floorDiv(wordLen,2);

        for (int i = 0; i < mitadWord; i++){
            if (word.charAt(i) == word.charAt(wordLen - 1 - i)){
                contMatch++;
            }else{
                return false;
            }

        }

        return contMatch == mitadWord;

    }

    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a word:");
        String word = scan.next();
        /*
        System.out.println("Input a single character:");
        String characterOfInterest = scan.next();
        char c = characterOfInterest.charAt(0);
        */
        //System.out.println(charInString(word,c));
        System.out.println(palindrome(word));

    }
}
