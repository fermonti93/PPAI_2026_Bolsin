package Grup_7.PPAI_2026_Bolsin.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Sesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechahoraFin;
    private Usuario usuario;

    public Sesion(LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin, Usuario usuario){
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechahoraFin = fechaHoraFin;
        this.usuario = usuario;
    }
    public void buscarUsuarioLogeado(){}

}
