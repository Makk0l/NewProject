package step9.topic2.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {

    @InjectMocks
    private AccountService accountService;

    @Mock
    private AccountRepository accountRepository;

    Account account;

    @BeforeEach
    void setUp() {
        account = new Account("id1", 12.5);
    }

    @Test
    void withdraw_true() {
        Mockito.when(accountRepository.findAccountById(account.getAccountId())).thenReturn(account);

        boolean result = accountService.withdraw(account.getAccountId(), 10);

        Assertions.assertTrue(result);
        Assertions.assertEquals(2.5, account.getBalance());

        Mockito.verify(accountRepository, Mockito.times(1)).findAccountById(account.getAccountId());
        Mockito.verify(accountRepository, Mockito.times(1)).updateAccount(account);
    }

    @Test
    void withdraw_false() {
        Mockito.when(accountRepository.findAccountById("id0")).thenReturn(null);

        boolean result = accountService.withdraw("id0", account.getBalance());

        Assertions.assertFalse(result);

        Mockito.verify(accountRepository, Mockito.times(1)).findAccountById("id0");
        Mockito.verify(accountRepository, Mockito.never()).updateAccount(account);
    }

    @Test
    void withdraw_wrongBalance() {
        Mockito.when(accountRepository.findAccountById(account.getAccountId())).thenReturn(account);

        boolean result = accountService.withdraw(account.getAccountId(), 15.5);

        Assertions.assertFalse(result);
        Assertions.assertEquals(12.5, account.getBalance());

        Mockito.verify(accountRepository, Mockito.times(1)).findAccountById(account.getAccountId());
        Mockito.verify(accountRepository, Mockito.never()).updateAccount(account);
    }
}
