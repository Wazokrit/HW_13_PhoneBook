package models;

public class User {
    String email;
    String password;

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User whithEmail(String email) {
        if (email.isEmpty() || email.length()==0)
            email="";
        else this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User whithPassword(String password) {
        if (password.isEmpty() || password.length()==0)
            password="";
       else  this.password = password;
       return this;

    }
}
