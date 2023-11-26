
import java.util.ArrayList;
import java.util.List;

// Класс автомата горячих напитков
public class HotDrinksVendingMachine implements VendingMachine {

    private List<HotDrinks> productList = new ArrayList<>();

    @Override
    public void initProduct(List<HotDrinks> productList) {

        this.productList = productList;
    }

    @Override
    public HotDrinks getProduct(String name) {
        for (HotDrinks item : productList)
            if (item.getName().equals(name))
                return item;
        return null;
    }

    public HotDrinks getProduct(String name, int temperature) {
        for (HotDrinks item : productList)
            if (item.getName().equals(name) && ((HotDrinksTemp) item).getTemperature() == temperature)
                return item;
        return null;
    }

    public HotDrinks getProduct(String name, int volume, int temperature) {
        for (HotDrinks item : productList)
            if (item.getName().equals(name) && item.getVolume() == volume &&
                    ((HotDrinksTemp) item).getTemperature() == temperature)
                return item;
        return null;
    }
}
