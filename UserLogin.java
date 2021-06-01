public class UserLogin {
    private User google;
    private User facebook;
    private User twoStepAuth;

    public UserLogin() {
        google = new Google();
        facebook = new Facebook();
        twoStepAuth = new TwoStepAuth();
    }

    public void loginGoogle() {
        google.login();
    }

    public void loginFacebook() {
        facebook.login();
    }

    public void loginTwoStepAuth() {
        twoStepAuth.login();
    }
}
