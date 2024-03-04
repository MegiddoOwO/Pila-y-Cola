import java.util.List;

public class Pila<T> implements Almacenable<T> {
    private int limite;
    List<T> elementos;
    Pila(int limite, List<T> elementos){
        this.limite=limite;
        this.elementos=elementos;
    }
    public int getLimite() {
        return limite;
    }


    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }
    @Override
    public T sacarElemento() {
        return this.elementos.removeFirst();
    }
}
