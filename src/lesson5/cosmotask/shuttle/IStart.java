package lesson5.cosmotask.shuttle;

//Создаем интерфейс IStart.
//В интерфейсе определяем методы:
//• предстартовая проверка систем(возвращает true/false)
//• запуск двигателей(void)
//• старт(void)

public interface IStart {
    boolean systemCheck();

    void engineStart();

    void start();
}
