package lesson4;

//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных.
public class Task24 {
    private final int hours;
    private final int minutes;
    private final int seconds;

    public Task24(int secondsAll) {
        seconds = secondsAll % 60;
        int min = (secondsAll - seconds) / 60;
        minutes = min % 60;
        hours = (min - minutes) / 60;
    }

    public Task24(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    //Метод checkTime сравнивает вызывающий объект с объектом, переданным в качестве параметра,
    //и возвращает в результате выполнения сравнения целое число:
    //положительное, если вызывающий объект больше объекта, переданного в качестве параметра;
    //отрицательное, если вызывающий объект меньше объекта, переданного в качестве параметра;
    //нуль, если объекты равны.
    public int checkTime(Task24 task24) {
        int res;
        if (task24.getSecondsAll() < getSecondsAll()) {
            res = 1;
        } else if (task24.getSecondsAll() > getSecondsAll()) {
            res = -1;
        } else {
            res = 0;
        }
        return res;
    }

    public int getSecondsAll() {
        return (hours * 60 * 60) + (minutes * 60) + seconds;
    }

    @Override
    public String toString() {
        return "Task24{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                ", secondsAll=" + getSecondsAll() +
                '}';
    }

    public static void main(String[] args) {
        Task24 t = new Task24(100000);
        System.out.println(t.toString());
        Task24 t1 = new Task24(27, 46, 40);
        System.out.println(t1.toString());
        Task24 t2 = new Task24(10000);
        System.out.println(t2.toString());
        System.out.println(t.checkTime(t1));
        System.out.println(t.checkTime(t2));
        System.out.println(t2.checkTime(t1));
    }

}
