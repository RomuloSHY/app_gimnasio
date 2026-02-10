package com.proyecto.app_gimnasio.service;

import com.proyecto.app_gimnasio.entity.Cliente;
import com.proyecto.app_gimnasio.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }

    public Cliente buscarClientePorId(Long id){
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }

    public Cliente agregarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente modificarClientePorId(Long id, Cliente clienteActualizado){

        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        cliente.setNombre(clienteActualizado.getNombre());
        cliente.setApellido(clienteActualizado.getApellido());
        cliente.setDni(clienteActualizado.getDni());
        cliente.setTelefono(clienteActualizado.getTelefono());
        cliente.setEstado(clienteActualizado.getEstado());
        cliente.setMembresia(clienteActualizado.getMembresia());

        return clienteRepository.save(cliente);
    }

    public void eliminarClientePorId(Long id){

        Cliente cliente = clienteRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        clienteRepository.delete(cliente);
    }

}
