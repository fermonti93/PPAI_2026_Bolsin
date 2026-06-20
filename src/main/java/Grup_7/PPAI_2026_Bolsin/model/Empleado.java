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
    private int     dni;
    private String direccion;
    private String eMail;
    private Rol rol;

    public Empleado (){}
    public Empleado(String nombre,String apellido,int dni,String direccion,String email,Rol rol){}

    public void obtenerCM(){}
    public void sosgcm(){}

}
