package com.comfenalco.Casos_desarrollo.Repository;

/**
 *
 * @author jorge
 */
import com.comfenalco.Casos_desarrollo.Model.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConductorRepository extends JpaRepository<Conductor, Long> {
    
}
