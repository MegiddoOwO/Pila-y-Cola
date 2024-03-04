public interface Almacenable<T> {
    public int getLimite();
    public void setLimite();
    public void agregarElemento(T elementos);
    public T sacarElemento();
}
