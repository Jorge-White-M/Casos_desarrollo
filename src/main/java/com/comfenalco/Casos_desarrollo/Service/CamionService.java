package com.comfenalco.Casos_desarrollo.Service;

/**
 *
 * @author jorge
 */
import com.comfenalco.Casos_desarrollo.Model.Camion;
import com.comfenalco.Casos_desarrollo.Repository.CamionRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CamionService {
    private final CamionRepository camionRepository;

    public CamionService(CamionRepository camionRepository) {
        this.camionRepository = camionRepository;
    }

    public Camion crearCamion(Camion camion) {
        return camionRepository.save(camion);
    }

    public Optional<Camion> buscarPorPlaca(String placa) {
        return camionRepository.findByPlaca(placa);
    }
}
