public class CalculadoraJurosCompostosTempo {
    public static void main(String[] args) {
        double valorAcumulado = 10_000;
        double taxaJurosMEnsal = 0.8;
        int periodoemMeses = 12;

        for (int mes = 1; mes <= periodoemMeses; mes++){
            valorAcumulado += valorAcumulado * taxaJurosMEnsal / 100 ;
            System.out.println("Mês " + mes + " = " + valorAcumulado);
        }
    }
}
