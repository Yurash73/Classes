package Task_2;

public class Cat {

    private String name;
    private float weight = 3.0F;
    private int age;
    private  String color;
    private  String address;


    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, float weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(float weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat(float weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    @Override
    public String toString() {
        String text = "";
        if ( this.name == null) {
            text += "Имя: неизвестно " ;
        }
        else text += "Имя: " + this.name;
        text += ", вес: " + this.weight;
        if (this.age == 0)
        {  text += ", возраст неизвестен " ;
        }
        else  text += ", возраст: " + this.age;
        if (this.color == null) {
            text += ", цвет непонятный ";
        }
        else text += ", цвет: " + this.color;
        if (this.address == null) {
            text += ", бездомный котяра ";
        }
        else text += ", адрес: " + this.address;

        return text;
    }
}
