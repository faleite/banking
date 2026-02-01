package pt.example.banking.domain.exceptions;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(Long id, double required, double available) {
        super("Account " + id + " has insufficient funds: required " + required + ", available " + available);
    }
}
