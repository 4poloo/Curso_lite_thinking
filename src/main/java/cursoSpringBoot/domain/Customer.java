package cursoSpringBoot.domain;
//Clase POJO

public class Customer {

    //atributos
    private int cod;
    private String name;
    private String username;
    private String password;

    //Constructor

    public Customer(int cod, String name, String username, String password) {
        this.cod = cod;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
