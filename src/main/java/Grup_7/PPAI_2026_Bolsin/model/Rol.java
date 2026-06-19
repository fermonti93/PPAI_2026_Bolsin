package Grup_7.PPAI_2026_Bolsin.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
 @Setter
 @Getter
public class Rol {


    String descripcion;
    String nombre;

    void rol(String descripcion, String nombre)
    {
        this.descripcion=descripcion;
        this.nombre=nombre;
    }

    void esGCM()
    {
        //metodo q busca si es gerente comision medica
        
    }


}
