package Task_3;

public class Task3 {
    public static void main(String[] args) {

        Solution.Man man1 = new Solution.Man("Иван",
                30, "город Москва, Красная площадь");
        System.out.println(man1);

        Solution.Man man2 = new Solution.Man("Владимир",
                50, "г.Тула, пр.Ленина, д.12, кв.4");
        System.out.println(man2);

        Solution.Woman woman1 = new Solution.Woman("Елена",
                20, "г.Омск, ул.Ленина, д.1");
        System.out.println(woman1);

        Solution.Woman woman2 = new Solution.Woman("Мария",
                32, "г.Якутск, ул. Сталина, д.2, кв.1");
        System.out.println(woman2);

    }
}
