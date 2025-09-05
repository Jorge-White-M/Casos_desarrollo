package com.comfenalco.Casos_desarrollo.Repository;

/**
 *
 * @author jorge
 */
import com.comfenalco.Casos_desarrollo.Model.Camion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CamionRepository extends JpaRepository<Camion, Long> {
    Optional<Camion> findByPlaca(String placa);
}
