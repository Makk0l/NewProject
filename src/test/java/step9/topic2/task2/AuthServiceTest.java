package step9.topic2.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AuthServiceTest {
    @InjectMocks
    private AuthService authService;

    @Mock
    private UserRepository userRepository;
    User user;

    @BeforeEach
    void setUp(){
        user = new User("Petya", "123");
    }
    @Test
    void authenticateUser_true(){
        Mockito.when(userRepository.findUserByUsername(user.getUsername())).thenReturn(user);

        boolean result = authService.authenticateUser(user.getUsername(), user.getPassword());

        Assertions.assertTrue(result);
        Mockito.verify(userRepository, Mockito.times(1)).findUserByUsername(user.getUsername());
    }
    @Test
    void authenticateUser_false(){
        Mockito.when(userRepository.findUserByUsername(user.getUsername())).thenReturn(user);

        boolean result = authService.authenticateUser(user.getUsername(), "321");

        Assertions.assertFalse(result);
        Mockito.verify(userRepository, Mockito.times(1)).findUserByUsername(user.getUsername());
    }
    @Test
    void authenticateUser_userNotFound(){
        Mockito.when(userRepository.findUserByUsername("Masha")).thenReturn(null);

        boolean result = authService.authenticateUser("Masha", user.getPassword());

        Assertions.assertFalse(result);
        Mockito.verify(userRepository, Mockito.times(1)).findUserByUsername("Masha");
    }
}
