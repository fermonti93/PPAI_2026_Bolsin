package Grup_7.PPAI_2026_Bolsin.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
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
    private int numeroPrecinto;
    private int peso;

    @OneToMany(mappedBy = "bolsin", cascade = CascadeType.ALL)
    private List<CambioEstadoBolsin> cambiosEstadoBolsin = new ArrayList<>();

    @ManyToOne
    private ComisionMedica origen;

    @ManyToOne
    private ComisionMedica destino;

    public Bolsin() {}

    public boolean esTuOrigenCM(ComisionMedica cm) {
        return this.origen != null && this.origen.equals(cm);
    }

    public boolean sosEnviado() {
        return cambiosEstadoBolsin.stream()
                .filter(CambioEstadoBolsin::esEstadoActual)
                .anyMatch(CambioEstadoBolsin::sosEnviado);
    }

    public ComisionMedica obtenerCMDestino() {
        return this.destino;
    }

    public int getNumeroPrecinto() {
        return this.numeroPrecinto;
    }

    public int getNumeroBolsin() {
        return this.numeroBolsin;
    }

    public String buscarDireccionCorreo() {
        return this.destino.getEmail();
    }

    public void modificarBolsin() {}

    public void eliminarBolsin() {}

    public void cerrarBolsin() {}

    public void registrarRetiroBolsin() {}

    public void registrarRecepcionBolsin() {}
}