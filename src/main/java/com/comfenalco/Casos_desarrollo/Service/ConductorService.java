package com.comfenalco.Casos_desarrollo.Service;

/**
 *
 * @author jorge
 */
import com.comfenalco.Casos_desarrollo.Model.Conductor;
import com.comfenalco.Casos_desarrollo.Repository.ConductorRepository;
import org.springframework.stereotype.Service;

@Service
public class ConductorService {

    private final ConductorRepository conductorRepository;

    public ConductorService(ConductorRepository conductorRepository) {
        this.conductorRepository = conductorRepository;
    }

    public Conductor crearConductor(Conductor conductor) {
        return conductorRepository.save(conductor);
    }
}
