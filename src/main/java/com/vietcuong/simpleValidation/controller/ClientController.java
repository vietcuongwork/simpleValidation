package com.vietcuong.simpleValidation.controller;

import com.vietcuong.simpleValidation.common.ResponseStatus;
import com.vietcuong.simpleValidation.entity.Client;
import com.vietcuong.simpleValidation.response.ClientControllerResponse;
import com.vietcuong.simpleValidation.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    // Handle POST requests to "/clientRegister" endpoint
    @PostMapping("/clientRegister")
    public ClientControllerResponse<Client> clientRegister(
            @Valid
            @RequestBody
            Client clientRequest) { // @Valid annotation
        // triggers validation
        ClientControllerResponse<Client> response = new ClientControllerResponse<>();
        response.setStatusCode(ResponseStatus.GlobalError.CLIENT_REGISTRATION_SUCCESS.getCode());
        response.setDescription(ResponseStatus.GlobalError.CLIENT_REGISTRATION_SUCCESS.getDescription());
        response.setContent(clientService.registerClient(clientRequest));
        return response;
    }

    @GetMapping("/getAllClients")
    private ResponseEntity<?> getAllClients(){
        return ResponseEntity.ok(clientService.getAllClients());
    }
}