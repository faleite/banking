package pt.example.banking.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pt.example.banking.domain.exceptions.AccountNotFoundException;
import pt.example.banking.domain.exceptions.InsufficientFundsException;
import pt.example.banking.domain.model.Account;
import pt.example.banking.domain.repository.AccountRepository;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountRepository repository;

    public double transfer(Long fromId, Long toId, double amount) {
        Account from = repository.findById(fromId)
                .orElseThrow(() -> new AccountNotFoundException(fromId));
        Account to = repository.findById(toId)
                .orElseThrow(() -> new AccountNotFoundException(toId));

        double fee = calculateFee(amount);
        double totalDebit = amount + fee;

        if (from.getBalance() < totalDebit) {
            throw new InsufficientFundsException(fromId, totalDebit, from.getBalance());
        }

        from.setBalance(from.getBalance() - totalDebit);
        to.setBalance(to.getBalance() + amount + fee);
        repository.save(from);
        repository.save(to);

        return fee;
    }

    private double calculateFee(double amount) {
        if (amount < 100) return 1.0;
        else if (amount < 500) return amount * 0.01;
        else return amount * 0.005;
    }
}
