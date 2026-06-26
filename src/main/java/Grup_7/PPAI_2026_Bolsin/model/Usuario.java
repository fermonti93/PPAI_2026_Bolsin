package Grup_7.PPAI_2026_Bolsin.model;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
    private String contraseña; //revisar el tipo decontraseña
    
    @OneToOne
    private Empleado empleado;

    Usuario(){}
    Usuario(String nombre,String contraseña){
        this.nombre=nombre;
        this.contraseña=contraseña;
    }
    public void obtenerEmpleado(Empleado empleado){}
}
