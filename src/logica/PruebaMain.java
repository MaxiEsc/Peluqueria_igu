package logica;

import igu.Principal;
import java.util.*;

public class PruebaMain {

    public static void main(String[] args) {
        
        Controladora ctrl = new Controladora();
        
        Principal prin = new Principal(ctrl);
        prin.setVisible(true);
        prin.setLocationRelativeTo(null);

//        Cliente c1 = new Cliente(1, "arnols", "misa", "Verde", true, true, "fede", "1324546", "se mira");
//        Cliente c2 = new Cliente(2, "atat", "jajdsa", "rojo", true, true, "ala", "765443357", "terezo");
//        Cliente c3 = new Cliente(3, "pepe", "mito", "Vazul", true, true, "fresco", "5434665", "berta");
//        Cliente c4 = new Cliente(4, "pepino", "joraka", "amarillo", true, true, "gatafor", "5436457365", "hotmi");
//        Cliente c5 = new Cliente(5, "popis", "ganto", "saca", true, true, "gala", "175-56765", "triaton");
//        Cliente c6 = new Cliente(6, "mamasd", "misamo", "ytwetx", true, true, "jajajaaja", "51324546567", "chorizo");
//        Cliente c7 = new Cliente(7, "dada", "katiro", "porppa", true, true, "siete", "76574546", "alcohol");
//        Cliente c8 = new Cliente(8, "palo", "cheems", "purpura", true, true, "kotlin", "15743846", "asado");
//        
//        ctrl.altaCliente(c1);
//        ctrl.altaCliente(c2);
//        ctrl.altaCliente(c3);
//        ctrl.altaCliente(c4);
//        ctrl.altaCliente(c5);
//        ctrl.altaCliente(c6);
//        ctrl.altaCliente(c7);
//        ctrl.altaCliente(c8);        
//        Cliente elimnar = new Cliente(9, "paloma", "rota", "purpura", true, true, "kotlin", "15743846", "asado");
//        ctrl.altaCliente(elimnar);
//        Cliente modi = new Cliente(9, "praxcvdv", "rota", "azul", true, true, "c", "15743846", "verde");
//        ctrl.altaCliente(modi);
//        System.out.println("Mostrando lista");
//        List<Cliente> lista = ctrl.listarClientes();
//        for (Cliente iterar : lista) {
//            System.out.println("-> " + iterar);
//        }
    }
}
