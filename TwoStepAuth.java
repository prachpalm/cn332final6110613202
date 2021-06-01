public class TwoStepAuth implements User {
    @Override
    public void login() {
        System.out.println("Login succeeded with 2-Step Authentication");
    }
}
