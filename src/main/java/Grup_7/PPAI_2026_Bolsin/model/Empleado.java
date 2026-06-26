package Grup_7.PPAI_2026_Bolsin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String nombre;
    private String apellido;
    private String eMail;
    private Rol rol;
    private ComisionMedica asignadoA;

    public Empleado (){}
    public Empleado(String nombre,String apellido,int dni,String direccion,String email,Rol rol){}

    public void esTuCM(){}
    public void sosgetCM(){}
    public void mostrarCM(){}
    public void obtenerCM(){}
    public void sosGCM(){}

}
