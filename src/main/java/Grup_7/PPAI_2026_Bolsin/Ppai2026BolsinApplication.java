package Grup_7.PPAI_2026_Bolsin;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Grup_7.PPAI_2026_Bolsin.model.Bolsin;
import Grup_7.PPAI_2026_Bolsin.model.CambioEstadoBolsin;
import Grup_7.PPAI_2026_Bolsin.model.ComisionMedica;
import Grup_7.PPAI_2026_Bolsin.model.Empleado;
import Grup_7.PPAI_2026_Bolsin.model.Estado;
import Grup_7.PPAI_2026_Bolsin.model.Rol;
import Grup_7.PPAI_2026_Bolsin.model.Sesion;
import Grup_7.PPAI_2026_Bolsin.model.Usuario;


@SpringBootApplication
public class Ppai2026BolsinApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ppai2026BolsinApplication.class, args);
		Rol rol = new Rol ("prueba 1","admin");
		CambioEstadoBolsin cambioEstadoBolsin = new CambioEstadoBolsin ((LocalDateTime.of(2026,06,30,18,30)),LocalDateTime.of(2026,06,30,8,30));
		ComisionMedica comisionMedica1 = new ComisionMedica(123, "Alvear 542", "cm123@hotmail.com", "Comision Medica 123", "0353-4567890");
		ComisionMedica comisionMedica2 = new ComisionMedica(124, "San Martir 215", "cm124@hotmail.com", "Comision Medica 124", "0353-4098765");
		Bolsin bolsin = new Bolsin (LocalDate.of(2026,06,30), 1, 1, 100, cambioEstadoBolsin, null, null);
		Empleado empleado = new Empleado ("Juan", "Perez", "juanperez@hotmail.com", rol, null);
		Estado estado = new Estado ("Bolsin","Creado","prueba");
		Usuario usuario = new Usuario ("Juan", "1234", empleado);
		Sesion sesion = new Sesion ((LocalDateTime.of(2026,06,30,8,30)), (LocalDateTime.of(2026,06,30,20,30)), usuario);
		System.out.println(rol.getNombre());
	}

	
}
