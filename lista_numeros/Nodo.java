package lista_numeros;

class Nodo {
    public Elemento dato;
    public Nodo siguiente;

    public Nodo(Elemento dato)
    {
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo(Elemento dato, Nodo n)
    {
        this.dato = dato;
        this.siguiente = n;
    }

}

