public class Authorizator {
    public Authorizator()
    {}
    public void authorizate(String username, String passwd)
    {
        DB db = new SQL("db.sqlite");
        User user = db.search(username);
        if (user.getPasswd() == passwd)
        {
            System.out.println("good");
            // все хорошо, пользователь опознан
        }
        else
        {
            // что-то пошло не так
            throw new SecurityException("Wrong password or username!");
        }
        }
    }
