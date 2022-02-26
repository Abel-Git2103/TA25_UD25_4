package mainAPP.service;

import java.util.List;

import mainAPP.dto.Pelicula;

public interface IPeliculaService {

	public List<Pelicula> listarPelicula(); //Listar All 
	
	public Pelicula guardarPelicula(Pelicula pelicula);	//Guarda una pelicula CREATE
	
	public Pelicula peliculaXID(Integer id); //Leer datos de una pelicula READ
		
	public Pelicula actualizarPelicula(Pelicula pelicula); //Actualiza datos de una pelicula UPDATE
	
	public void eliminarPelicula(Integer id);// Elimina la pelicula DELETE
}
