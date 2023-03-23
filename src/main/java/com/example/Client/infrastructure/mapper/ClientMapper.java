package com.example.Client.infrastructure.mapper;

import com.example.Client.domain.entities.Client;
import com.example.Client.infrastructure.dto.ClientDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;


@Mapper(componentModel = ComponentModel.SPRING)
public interface ClientMapper {

    Client toClientEntity (ClientDto clientDto);

    ClientDto toClientDto (Client client);
}
