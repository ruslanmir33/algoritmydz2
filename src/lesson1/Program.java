package lesson1;

public class Program {
    public static void main(String[] args) {
        int a = 5;
//        int b = a;
        int b = 5;

        Person p1 = new Person("Andrey", "Limasov", 33);
//        Person p2 = p1;
        Person p2 = new Person("Andrey", "Limasov", 33);

//        b++;
//        p2.setAge(18);

//        changePrimitive(a);
//        changeRef(p1);

//        System.out.println(a);
////        System.out.println(b);
//        System.out.println(p1.getAge());
////        System.out.println(p2.getAge());
//        1.Передача данных по значению.
//        2.В java ету передачи данных по ссылке.
//        System.out.println(a);
//        System.out.println(p1.getFistName());
        if (a == b) {
            System.out.println("Variable is equal");
        } else {
            System.out.println("Variable is not equal");
        }
        if (p1.equals(p2)) {
            System.out.println("Variable is equal");
        } else {
            System.out.println("Variable is not equal");
        }


    }

    public static void changePrimitive(int x) {
        x++;
    }

    public static void changeRef(Person person) {
        person.setFistName("Inanushka");
    }
}
