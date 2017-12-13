package ruiz.jesus.org.bascula_jesus;

/**
 * Created by Jesús Manuel Ruiz Verdejo on 10/12/2017.
 */

public class Articulo {

    int idFoto;
    String nombre;
    double cantidad;


    public Articulo(int idFoto, String nombre, double cantidad)
    {
        this.idFoto = idFoto ;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
}
