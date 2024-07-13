package com.vietcuong.simpleValidation.service;

import com.vietcuong.simpleValidation.entity.Client;
import com.vietcuong.simpleValidation.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    //    private final ObjectValidator<Client> clientObjectValidator;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
        //        this.clientObjectValidator = objectValidator;
    }

    public Client registerClient(Client clientRequest) {
        Client client = new Client();
        client.setFullName(clientRequest.getFullName());
        client.setUsername(clientRequest.getUsername());
        client.setEmail(clientRequest.getEmail());
        client.setDateOfBirth(clientRequest.getDateOfBirth());
        return clientRepository.save(client);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
