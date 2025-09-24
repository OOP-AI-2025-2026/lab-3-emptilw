package org.example.task2;

public class IntStack {
    private static final int INITIAL_CAPACITY = 10; // початковий розмір масиву
    private int[] stackArray; // масив для зберігання елементів
    private int top; // індекс вершини стека

    // Конструктор без параметрів
    public IntStack() {
        stackArray = new int[INITIAL_CAPACITY];
        top = -1; // стек порожній
    }

    // Додати елемент у стек
    public void push(int value) {
        if (top + 1 == stackArray.length) {
            expandArray(); // збільшуємо масив, якщо місце закінчилось
        }
        stackArray[++top] = value;
    }

    // Видалити елемент з вершини стека
    public int pop() {
        if (isEmpty()) {
            return 0; // якщо стек порожній — повертаємо 0
        }
        return stackArray[top--];
    }

    // Перегляд вершини стека без видалення
    public int peek() {
        if (isEmpty()) {
            return 0; // якщо стек порожній — повертаємо 0
        }
        return stackArray[top];
    }

    // Отримати кількість елементів у стеку
    public int size() {
        return top + 1;
    }

    // Перевірити, чи стек порожній
    public boolean isEmpty() {
        return top == -1;
    }

    // Очистити стек
    public void clear() {
        top = -1;
    }

    // Збільшити розмір масиву (імітація динамічного стека)
    private void expandArray() {
        int newCapacity = stackArray.length * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
        stackArray = newArray;
    }
}
