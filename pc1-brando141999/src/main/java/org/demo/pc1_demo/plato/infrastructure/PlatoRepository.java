package org.demo.pc1_demo.plato.infrastructure;

import org.demo.pc1_demo.plato.domain.Plato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatoRepository extends JpaRepository<Plato,Long>{
}
