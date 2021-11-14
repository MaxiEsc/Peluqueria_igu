package logica;

import java.util.*;
import persistencia.ControladoraPersistencia;

public class Controladora {
    //Se inicializa la controladora de persistencia
    ControladoraPersistencia con = new ControladoraPersistencia();

    //Metodo para que la controladora le de el alta al cliente
    public void altaCliente(Cliente c) {
        con.agregar_Cliente(c);
    }

    //Metodo para que la controladora pueda crear un usuario a traves del IGU
    public void altaCliente(String numeroCliente, String nombre_perro, String raza, String color, boolean alergico, boolean especial, String nombre_duenio,String cel, String observaciones) {
        
        int n = Integer.parseInt(numeroCliente);
        Cliente nuevo = new Cliente(n, nombre_perro, raza, color, alergico, especial, nombre_duenio,cel , observaciones);

        con.agregar_Cliente(nuevo);
    }

    //Metodo para que la controladora le de la baja al cliente
    public void bajaCliente(Cliente c) {
        con.borrar_Cliente(c);
    }

    //Metodo para que la controladora le de la baja al cliente
    public void bajaCliente(int id) {
        con.borrar_Cliente(id);
    }

    //Metodo para que la controladora para que modifique al cliente
    public void modificaCliente(Cliente c) {
        con.modificar_Cliente(c);
    }
    //Metodo para que la controladora modifique desde el igu
    public void modificaCliente(String numeroCliente, String nombre_perro, String raza, String color, boolean alergico, boolean especial, String nombre_duenio,String cel, String observaciones) {
        
        int n = Integer.parseInt(numeroCliente);
        Cliente modifica = new Cliente(n, nombre_perro, raza, color, alergico, especial, nombre_duenio, cel, observaciones);

        con.agregar_Cliente(modifica);
    }

    //Metodo para que la controladora busque al cliente
    public Cliente buscaCliente(Cliente c) {
        return con.buscar(c);
    }

    //Metodo para que la controladora busque al cliente por id
    public Cliente buscaCliente(int id) {
        return con.buscar(id);
    }

    //Metodo para buscar cliente... Si esta devuelve 1, si no hay datos devuelve 0
    public int BuscaCliente(int id) {
        return (con.buscar(id) != null) ? 1 : 0;
    }

    //Metodo para que la controladora liste los cliente
    public List<Cliente> listarClientes() {
        return con.lista();
    }

}
