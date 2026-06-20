package Grup_7.PPAI_2026_Bolsin.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CambioEstado {
    
         @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime fechaHoraFin;
    private LocalDateTime fechaHorainicio;
    private Estado estado;

    public CambioEstado(){}

    public CambioEstado(LocalDateTime f,LocalDateTime i)
    {
        this.fechaHoraFin=f;
        this.fechaHorainicio=i;
        this.estado=null; //este constructor es para poder verificar en la bd
    }

    public void esEstadoActual(){}

    public void sosEnviado(){}

}
