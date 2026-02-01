package pt.example.banking.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pt.example.banking.domain.service.AccountService;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/accounts")
public class AccountController {

    private final AccountService service;

    @PostMapping("/transfer")
    public String transfer(@RequestParam Long fromId,
                           @RequestParam Long toId,
                           @RequestParam double amount) {
        double fee = service.transfer(fromId, toId, amount);
        return "Transfer successful! Fee: " + fee;
    }
}
