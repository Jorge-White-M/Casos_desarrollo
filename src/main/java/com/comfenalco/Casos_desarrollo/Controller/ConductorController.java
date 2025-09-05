package com.comfenalco.Casos_desarrollo.Controller;

/**
 *
 * @author jorge
 */
import com.comfenalco.Casos_desarrollo.Model.Conductor;
import com.comfenalco.Casos_desarrollo.Service.ConductorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conductores")
public class ConductorController {

    private final ConductorService conductorService;

    public ConductorController(ConductorService conductorService) {
        this.conductorService = conductorService;
    }

    @PostMapping
    public ResponseEntity<Conductor> crearConductor(@RequestBody Conductor conductor) {
        return ResponseEntity.ok(conductorService.crearConductor(conductor));
    }

}
