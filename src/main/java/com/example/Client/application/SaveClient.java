package com.example.Client.application;

import com.example.Client.domain.entities.Client;
import com.example.Client.domain.services.SaveClientService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class SaveClient {

    private final SaveClientService saveClientService;

    public Client saveClient(Client client){
        return saveClientService.saveClient(client);
    }
}
