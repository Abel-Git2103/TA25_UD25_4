package mainAPP.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainAPP.dto.Sala;

public interface ISalaDao extends JpaRepository<Sala, Integer> {

}
