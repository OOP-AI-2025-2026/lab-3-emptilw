package org.example.task2;

public class Box {
    private double length;
    private double width;
    private double height;

    // Конструктор
    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    // Приватні сеттери з перевіркою
    private void setLength(double length) {
        if (length <= 0) {
            System.out.println("Помилка: довжина повинна бути більше 0. Встановлюємо 1.");
            this.length = 1;
        } else {
            this.length = length;
        }
    }

    private void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Помилка: ширина повинна бути більше 0. Встановлюємо 1.");
            this.width = 1;
        } else {
            this.width = width;
        }
    }

    private void setHeight(double height) {
        if (height <= 0) {
            System.out.println("Помилка: висота повинна бути більше 0. Встановлюємо 1.");
            this.height = 1;
        } else {
            this.height = height;
        }
    }

    // Площа поверхні
    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    // Площа бічної поверхні
    public double getLateralSurfaceArea() {
        return 2 * height * (length + width);
    }

    // Об'єм
    public double getVolume() {
        return length * width * height;
    }
}
