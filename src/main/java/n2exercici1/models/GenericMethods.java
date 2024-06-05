package n2exercici1.models;

public class GenericMethods {

    public static <T, U> void metodeGeneric (T primer, U segon, int anyNaixement){

        System.out.println(primer);
        System.out.println(segon);
        System.out.println(anyNaixement);
    }
}
