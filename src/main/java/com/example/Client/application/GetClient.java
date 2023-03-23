package com.example.Client.application;

import com.example.Client.domain.entities.Client;
import com.example.Client.domain.services.GetClientService;
import com.example.Client.shared.exception.base.InactiveClientException;
import com.example.Client.shared.exception.base.NotFoundClientException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class GetClient {

    private final GetClientService getClientService;

    public Client getClient(String id){

        Client client = getClientService.getClient(id);

        if(client == null){
            throw new NotFoundClientException("No customer found in database with that ID");
        }
        if(!client.getState()){
            throw new InactiveClientException("the client is inactive");
        }

        return client;

    }

    public List<Client> getListClient(){

        return getClientService.getListClient();
    }



}
