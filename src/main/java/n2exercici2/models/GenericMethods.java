package n2exercici2.models;

public class GenericMethods {

    public static void metodeGeneric (Object... args){
        for (Object arg : args){
            System.out.println(arg);
        }
    }
}
