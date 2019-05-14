import com.company.classwork.Dog;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//    private static Dog DogList;
//
//    public static Dog <String> addDogsToList(){
//        ArrayList<String> list = new ArrayList<String>();
//
//        list.add(dog1);>
//        list.add(dog2);
//        list.add(dog3);
//
//        return DogList;
//    }


    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d);

        Dog d1 = new Dog();
        d1.setName("Spike");
        d1.setAge(12);
        d1.setBreed("beagle");
        d1.setColor("brown");
        d1.printDog();
        System.out.println(d1);

        Dog d2 = new Dog();
        d1.setName("Elvis");
        d1.setAge(7);
        d1.setBreed("terrier");
        d1.setColor("tan");
        d1.printDog();
        System.out.println(d2);

        Dog d3 = new Dog();
        d1.setName("Zoe");
        d1.setAge(5);
        d1.setBreed("yorkie");
        d1.setColor("silver/brown");
        d1.printDog();
        System.out.println(d3);





    }
}