public class principal {

    public static void main(String[] args) {

        Pessoa titular = new Pessoa();
        titular.nome = "João Alfredo";
        titular.documento = "032.656.584-15";

        Pessoa titular2 = new Pessoa();
        titular2.nome = "Maria Jose";
        titular2.documento = "258.233.458-15";


        Conta minhaConta = new Conta();
        System.out.println(minhaConta.titular = titular);
        System.out.println(minhaConta.agencia = 1020);
        System.out.println(minhaConta.numero = 10123);
        System.out.println(minhaConta.saldo = 0.0);

        Conta suaConta = new Conta();
        System.out.println(suaConta.titular= titular2);
        System.out.println(suaConta.agencia = 1020);
        System.out.println(suaConta.numero = 10123);
        System.out.println(suaConta.saldo = 1000.0);
    }
}
