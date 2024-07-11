// Класс ГорячихНапитковАвтомат, реализующий интерфейс ТорговыйАвтомат.
import java.util.List;
import java.util.ArrayList;

class HotDrinksVendingMachine implements VendingMachine {
    private List<HotDrink> inventory = new ArrayList<>();

    // Метод для добавления напитков в автомат.
    public void addHotDrink(HotDrink drink) {
        inventory.add(drink);
    }

    @Override
    public Product getProduct(String name, int volume) {
        for (HotDrink drink : inventory) {
            if (drink.getName().equals(name) && drink.getVolume() == volume) {
                return drink;
            }
        }
        return null;
    }

    // Перегруженный метод getProduct, который также учитывает температуру.
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink drink : inventory) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null;
    }
}
