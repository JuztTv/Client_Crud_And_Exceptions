package com.example.Client.infrastructure.adapter;

import com.example.Client.domain.entities.Client;
import com.example.Client.domain.services.GetClientService;
import com.example.Client.infrastructure.dto.ClientDto;
import com.example.Client.infrastructure.mapper.ClientMapper;
import com.example.Client.infrastructure.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GetClientAdapter implements GetClientService {

    private final ClientRepository clientRepository;

    private final ClientMapper clientMapper;

    @Override
    public Client getClient(String id) {
        Optional<ClientDto> clientDto = clientRepository.findById(id);
        return clientDto.map(clientMapper::toClientEntity).orElse(null);
    }

    @Override
    public List<Client> getListClient(){

        List<ClientDto> clientsDto = clientRepository.findAll();
        return clientsDto.stream()
                .filter(clientDto -> clientDto.getState() == Boolean.TRUE)
                .map(clientMapper::toClientEntity).toList();
    }

}
