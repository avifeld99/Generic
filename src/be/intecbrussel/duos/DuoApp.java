package be.intecbrussel.duos;

public class DuoApp {
    public static void main(String[] args) {

        IntDuo euroAndCents = new IntDuo(50, 80);
        System.out.println("I have " + euroAndCents.getNumber1() + " euro!");
        System.out.println("I have " + euroAndCents.getNumber1() + " cents!");

        Duo<Integer> euroAndCent = new Duo<>(50, 80);
        System.out.println("I have " + euroAndCent.getElement1()+ " euro!");

        Duo<String> synonym = new Duo<>("Happy", "Joyful");
        System.out.println(synonym.getElement1() + " means the same as " + synonym.getElement2());

        DifferentDuo<Integer, String> numbers = new DifferentDuo<>(20, "twenty");
        System.out.println(numbers.getElement1() + " = " + numbers.getElement2());

        /*
        T – Type
        E – Element
        K – Key
        N – Number
        V – Value
        */


    }
}
