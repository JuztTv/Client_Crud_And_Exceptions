package com.example.Client.infrastructure.api.controller;

import com.example.Client.application.DeleteClient;
import com.example.Client.application.EditClient;
import com.example.Client.application.GetClient;
import com.example.Client.application.SaveClient;
import com.example.Client.domain.entities.Client;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/client")
public class ClientController {

    private final DeleteClient deleteClient;
    private final EditClient editClient;
    private final GetClient getClient;
    private final SaveClient saveClient;

    @PostMapping
    public ResponseEntity<Client> saveClient(@RequestBody Client client){
        return new ResponseEntity<>(saveClient.saveClient(client), HttpStatus.CREATED);

    }

    @PutMapping(value = "/edit")
    public void editClient(@RequestBody Client client){
        editClient.editClient(client);
    }
    @PutMapping(value = "/changeStatus")
    public void changeStatus(@RequestBody Client client){
        deleteClient.deleteClient(client);
    }
    @GetMapping(value = "/search/{id}")
    public ResponseEntity<Client> getClient(@PathVariable("id") String id){
        return ResponseEntity.ok(getClient.getClient(id));
    }
    @GetMapping(value = "/searchAll")
    public ResponseEntity<List<Client>> getListClient(){
        return ResponseEntity.ok(getClient.getListClient());
    }

}
