package Task_2;

public class Task2 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Васька");
        System.out.println(cat1);

        Cat cat2 = new Cat("Мурка" , 2.5F, 5);
        System.out.println(cat2);

        Cat cat3 = new Cat("Пират", 7);
        System.out.println(cat3);

        Cat cat4 = new Cat(3.5F,"Рыжий");
        System.out.println(cat4);

        Cat cat5 = new Cat(5F,"Черный","улица Лизюкова");
        System.out.println(cat5);


    }
}
