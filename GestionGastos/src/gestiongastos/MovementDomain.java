
package gestiongastos;


public class MovementDomain {
    private int date;
    private float account;
    private String category;
    private String nota;

    public MovementDomain(int date, float account, String category, String nota) {
        this.date = date;
        this.account = account;
        this.category = category;
        this.nota = nota;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public float getAccount() {
        return account;
    }

    public void setAccount(float account) {
        this.account = account;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    
    
}
