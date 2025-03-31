package controller;
import model.loginM;
import java.util.ArrayList;

public class loginC {

    public ArrayList<loginM> vetLogin;

    public loginC(){
        vetLogin = new ArrayList<loginM>();
    }

    public void cadastroLogin(loginM loginm){
        vetLogin.add(loginm);

    }

    public int consultaPorLogin(String login){
        int posicao =-1;
        for(int i = 0; i<vetLogin.size(); i++){
            if(vetLogin.get(i).getLogin().equals(login)){
                posicao = i;
                break;
            }
        }
        return posicao;
    }
    public String authenticate(String login){
        int posicaoDado = this.consultaPorLogin(login);
        if(posicaoDado != -1){
            return ("Achei");
        }
        return("não achei");
    }
    

}
