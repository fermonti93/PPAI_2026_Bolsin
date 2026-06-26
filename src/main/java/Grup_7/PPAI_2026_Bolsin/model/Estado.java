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
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String ambito;
    private String nombre;
    private String descripcion;

    public Estado() {}

    public Estado(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public boolean sosEnviado() {
        return this.nombre != null && this.nombre.equalsIgnoreCase("Enviado");
    }
}