package com.example.Client.domain.services;

import com.example.Client.domain.entities.Client;

import java.util.List;

public interface GetClientService {

    Client getClient(String id);

    List <Client> getListClient();
}
