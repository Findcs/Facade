abstract class User
{
    protected String username;
    protected String passwd;

    public abstract String getUserRole();

    public String getUsername() {
        return username;
    }

    public String getPasswd() {
        return passwd;
    }
}