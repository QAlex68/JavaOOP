// Базовый класс горячительных напитков
public abstract class HotDrinks {

    private String name;
    private int volume;

    public HotDrinks(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }

    public int getVolume() {

        return volume;
    }
    public void setVolume(int volume) {

        this.volume = volume;
    }

    @Override // Вывод строки продукта в удобном виде
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

}
