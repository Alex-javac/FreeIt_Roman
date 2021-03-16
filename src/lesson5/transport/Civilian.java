package lesson5.transport;
//В классе Гражданский добавляются поля:
// - Кол-во пассажиров
// - Наличие бизнес класса (true/false)
//
// разработать метод описание который будет возвращать составленную строку с описанием всех характеристик объекта.
// В строку включить ещё один параметр мощность в киловаттах (кВ) .
// Расчёт мощности в киловаттах производится в отдельном методе : 1 л.с = 0.74 кВ
//
// Для Гражданских самолётов разработать метод который проверит можно ли разместить в него xxx  пассажиров
//Метод должен проверять если это кол-во пассажиров помещается в самолёт то выводит в консоль ”самолёт загружен”,
// если кол-во пассажиров которое нужно загрузить больше чем то которое может влезть в наш самолёт то выводим
// “Вам нужен самолёт побольше ”.

public class Civilian extends Air{
int passengers;
boolean businessClass;

    public Civilian(int enginePower, int maxSpeed, int weight, String brand, int wingspan, int minLandingStrip, int passengers, boolean businessClass) {
        super(enginePower, maxSpeed, weight, brand, wingspan, minLandingStrip);
        this.passengers = passengers;
        this.businessClass = businessClass;
    }

    public void boarding(int people){
        if(people<=passengers){
            System.out.println("Самолет загружен");
        }else {
            System.out.println("Вам нужен самолет побольше");
        }
    }

    public double kilowatt(int enginePower){
        return enginePower*0.74;
    }
    @Override
    public String toString() {
        return "Civilian{" +
                "wingspan=" + wingspan +
                ", minLandingStrip=" + minLandingStrip +
                ", passengers=" + passengers +
                ", businessClass=" + businessClass +
                ", enginePower=" + enginePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                ", Kw= " + kilowatt(enginePower) +
                '}';
    }
}
