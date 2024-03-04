import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cola<String> Cola = new Cola<>(2, List.of("hola soy el primero", "hola soy el segundo"));
        Pila<String> pila = new Pila<>(2, List.of("Hola soy el primero", "hola oy el segundo"));
    }
}