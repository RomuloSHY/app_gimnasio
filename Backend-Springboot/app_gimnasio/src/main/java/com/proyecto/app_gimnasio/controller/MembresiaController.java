package com.proyecto.app_gimnasio.controller;

import com.proyecto.app_gimnasio.entity.Membresia;
import com.proyecto.app_gimnasio.service.MembresiaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membresia")
public class MembresiaController {

    private final MembresiaService membresiaService;

    public MembresiaController(MembresiaService membresiaService){
        this.membresiaService = membresiaService;
    }

    @GetMapping
    public List<Membresia> listarMembresias(){
        return membresiaService.listarMembresias();
    }

    @GetMapping("/{id}")
    public Membresia buscarMembresiaPorId(@PathVariable Long id){
        return membresiaService.buscarMembresiaPorId(id);
    }

    @PostMapping
    public Membresia agregarMembresia(@RequestBody Membresia membresia){
        return membresiaService.agregarMembresia(membresia);
    }

    @PutMapping("/{id}")
    public Membresia modificarMembresia(@PathVariable Long id, @RequestBody Membresia membresia){
        return membresiaService.modificarMembresia(id, membresia);
    }

    @DeleteMapping("/{id}")
    public void eliminarMembresia(@PathVariable Long id){
        membresiaService.eliminarMembresiaPorId(id);
    }
}
