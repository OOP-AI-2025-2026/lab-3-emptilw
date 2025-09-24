package org.example.task2;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart(10);
        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.add(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.add(new Item(5, "Samsung RB34 Холодильник", 22399));
        cart.add(new Item(6, "De'Longhi Magnifica S Кавоварка", 10599));
        cart.add(new Item(7, "Gorenje Електрична плита", 9999));
        cart.add(new Item(8, "Dyson V11 Пилосос", 16499));
        cart.add(new Item(9, "Samsung ME83K Мікрохвильова піч", 3199));
        cart.add(new Item(10, "Philips DryCare Фен", 1499));

        System.out.println(cart);

        cart.removeById(9);

        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);

        // Створення об'єкту бокс та перевірка
        System.out.println("=== Box ===");
        Box box = new Box(5, 3, 2);

        System.out.println("Площа поверхні: " + box.getSurfaceArea());
        System.out.println("Площа бічної поверхні: " + box.getLateralSurfaceArea());
        System.out.println("Об'єм: " + box.getVolume());

        System.out.println("=== IntStack ===");
        IntStack stack = new IntStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Вершина стека: " + stack.peek()); // 30
        System.out.println("Вийнято: " + stack.pop()); // 30
        System.out.println("Вершина після pop: " + stack.peek()); // 20
        System.out.println("Розмір стека: " + stack.size()); // 2

        stack.clear();
        System.out.println("Стек очищено. Порожній? " + stack.isEmpty()); // true
        System.out.println("Спроба pop з порожнього стека: " + stack.pop()); // 0
    }
}