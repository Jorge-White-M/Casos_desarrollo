package com.comfenalco.Casos_desarrollo.Controller;

/**
 *
 * @author jorge
 */
import com.comfenalco.Casos_desarrollo.Model.Camion;
import com.comfenalco.Casos_desarrollo.Service.CamionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/camiones")
public class CamionController {
    
    private final CamionService camionService;
    
    public CamionController(CamionService camionService){
        this.camionService = camionService;
    }
    
    @PostMapping
    public ResponseEntity<Camion> crearCamion(@RequestBody Camion camion){
        return ResponseEntity.ok(camionService.crearCamion(camion));
    }
    
    @GetMapping("/{placa}")
    public ResponseEntity<Camion> buscarPorPlaca(@PathVariable String placa) {
        return camionService.buscarPorPlaca(placa)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
