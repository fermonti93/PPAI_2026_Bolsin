package Grup_7.PPAI_2026_Bolsin.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bolsin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate fecha;
    private int numeroBolsin;
    private int numeroPresinto;
    private int peso;

    @OneToMany
    private CambioEstadoBolsin cambioEstadoBolsin;

    @OneToOne
    private ComisionMedica origen;

    @OneToOne
    private ComisionMedica destino;

    public Bolsin(){}
    public void esTuOrigenCM(){}
    public void buscarBolsinEnviado(){}
    public void obtenerCMDestimado(){}
    public void buscarDireccionCorreo(){}
    public void modificarBolsin(){}
    public void eliminarBolsi(){}
    public void cerrarBolsin(){}
    public void registrarRetiroBolsin(){}
    public void registrarRecepcionBolsin(){}
    


}
