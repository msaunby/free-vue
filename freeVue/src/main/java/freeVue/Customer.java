package freeVue;

public final class Customer {
    private boolean anonymous;
    private String name;
    private String email;
    private String password;

    public Customer() {
        this.anonymous = true;
    }

    public boolean register(String name, String email, String password) {
        // Before we add this user to the database there are a couple of tests -
        // 1. the email address looks like an email address i.e.  name@domain
        // 2. the password meets our rules
        // For now both are trivial tests that could be much improved.
        // We don't check if the user is already in the database - we can leave that to
        // the database (if properly configured).
        if (email.contains("@") && password.length() > 5) 
        { 
            this.name = name;
            this.email = email;
            this.password = password;
            this.anonymous = false;
            return true;
        }else{
            return false;
        }
    }

    public boolean authenticate(String email, String password){
        // Check if "email" is in our customer database and that password matches the
        // stored password.

        // Not implemented yet, so just return false.
        return false;
    }
}
