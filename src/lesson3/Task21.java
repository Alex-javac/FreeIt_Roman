package lesson3;

//Напишите три цикла выполняющих многократное сложение строк, один с
//помощью оператора сложения и String, другой с помощью StringBuilder и метода
//append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
public class Task21 {
    public static void main(String[] args) {
        String string = new String();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

// String--------------------------------------------------

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            string += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Скороть выполнения String: " + (endTime - startTime) + "мс");

//StringBuilder---------------------------------------------

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Скороть выполнения StringBuilder: " + (endTime2 - startTime2) + "мс");

//StringBuffer----------------------------------------------

        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append(i);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("Скороть выполнения StringBuffer: " + (endTime3 - startTime3) + "мс");
    }
}
