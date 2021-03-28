package lesson5.transport;

//В классе Легковой добавляются поля:
//- Тип кузова
//- Кол-во пассажиров
//
// разработать метод описание который будет возвращать составленную строку с описанием всех характеристик объекта.
// В строку включить ещё один параметр мощность в киловаттах (кВ) .
// Расчёт мощности в киловаттах производится в отдельном методе : 1 л.с = 0.74 кВ
//
// Для легкового разработать метод который будет принимать время и считать сколько километров
// проедет машина двигаясь с максимальной скоростью и сколько топлива она израсходует за это время,
// результат вывести в консоль, расчёт расходуемого топлива вынести в отдельный метод private.
//
//Результат работы метода должен вывести такую строчку:
//За время (ваше введённое время) ч, автомобиль (марка автомобиля)
//двигаясь с максимальной скоростью (ваша максимальная скорость) км/ч
//проедет (xxx) км  и израсходует (xxx) литров топлива.
//
//Мой результат выглядит так:
//“За время 2,5 часа, автомобиль Audi двигаясь с максимальной скоростью 230 км/ч израсходует 46.0 литров топлива”
//
public class Car extends Land {
   private String bodyType;
   private int passengers;

    public Car(int enginePower, int maxSpeed, int weight, String brand, int wheels, double fuelConsumption, String bodyType, int passengers) {
        super(enginePower, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.bodyType = bodyType;
        this.passengers = passengers;
    }

    public void countCarTime(double time) {//время в часах
        double distance;
        double gas;
        distance = maxSpeed * time;
        gas = wastedGas(distance);

        System.out.println("За время " + time + " часа, автомобиль " + brand + " двигаясь с максимальной скоростью "
                + maxSpeed + " км/ч проедет " + distance + " км  и израсходует " + (int)gas + " литров топлива");
    }
private double wastedGas(double distance){
        return fuelConsumption * 0.01 * distance;
}

    public double kilowatt(int enginePower) {
        return enginePower * 0.74;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyType='" + bodyType + '\'' +
                ", passengers=" + passengers +
                ", wheels=" + wheels +
                ", fuelConsumption=" + fuelConsumption +
                ", enginePower=" + enginePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                ", Kw= " + kilowatt(enginePower) +
                '}';
    }
}
