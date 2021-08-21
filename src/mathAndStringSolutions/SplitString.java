package mathAndStringSolutions;

public class SplitString {
    public static void main(String[] args) {
        String string = "Разбиние строки на слова";
        String[] words = string.split("\\s"); //либо вместо "\\s" -> " "(пробел в ковычках)
        for (String subString : words) {
            System.out.println(subString);
        }
        System.out.println("----------------");

        String stringToSymbols = "Разбиение строки на буквы";
        char[] stringToArray = stringToSymbols.toCharArray();
        for (char symbol : stringToArray) {
            System.out.print(symbol + " ");
        }
    }
}
