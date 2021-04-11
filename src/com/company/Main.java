package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> carsA = new ArrayList<>();
        carsA.add(scanner.nextLine());
        carsA.add(scanner.nextLine());
        carsA.add(scanner.nextLine());
        carsA.add(scanner.nextLine());
        carsA.add(scanner.nextLine());
        print(carsA);

        ArrayList<String> carsB = new ArrayList<>();
        carsB.add(scanner.nextLine());
        carsB.add(scanner.nextLine());
        carsB.add(scanner.nextLine());
        carsB.add(scanner.nextLine());
        carsB.add(scanner.nextLine());
        print(carsB);

        Collections.reverse(carsB);
        ArrayList<String> carsC = new ArrayList<>();
        int j = 0;
        System.out.println("=============");

        while (carsC.size() < carsA.size() + carsB.size()) {
            carsC.add(carsA.get(j));
            carsC.add(carsB.get(j));
            j++;
        }
        print(carsC);
        System.out.println("Сортировка по длине слова.");
        Collections.sort(carsC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        print(carsC);
    }

    public static void print(ArrayList<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
/*
#ДЗ
(Дэдлайн 10.04.2021 23:59)
a)  В задании нельзя использовать циклы for и for each. Только while и Iterator
b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
c)  Затем программа должна отобразить этот список
d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б. После также отображает его в консоли
e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
f)  После объединения отобразить в консоли список С
g)   В конце отсортировать элементы списка С по длине слова,
сначала идут String-и с наименьшим количеством символов, и распечатать отсортированный список С. (Comparator)
 */