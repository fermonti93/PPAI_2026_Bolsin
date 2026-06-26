package Grup_7.PPAI_2026_Bolsin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Grup_7.PPAI_2026_Bolsin.model.Rol;

@SpringBootApplication
public class Ppai2026BolsinApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ppai2026BolsinApplication.class, args);
		Rol rol = new Rol("prueba 1","admin");
		System.out.println(rol.getNombre());
	}

	
}
