public class Main {
    public static void main(String[] args) {

        String username = "Vasya";
        String passwd = "qwerty";

        Authorizator auth = new Authorizator();
        try
        {
            auth.authorizate(username, passwd);
        }
        catch (SecurityException ex)
        {
            // Пользователь не прошел аутентификацию
        }
    }
}