
import java.util.List;

// Интерфейс торгового автомата
public interface VendingMachine {
    // Внесение продуктов в торговый автомат
    void initProduct(List<HotDrinks> productList);

    // Получение продукта из торгового автомата
    public HotDrinks getProduct(String name);
}
