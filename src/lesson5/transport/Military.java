package lesson5.transport;
//В классе Военный  добавляются поля:
//- Наличие системы катапультирования (true/false)
//- Кол-во ракет на борту
//
// разработать метод описание который будет возвращать составленную строку с описанием всех характеристик объекта.
// В строку включить ещё один параметр мощность в киловаттах (кВ) .
// Расчёт мощности в киловаттах производится в отдельном методе : 1 л.с = 0.74 кВ
//
// Для Военных самолётов делаем метод выстрел, проверяем если кол-во ракет не равно 0 то выводим на консоль “ Ракета пошла…”, если 0 то
//“Боеприпасы отсутствуют”.
//А так же метод катапультирование, который проверит если наличие системы катапультирования true,
// то выводим “Катапультирование прошло успешно”, если false, то “У вас нет такой системы ”

public class Military extends Air{
boolean catapult;
int rockets;

    public Military(int enginePower, int maxSpeed, int weight, String brand, int wingspan, int minLandingStrip, boolean catapult, int rockets) {
        super(enginePower, maxSpeed, weight, brand, wingspan, minLandingStrip);
        this.catapult = catapult;
        this.rockets = rockets;
    }

   public void fire (){
       if(rockets>0){
           System.out.println("Ракета пошла…");
           rockets--;
       }else {
           System.out.println("Боеприпасы отсутствуют");
       }
   }
        public void bailout(){
        if(catapult){
            System.out.println("Катапультирование прошло успешно");
        }else {
            System.out.println("У вас нет такой системы");
        }
        }

    public double kilowatt(int enginePower){
        return enginePower*0.74;
    }
    @Override
    public String toString() {
        return "Military{" +
                "wingspan=" + wingspan +
                ", minLandingStrip=" + minLandingStrip +
                ", catapult=" + catapult +
                ", rockets=" + rockets +
                ", enginePower=" + enginePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                ", Kw= " + kilowatt(enginePower) +
                '}';
    }
}
