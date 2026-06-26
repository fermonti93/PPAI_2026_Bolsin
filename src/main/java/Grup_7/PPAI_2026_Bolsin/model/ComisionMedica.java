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
public class ComisionMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int codigo;
    private String direccion;
    private String email;
    private String nombre;
    private String telefono;

    public ComisionMedica() {}

    public void buscarGerente() {}
}