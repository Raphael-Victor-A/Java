public class App {
    public static void main(String[] args) throws Exception {
        folhaDePagamento folha = new folhaDePagamento();

        float sal1 = folha.salario(1, 1518.00f);
        float sal2 = folha.salario(100.00f, 10);
        float sal3 = folha.salario(100.00f, 10, 200.00f);

        System.out.println("Salario 1: " + sal1);
        System.out.println("Salario 2: " + sal2);
        System.out.println("Salario 3: " + sal3);

        estudoDeCaso folha2 = new estudoDeCaso();
        float sal4 = folha2.salario();
        float sal5 = folha2.salario(50, 10);
        float sal6 = folha2.salario(50f,50f);
        float sal7 = folha2.salario(1000, 5, 5);
        System.out.println("Salario 4: " + sal4);
        System.out.println("Salario 5: " + sal5);
        System.out.println("Salario 6: " + sal6);
        System.out.println("Salario 7: " + sal7);


        
    }
}
