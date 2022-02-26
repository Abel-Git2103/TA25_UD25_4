package mainAPP.service;

import java.util.List;

import mainAPP.dto.Sala;

public interface ISalaService {

	public List<Sala> listarSala(); //Listar All 
	
	public Sala guardarSala(Sala sala);	//Guarda una sala CREATE
	
	public Sala salaXID(Integer id); //Leer datos de una sala READ
		
	public Sala actualizarSala(Sala sala); //Actualiza datos de una sala UPDATE
	
	public void eliminarSala(Integer id);// Elimina la sala DELETE
}
