package lesson5.cosmotask.shuttle;

import java.util.Random;

//Создаем класс Шатл.
//Шатл реализует интерфейс IStart.
//• В методе предстартовой проверки генерируем случайное число в диапазоне от 0 до 10.
//Если сгенерированное число больше 3-х то проверка прошла успешно. Если нет не успешно.
//• В методе запуска двигателей выводим строку в консоль «Двигатели Шатла запущены. Все системы в норме.»
//• В методе старт выводим строку в консоль. «Старт Шатла»

public class Discovery implements IStart {
    Random random = new Random();

    @Override
    public boolean systemCheck() {
        int check = random.nextInt(11);
        if (check > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла Discovery запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла Discovery");
    }
}
