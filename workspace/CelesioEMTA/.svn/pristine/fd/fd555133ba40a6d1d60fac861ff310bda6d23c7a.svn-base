package api;

public class Identity implements Entity {
    private long id;
    private String login;
    private String password;
    private String email;

    public Identity() {
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public static Identity parseFromString(String arg) {
        Identity identity = new Identity();
        String[] s = arg.split(";");
        identity.setLogin(s[0]);
        identity.setPassword(s[1]);
        identity.setEmail(s[2]);
        return identity;
    }
}
