package com.proyecto.app_gimnasio.service;

import com.proyecto.app_gimnasio.repository.MembresiaRepository;
import org.springframework.stereotype.Service;

@Service
public class MembresiaService {

    private final MembresiaRepository membresiaRepository;

    public MembresiaService(MembresiaRepository membresiaRepository){
        this.membresiaRepository = membresiaRepository;
    }
}
