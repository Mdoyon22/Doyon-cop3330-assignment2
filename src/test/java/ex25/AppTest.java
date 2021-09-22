/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */

package ex25;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    static App ex25 = new App();

    @Test
    public void test_passwordValidator() {


        String[] samplePasswords = {"12345", "hey", "heythere665", "hello12345%?%!"};

        assertEquals(ex25.passwordValidator(samplePasswords[0]), 0);
        assertEquals(ex25.passwordValidator(samplePasswords[1]), 1);
        assertEquals(ex25.passwordValidator(samplePasswords[2]), 2);
        assertEquals(ex25.passwordValidator(samplePasswords[3]), 3);

        assertNotEquals(ex25.passwordValidator(samplePasswords[0]), 1);
        assertNotEquals(ex25.passwordValidator(samplePasswords[1]), 3);
        assertNotEquals(ex25.passwordValidator(samplePasswords[2]), 1);
        assertNotEquals(ex25.passwordValidator(samplePasswords[3]), 2);

    }

}