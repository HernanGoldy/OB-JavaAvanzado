package ConstructorLargo;

public class Main {
    public static void main(String[] args) {
        ConstructorTradicional cosa = new ConstructorTradicional("A", "B", "C", 5);

        ConstructorBuilder cosa2 = new ConstructorBuilder("A")
                .conModelo("B")
                .conMotor("C")
                .conPuertas(5);
    }
}
