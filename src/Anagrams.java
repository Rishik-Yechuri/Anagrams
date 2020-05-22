import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[]{scanner.next().toLowerCase(),scanner.next().toLowerCase()};
        int[][] numberEachLetterAppears = new int[2][27];
        for(int y=0;y<2;y++){
            for(int x=0;x<words[y].length();x++){
                char letter = words[y].charAt(x);
                int valueInAlphabet = letter-96;
                numberEachLetterAppears[y][valueInAlphabet]++;
            }
        }
        boolean anagram = true;
        for(int x=1;x<27;x++){
            if (numberEachLetterAppears[0][x]!=numberEachLetterAppears[1][x]){
                anagram = false;
            }
        }
        if(anagram){

        }else{

        }
    }
}
