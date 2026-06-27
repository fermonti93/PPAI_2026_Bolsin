package Grup_7.PPAI_2026_Bolsin.model;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String contraseña; //rebisar el tipo decontraseña
    private Empleado empleado;

    public Usuario(){}
    public Usuario(String nombre,String contraseña, Empleado empleado){
        this.nombre=nombre;
        this.contraseña=contraseña;
        this.empleado=empleado;
    }
    public void obtenerEmpleado(Empleado empleado){}
}
