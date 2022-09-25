package ru.mirea.lab2;

import java.util.Arrays;

public class Shop {
    int count = 0;
    int size;
    String[] computerList;
    String[] computerListNow;

    public Shop(int count, int size, String[] computerList) {
        this.count = count;
        this.size = size;
        this.computerList = computerList;
    }

    public void newComp(String name) {
        this.computerList[count] = name;
        count += 1;
    }
    public void delete(String[] arr, int ind) {
        for (int i = 1; i < arr.length - 1; i++) {
            arr[i-1] = arr[i];
            arr[i] = null;
        }
    }

    public void deleteComp(String name) {
        for (int i = 0; i < count; i++) {
            if (name.equals(computerList[i])) {
                delete(computerList, i);
                count -= 1;
                break;
            }
            else {
                System.out.println("Такого компьютера нет в магазине");
            }
        }
    }
    public void Search(String name) {
        for (String comp : computerList) {
            if (comp.equals(name)) {
                System.out.println("Компьютер " + name + "есть в нашем магазине!");
                return;
            }
        }
        System.out.println("К сожалению, компьютера " + name + "в наем магазине нет.");
    }

    private String[] nowlist(String[] arr) {
        String[] newarray = new String[count];
        for (int i = 0; i < count; i++) {
            newarray[i] = this.computerList[i];
        }
        return newarray;
    }

    @Override
    public String toString() {
        this.computerListNow = nowlist(this.computerList);
        return "Shop{" +
                "Всего компьютеров:" + count +
                ", Максимальное возможное количество компьютеров:" + size +
                ", Список компьютеров:" + Arrays.toString(computerListNow) +
                '}';
    }
}
