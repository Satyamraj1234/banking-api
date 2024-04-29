package Mapper;

import dto.AccountDTO; // Follow Java naming conventions
import entity.Account;

public class AccountMapper { // Class name capitalized
    // Convert AccountDTO into Account JPA entity
    public static Account mapToAccount(AccountDTO accountDTO) { // Method name camelCase
        Account account = new Account(accountDTO.getId(), accountDTO.getAccountHolderName(), accountDTO.getBalance()); // Variable name camelCase
        return account;
    }

    // Convert JPA entity into AccountDTO
    public static AccountDTO mapToAccountDTO(Account account) { // Method name camelCase
        AccountDTO accountDTO = new AccountDTO(account.getId(), account.getAccountHolderName(), account.getBalance()); // Variable name camelCase
        return accountDTO;
    }
}
