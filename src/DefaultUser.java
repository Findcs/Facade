class DefaultUser extends User
        {
        public DefaultUser(String username, String passwd)
        {
            this.username = username;
            this.passwd = passwd;
        }

        public  String getUserRole()
        {
            return "DEFAULT_USER";
        }

        }


