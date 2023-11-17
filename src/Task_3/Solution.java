package Task_3;

public class Solution {

    public  static class Man {
        private  String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public  String toString (){
            String text = "";
            text += "Имя: " + this.name;
            text += ", возраст: " + this.age + " лет ";
            text += ", адрес: " + this.address;
            return text;
        }
    }

    public  static  class Woman {
        private  String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        @Override
        public  String toString (){
            String text = "";
            text += "Имя: " + this.name;
            text += ", возраст: " + this.age + " лет ";
            text += ", адрес: " + this.address;

            return text;
        }
    }
}
