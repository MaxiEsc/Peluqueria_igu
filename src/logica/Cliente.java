package logica;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Cliente implements Serializable {

    //Solo se utilizara Id para que los empleados puedan utilizar el numero de cliente deseado...
    @Id
    private int num_cliente;
    @Basic
    private String nombre_Perro;
    private String raza;
    private String color;
    private boolean alergico;
    private boolean atencion_Especial;
    private String nombre_duenio;
    private String cel_duenio;
    private String observaciones;

    public Cliente() {
    }

    public Cliente(int num_cliente, String nombre_Perro, String raza, String color, boolean alergico, boolean atencion_Especial, String nombre_duenio, String cel_duenio, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre_Perro = nombre_Perro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_Especial = atencion_Especial;
        this.nombre_duenio = nombre_duenio;
        this.cel_duenio = cel_duenio;
        this.observaciones = observaciones;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_Perro() {
        return nombre_Perro;
    }

    public void setNombre_Perro(String nombre_Perro) {
        this.nombre_Perro = nombre_Perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isAtencion_Especial() {
        return atencion_Especial;
    }

    public void setAtencion_Especial(boolean atencion_Especial) {
        this.atencion_Especial = atencion_Especial;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public String getCel_duenio() {
        return cel_duenio;
    }

    public void setCel_duenio(String cel_duenio) {
        this.cel_duenio = cel_duenio;
    }

    //Se crea para mostrar prubas presentes y comentadas en el main
    @Override
    public String toString() {
        return "Cliente { " + "Numero de Cliente: " + num_cliente + ", Nombre del Perro: " + nombre_Perro + ", Raza: " + raza + ", Color: " + color + ", Alergico: " + alergico + ", Atencion Especial: " + atencion_Especial + ", Nombre del duenio: " + nombre_duenio + ", celular del duenio: " + cel_duenio + ", Observaciones: " + observaciones + " } ";
    }
}