package lesson5.transport;
//В классе Транспорт есть поля:
//- Мощность(в лошадиных силах)
// - Максимальная скорость(км/ч)
// - Масса (кг)
// - Марка( например: Audi, BMW , Boing,  Airbus,  Scania , МАЗ и т.д. )
public abstract class Transport {
int enginePower;
int maxSpeed;
int weight;
String brand;

    public Transport(int enginePower, int maxSpeed, int weight, String brand) {
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }
}
