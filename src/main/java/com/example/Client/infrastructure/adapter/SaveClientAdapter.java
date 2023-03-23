package com.example.Client.infrastructure.adapter;

import com.example.Client.domain.entities.Client;
import com.example.Client.domain.services.SaveClientService;
import com.example.Client.infrastructure.mapper.ClientMapper;
import com.example.Client.infrastructure.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SaveClientAdapter implements SaveClientService {

    private final ClientRepository clientRepository;

    private final ClientMapper clientMapper;

    @Override
    public Client saveClient(Client client) {
        return clientMapper.toClientEntity(clientRepository.save(clientMapper.toClientDto(client)));
    }
}
