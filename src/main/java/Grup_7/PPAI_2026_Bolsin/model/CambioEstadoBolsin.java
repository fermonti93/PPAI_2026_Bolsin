package Grup_7.PPAI_2026_Bolsin.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CambioEstadoBolsin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime fechaHoraFin;
    private LocalDateTime fechaHoraInicio;

    @ManyToOne
    @JoinColumn(name = "bolsin_id")
    private Bolsin bolsin;

    @ManyToOne
    private Estado estado;

    public CambioEstadoBolsin() {}

    public CambioEstadoBolsin(LocalDateTime fechaHoraInicio, Estado estado, Bolsin bolsin) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = null;
        this.estado = estado;
        this.bolsin = bolsin;
    }

    public boolean esEstadoActual() {
        return this.fechaHoraFin == null;
    }

    public boolean sosEnviado() {
        return this.estado != null && this.estado.sosEnviado();
    }
}