package n1exercici2.models;

public class GenericMethods {

    public static <T, U, V> void metodeGeneric (T primer, U segon, V tercer){

        System.out.println(primer);
        System.out.println(segon);
        System.out.println(tercer);
    }
}
