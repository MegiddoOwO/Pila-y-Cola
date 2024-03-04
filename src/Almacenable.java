public interface Almacenable<T> {
    public int getLimite();
    public void setLimite(int limite);
    public void agregarElemento(T elementos);
    public T sacarElemento();
}
