package za.ac.cput.proxyPatternDemo;

/**
 * Created by student on 2015/03/10.
 */
public class Operator {
    private String username;
    private String password;

    Operator(String u,String p)
    {
        username = u; password = p;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
