package lesson5.transport;

//В классе Грузовой добавляется  поле:
//- Грузоподъёмность(т)
//
// разработать метод описание который будет возвращать составленную строку с описанием всех характеристик объекта.
// В строку включить ещё один параметр мощность в киловаттах (кВ) .
// Расчёт мощности в киловаттах производится в отдельном методе : 1 л.с = 0.74 кВ
//
// Для грузового разработать метод который проверит можно ли загрузить в него xxx  груза
//Метод должен проверять если это кол-во груза помещается в грузовик то выводит в консоль ”Грузовик загружен”,
// если кол-во груза которое нужно загрузить больше чем то которое может влезть в наш грузовик то выводим
// “Вам нужен грузовик побольше ”.
public class Truck extends Land {
   private int carrying;

    public Truck(int enginePower, int maxSpeed, int weight, String brand, int wheels, double fuelConsumption, int carrying) {
        super(enginePower, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.carrying = carrying;
    }

    public void loadTruck(int cargo) {
        if (cargo <= carrying) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    public double kilowatt(int enginePower) {
        return enginePower * 0.74;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "wheels=" + wheels +
                ", fuelConsumption=" + fuelConsumption +
                ", enginePower=" + enginePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                ", carrying=" + carrying +
                ", Kw= " + kilowatt(enginePower) +
                '}';
    }
}
