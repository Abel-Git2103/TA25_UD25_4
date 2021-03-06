package mainAPP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainAPP.dao.IPeliculaDao;
import mainAPP.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService {

	@Autowired
	IPeliculaDao iPeliculaDao;

	@Override
	public List<Pelicula> listarPelicula() {
		return iPeliculaDao.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		return iPeliculaDao.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(Integer id) {
		return iPeliculaDao.findById(id).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		return iPeliculaDao.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Integer id) {
		iPeliculaDao.deleteById(id);
	}

}
