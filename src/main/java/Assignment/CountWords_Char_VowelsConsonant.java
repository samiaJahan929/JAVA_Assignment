package Assignment;

public class CountWords_Char_VowelsConsonant {
    public static void main(String[] args) {

        String string = "I am a SQA Engineer";
        String vowels = "aeiou";

        String[] str = string.split(" ");
        System.out.println("Words: " + str.length);

        String chars = string.replace(" ", "");
        System.out.println("Characters: " + chars.length());

        String lowerCase = chars.toLowerCase();

        int countVowels = 0;
        int countConsonant = 0;
        char[] charArray = lowerCase.toCharArray();

        for (char ch : charArray) {
            if (ch >= 'a' && ch <= 'z') {
                if (vowels.indexOf(ch) != -1) {
                    countVowels++;
                } else {
                    countConsonant++;
                }
            }
        }
        System.out.println("Vowels: " + countVowels);
        System.out.println("Consonant: " + countConsonant);

    }
}
