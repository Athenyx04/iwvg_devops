package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        this.user = new User(1, "Manu", "Calvo", new Fraction(1, 1));
    }
}
