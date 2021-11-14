package persistencia;

import java.util.*;
import logica.*;

public class ControladoraPersistencia {
     //Inicializamos la controladora JPA
    ClienteJpaController control = new ClienteJpaController();
        
    //Metodo para agregar un cliente
    public void agregar_Cliente(Cliente cliente){
        try{
            control.create(cliente);
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
    }    
    
    //Metodo para borrar un cliente
    public void borrar_Cliente(Cliente cliente){
        try{
            control.destroy(cliente.getNum_cliente());
        }catch(Exception e){
            e.printStackTrace(System.out);
        }                
    }
    public void borrar_Cliente(int num_cliente){
        try{
            control.destroy(num_cliente);
        }catch(Exception e){
            e.printStackTrace(System.out);
        }                
    }
    
    //Metodo para modificar un cliente
    public void modificar_Cliente(Cliente cliente){
        try{
            control.edit(cliente);
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
    }    
    
    //Metodo para desplegar lista de cliente
    public List<Cliente> lista(){
        return control.findClienteEntities();
    }
    
    //Metodo para buscar cliente
    public Cliente buscar(Cliente cliente){
        return control.findCliente(cliente.getNum_cliente());
    }
    public Cliente buscar(int num_cliente){
        return control.findCliente(num_cliente);
    }     
}
