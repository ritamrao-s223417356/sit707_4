package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{
	private static final String CORRECT_USERNAME = "ritam";
    private static final String CORRECT_PASSWORD = "rao";
    private static final String CORRECT_VALIDATION_CODE = "123456";
    
	@Test
	public void testStudentIdentity() {
		String studentId = "s223417356";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Ritam Sunil Rao";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
    public void testEmptyUsernameEmptyPassword() {
        LoginStatus status = LoginForm.login(null, null);
        Assert.assertFalse("Login should fail with empty username and password", status.isLoginSuccess());
    }

    @Test
    public void testEmptyUsernameWrongPassword() {
        LoginStatus status = LoginForm.login(null, "wrong");
        Assert.assertFalse("Login should fail with empty username and wrong password", status.isLoginSuccess());
    }

    @Test
    public void testEmptyUsernameCorrectPassword() {
        LoginStatus status = LoginForm.login(null, CORRECT_PASSWORD);
        Assert.assertFalse("Login should fail with empty username and correct password", status.isLoginSuccess());
    }

    @Test
    public void testWrongUsernameEmptyPassword() {
        LoginStatus status = LoginForm.login("wrong", null);
        Assert.assertFalse("Login should fail with wrong username and empty password", status.isLoginSuccess());
    }

    @Test
    public void testCorrectUsernameEmptyPassword() {
        LoginStatus status = LoginForm.login(CORRECT_USERNAME, null);
        Assert.assertFalse("Login should fail with correct username and empty password", status.isLoginSuccess());
    }

    @Test
    public void testCorrectUsernameCorrectPassword() {
        LoginStatus status = LoginForm.login(CORRECT_USERNAME, CORRECT_PASSWORD);
        Assert.assertTrue("Login should succeed with correct username and password", status.isLoginSuccess());
    }

    @Test
    public void testEmptyUsernameEmptyPasswordWrongValCode() {
        boolean validCode = LoginForm.validateCode("wrong");
        Assert.assertFalse("Validation code should be invalid", validCode);
    }

    @Test
    public void testEmptyUsernameEmptyPasswordCorrectValCode() {
        boolean validCode = LoginForm.validateCode(CORRECT_VALIDATION_CODE);
        Assert.assertTrue("Validation code should be valid", validCode);
    }

    @Test
    public void testEmptyUsernameWrongPasswordEmptyValCode() {
        LoginStatus status = LoginForm.login(null, "wrong");
        Assert.assertFalse("Login should fail with empty username and wrong password", status.isLoginSuccess());
    }

    @Test
    public void testEmptyUsernameCorrectPasswordEmptyValCode() {
        boolean validCode = LoginForm.validateCode(null);
        Assert.assertFalse("Validation code should be invalid", validCode);
    }

    @Test
    public void testEmptyUsernameCorrectPasswordWrongValCode() {
        boolean validCode = LoginForm.validateCode("wrong");
        Assert.assertFalse("Validation code should be invalid", validCode);
    }

    @Test
    public void testEmptyUsernameCorrectPasswordCorrectValCode() {
        boolean validCode = LoginForm.validateCode(CORRECT_VALIDATION_CODE);
        Assert.assertTrue("Validation code should be valid", validCode);
    }

    @Test
    public void testWrongUsernameEmptyPasswordCorrectValCode() {
        LoginStatus status = LoginForm.login("wrong", null);
        Assert.assertFalse("Login should fail with wrong username and empty password", status.isLoginSuccess());
    }

    @Test
    public void testCorrectUsernameEmptyPasswordCorrectValCode() {
        boolean validCode = LoginForm.validateCode(CORRECT_VALIDATION_CODE);
        Assert.assertTrue("Validation code should be valid", validCode);
    }

    @Test
    public void testCorrectUsernameCorrectPasswordEmptyValCode() {
        boolean validCode = LoginForm.validateCode(null);
        Assert.assertFalse("Validation code should be invalid", validCode);
    }

    @Test
    public void testCorrectUsernameCorrectPasswordCorrectValCode() {
        boolean validCode = LoginForm.validateCode(CORRECT_VALIDATION_CODE);
        Assert.assertTrue("Validation code should be valid", validCode);
    }

    @Test
    public void testEmptyUsernameEmptyPasswordEmptyValCode() {
        boolean validCode = LoginForm.validateCode(null);
        Assert.assertFalse("Validation code should be invalid", validCode);
    }

    @Test
    public void testEmptyUsernameEmptyPasswordValidValCode() {
        boolean validCode = LoginForm.validateCode(CORRECT_VALIDATION_CODE);
        Assert.assertTrue("Validation code should be valid", validCode);
    }

    

    

    
    
}
