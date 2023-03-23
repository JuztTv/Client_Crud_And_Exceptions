package com.example.Client.infrastructure.adapter;

import com.example.Client.domain.entities.Client;
import com.example.Client.domain.services.EditClientService;
import com.example.Client.infrastructure.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@AllArgsConstructor
@Service
public class EditClientAdapter implements EditClientService {

    private final ClientRepository clientRepository;

    @Transactional
    public void editClient(Client client) {
        clientRepository.updateClient(client.getId(),
                client.getName(),
                client.getLastname());
    }

}
