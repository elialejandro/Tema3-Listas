package lista_numeros;

public class App {
    public static void main(String[] args) {
        
        Elemento e = new Elemento(1);
        Nodo inicio = new Nodo(e);

        // inicio = new Nodo(new Elemento(2), inicio);
        // System.out.println(inicio.dato.numero);

        Nodo nuevo = new Nodo(new Elemento(2));
        inicio.siguiente = nuevo;

    }
}
