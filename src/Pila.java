import java.util.List;
import java.util.Stack;

public class Pila<T>{
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
//el ultimo ensalir es el primero
    @Override
    public T sacarElemento() {
        int indice = this.elementos.size()-1;
        T elemento = this.elementos.get(indice);
        this.elementos.remove(indice);
        return elemento;
    }
}
