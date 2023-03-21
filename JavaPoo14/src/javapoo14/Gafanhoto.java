
package javapoo14;

public class Gafanhoto extends Pessoa {
 
    //atributos
    private String login;
    private int totAssistido;
    
    //construtor

    public Gafanhoto(String login, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    
    
    
    //get e set
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    //metodos
    public void viuMaisUm(){
        System.out.println("Video assistido, voce ganhou experiencia");

    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
 
    
}
