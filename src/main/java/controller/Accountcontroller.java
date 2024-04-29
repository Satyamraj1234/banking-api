package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.Accountdto;
import service.Accountservice;

@RestController
@RequestMapping("/api/accounts")
public class Accountcontroller {
    private final Accountservice accountservice;

    // Constructor injection
    public Accountcontroller(Accountservice accountservice) {
        this.accountservice = accountservice;
    }

    // Endpoint for creating a new account
    @PostMapping
    public ResponseEntity<Accountdto> addaccount(@RequestBody Accountdto accountdto) {
        // Perform validation
        if (accountdto == null || accountdto.getAccountHolderName() == null || accountdto.getBalance() < 0) {
            // Return bad request if validation fails
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        try {
            // Create the account using the service
            Accountdto createdAccount = accountservice.createAccount(accountdto);
            // Return the created account with a status of CREATED
            return new ResponseEntity<>(createdAccount, HttpStatus.CREATED);
        } catch (Exception e) {
            // Handle any exceptions and return internal server error
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
