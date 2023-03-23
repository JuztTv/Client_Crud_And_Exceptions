package com.example.Client.application;

import com.example.Client.domain.entities.Client;
import com.example.Client.domain.services.EditClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EditClient {

    private final EditClientService editClientService;

    public void editClient(Client client){
        editClientService.editClient(client);
    }
}
