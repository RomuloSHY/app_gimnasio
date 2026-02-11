package com.proyecto.app_gimnasio.service;

import com.proyecto.app_gimnasio.entity.Membresia;
import com.proyecto.app_gimnasio.repository.MembresiaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembresiaService {

    private final MembresiaRepository membresiaRepository;

    public MembresiaService(MembresiaRepository membresiaRepository){
        this.membresiaRepository = membresiaRepository;
    }

    public List<Membresia> listarMembresias(){
        return membresiaRepository.findAll();
    }

    public Membresia buscarMembresiaPorId(Long id){
        return membresiaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Membresia no encontrada"));
    }

    public Membresia agregarMembresia(Membresia membresiaNueva){
        return membresiaRepository.save(membresiaNueva);
    }

    public Membresia modificarMembresia(Long id, Membresia membresiaActual){
        Membresia membresiaModificada = membresiaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Membresia no encontrada"));

        membresiaModificada.setTipo(membresiaActual.getTipo());
        membresiaModificada.setPrecio(membresiaActual.getPrecio());
        membresiaModificada.setDuracionMeses(membresiaActual.getDuracionMeses());

        return membresiaRepository.save(membresiaModificada);
    }

    public void eliminarMembresiaPorId(Long id){
        Membresia membresiaEliminada = membresiaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Membresia no encontrada"));

        membresiaRepository.delete(membresiaEliminada);
    }
}
