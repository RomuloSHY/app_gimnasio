package com.proyecto.app_gimnasio.controller;

import com.proyecto.app_gimnasio.entity.Cliente;
import com.proyecto.app_gimnasio.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService=clienteService;
    }

    @GetMapping
    public List<Cliente> listarClientes(){
        return clienteService.listarClientes();
    }

    @GetMapping("/{id}")
    public Cliente buscarClientePorId(@PathVariable Long id){
        return clienteService.buscarClientePorId(id);
    }

    @PostMapping
    public Cliente agregarCliente(@RequestBody Cliente cliente){
        return clienteService.agregarCliente(cliente);
    }

    @PutMapping({"/{id}"})
    public Cliente modificarClientePorId(@PathVariable Long id, @RequestBody Cliente cliente){
        return clienteService.modificarClientePorId(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminarClientePorId(@PathVariable Long id){
        clienteService.eliminarClientePorId(id);
    }

}
