/* Шутылев Павел Владимирович */
public class Main {
    public static void main(String[] args) {

        // Создание нескольких горячих напитков.
        HotDrink coffee = new HotDrink("Coffee", 250, 80);
        HotDrink tea = new HotDrink("Tea", 200, 75);
        HotDrink hotChocolate = new HotDrink("Hot Chocolate", 300, 85);

        // Создание автомата горячих напитков.
        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        vendingMachine.addHotDrink(coffee);
        vendingMachine.addHotDrink(tea);
        vendingMachine.addHotDrink(hotChocolate);

        // Получение и вывод информации о напитках.
        Product product1 = vendingMachine.getProduct("Coffee", 250);
        System.out.println(product1);
        HotDrink product2 = vendingMachine.getProduct("Tea", 200, 75);
        System.out.println(product2);
        HotDrink product3 = vendingMachine.getProduct("Hot Chocolate", 300, 85);
        System.out.println(product3);
    }
}