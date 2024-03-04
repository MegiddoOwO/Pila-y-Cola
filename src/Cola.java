import java.util.List;
import java.util.Queue;

public class Cola<T> implements Cola2<T> {
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
        return elementos.remove();
    }

    public List<T> getElementos() {
        return elementos;
    }
    //el primero es el primero en salir
    @Override
    public T sacarElemento() {
        int indice = this.elementos.size()-1;
        T elemento = this.elementos.get(indice);
        this.elementos.remove(indice);
        return elemento;
    }
}
