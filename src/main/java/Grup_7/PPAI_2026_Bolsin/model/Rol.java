package Grup_7.PPAI_2026_Bolsin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
 @Setter
 @Getter
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    String nombre;

    String descripcion;
    

    public Rol(String descripcion, String nombre)
    {
        this.descripcion=descripcion;
        this.nombre=nombre;
    }

    void esGCM()
    {
        //metodo q busca si es gerente comision medica
        
    }


}
