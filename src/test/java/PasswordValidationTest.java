import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationTest {

    @Test
    public void passwordValidation() {

        //given
        String password = "password11";


        //then
        boolean isValid = PasswordValidation.validatePassword(password);

        //when
        Assertions.assertEquals(true, isValid);

    }


    @Test
    public void testFalsePassword() {

        //given
        String password = "pass";


        //then
        boolean isValid = PasswordValidation.validatePassword(password);

        //when
        Assertions.assertEquals(false, isValid);

    }

    @Test
    public void testPasswordIfContainsNumber() {

        //given
        String password = "passwort1";


        //then
        boolean hasNumber = PasswordValidation.isThereNumber(password);

        //when
        Assertions.assertEquals(true, hasNumber);

    }

    @Test
    public void testPasswordIfContainsNoNumber() {

        //given
        String password = "passwort";


        //then
        boolean hasNumber = PasswordValidation.isThereNumber(password);

        //when
        Assertions.assertEquals(false, hasNumber);

    }

    @Test
    public void testPasswordOnSmallOrLargeLetters() {

        //given
        String password = "passwort";


        //then
        boolean smallOrLarge = PasswordValidation.isThereSmallBigLetter(password);

        //when
        Assertions.assertEquals(true, smallOrLarge);
    }

    @Test
    public void testPasswordOnSmallOrLargeLetters2() {

        //given
        String password = "passwort";


        //then
        boolean smallOrLarge2 = PasswordValidation.isThereSmallBigLetter2(password);

        //when
        Assertions.assertEquals(false, smallOrLarge2);
    }
}