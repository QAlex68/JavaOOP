// Производный класс горячительных напитков с добавлением температуры
public class HotDrinksTemp extends HotDrinks{

    private int temperature;
    public HotDrinksTemp(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
    public int getTemperature() {

        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", volume=" + super.getVolume() +
                ", temperature=" + temperature +
                '}';
    }

}
