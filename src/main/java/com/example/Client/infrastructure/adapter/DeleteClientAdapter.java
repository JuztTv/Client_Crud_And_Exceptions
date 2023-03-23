package com.example.Client.infrastructure.adapter;

import com.example.Client.domain.entities.Client;
import com.example.Client.domain.services.DeleteClientService;
import com.example.Client.infrastructure.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@AllArgsConstructor
public class DeleteClientAdapter implements DeleteClientService {
    private final ClientRepository clientRepository;

    @Transactional
    public void deleteClient(Client client) {
        clientRepository.updateStateClient(client.getId(), client.getState());
    }
}
