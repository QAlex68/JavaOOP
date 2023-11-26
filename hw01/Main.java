//1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
// перегруженный метод getProduct(int name, int volume, int temperature),
// выдающий продукт соответствующий имени, объёму и температуре
//3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику,
// заложенную в программе
//4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HotDrinks> productList = new ArrayList<>();
        productList.add(new HotDrinksTemp("coffee", 50, 90));
        productList.add(new HotDrinksTemp("coffee", 100, 90));
        productList.add(new HotDrinksTemp("coffee", 200, 70));
        productList.add(new HotDrinksTemp("tea", 150, 90));
        productList.add(new HotDrinksTemp("tea", 200, 90));
        productList.add(new HotDrinksTemp("tea", 250, 70));
        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("coffee", 70));
        System.out.println(vendingMachine.getProduct("tea", 250, 70));
        // HotDrinks test = new HotDrinksTemp("coffee", 50, 90);

    }
}
