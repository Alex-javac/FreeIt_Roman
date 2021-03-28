package lesson5.transport;
//В классе Воздушный добавляются поля:
// - Размах крыльев (м)
// - Минимальная длина взлётно-посадочной полосы для взлёта
public abstract class Air extends Transport{
int wingspan;
int minLandingStrip;

    public Air(int enginePower, int maxSpeed, int weight, String brand, int wingspan, int minLandingStrip) {
        super(enginePower, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minLandingStrip = minLandingStrip;
    }
}
