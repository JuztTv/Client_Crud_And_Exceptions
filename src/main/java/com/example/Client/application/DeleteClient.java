package com.example.Client.application;
import com.example.Client.domain.entities.Client;
import com.example.Client.domain.services.DeleteClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class DeleteClient {

    private final DeleteClientService deleteClientService;

    public void deleteClient(Client client) {
        deleteClientService.deleteClient(client);
    }
}