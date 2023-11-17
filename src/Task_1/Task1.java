package Task_1;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Создаем объекты Task_1.Human.");
        Human father = new Human("Иосиф", true, 55);
        Human mother = new Human("Мария", false, 50);
        Human uncle = new Human("Иван", true, 45);
        Human aunt = new Human("Елена", false, 43);

        Human firstChild = new Human("Петр", true, 10, father, mother);
        Human secondChild = new Human("Свтлана", false, 12, father, mother);
        Human thirdChild = new Human("Григорий", true, 14, father, mother);
        Human firstCousin = new Human("Петр", true, 8, uncle, aunt);
        Human secondCousin = new Human("Галина", false, 5, uncle, aunt);

        System.out.println(father);
        System.out.println(mother);
        System.out.println(uncle);
        System.out.println(aunt);
        System.out.println(firstChild);
        System.out.println(secondChild);
        System.out.println(thirdChild);
        System.out.println(firstCousin);
        System.out.println(secondCousin);

    }
}
