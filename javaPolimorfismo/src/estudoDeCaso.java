public class estudoDeCaso {
   
    //salario fixo independente 
    public float salario(){
        return 3000.00f;
   }

   //metodo precisa que o dev passe os valores corretos
   public float salario(int numHorasExtras, float valorHoraExtra){
        return (3000.00f+(numHorasExtras*valorHoraExtra));
   }


   //comissao: recebem % sobre as vendas
   public float salario(float percentual, float valorVenda){
        return (valorVenda * (percentual/100));
   }

   //assalariados+comissionados
   public float salario(float salBase, float totalVendas, float percentual){
        return (salBase+(totalVendas*(percentual/100)));
   }
}
