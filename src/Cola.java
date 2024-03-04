import java.util.List;
import java.util.Queue;

public class Cola<T> implements Almacenable<T> {
    private int limite;
    List<T> elementos;
Cola(int limite, List<T> elementos){
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

    public T sacarElemento() {
        return elementos.removeLast();
    }

    public List<T> getElementos() {
        return elementos;
    }
}
