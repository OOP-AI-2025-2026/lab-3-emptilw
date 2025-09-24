package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int index;

    public Cart(int size) {
        this.contents = new Item[size];
        this.index = 0;
    }

    // Видалити товар за id
    public void removeById(long itemId) {
        int foundIndex = findItemIndexById(itemId);
        if (foundIndex == -1) return;

        for (int i = foundIndex; i < index - 1; i++) {
            this.contents[i] = this.contents[i + 1];
        }
        this.contents[index - 1] = null;
        index--;
    }

    private int findItemIndexById(long itemId) {
        for (int i = 0; i < index; i++) {
            if (this.contents[i].getId() == itemId) {
                return i;
            }
        }
        return -1;
    }

    // Додати товар у кошик
    public void add(Item item) {
        if (isCartFull()) {
            System.out.println("Кошик заповнений!");
            return;
        }
        this.contents[this.index] = item;
        this.index++;
    }

    public boolean isCartFull() {
        return this.index == this.contents.length;
    }

    public Item[] getContents() {
        return Arrays.copyOf(this.contents, this.index);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(contents) +
                '}' + "\n";
    }
}
