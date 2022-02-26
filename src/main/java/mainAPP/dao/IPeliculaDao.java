package mainAPP.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainAPP.dto.Pelicula;

public interface IPeliculaDao extends JpaRepository<Pelicula, Integer> {

}
