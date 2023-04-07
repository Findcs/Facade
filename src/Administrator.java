public class Administrator extends User{
    public Administrator(String username, String passwd)
    {
        this.username = username;
        this.passwd = passwd;
    }

    public String getUserRole()
    {
        return "ADMINISTRATOR";
    }
}
