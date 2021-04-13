package lesson9.additionTask.task2;
//Создаём класс TextFormater
//в котором два статических метода:
//1. Метод принимает строку и возвращает кол-во слов в строке.
//2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//есть возвращает true, если нет false
public class TextFormater {
    public static int countWords(String str){
        int count=0;
        String word = str.replaceAll("\\w+");
        return count;
    }
    public static boolean isPalindrome(String str){
        boolean flag= true;
return flag;
    }

    public static void main(String[] args) {
        String str = "пришла мадам в магазин за водкой, и говорит я тут одна такая?";
        System.out.println(countWords(str));
        System.out.println(isPalindrome(str));
    }
}
