
package gestiongastos;

public class UsernameDomain {
    private String name;
    private String email;
    private int identification; 

    public UsernameDomain(String name, String email, int identification) {
        this.name = name;
        this.email = email;
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }  
}
