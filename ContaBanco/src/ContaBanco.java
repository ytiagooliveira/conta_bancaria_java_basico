import java.util.Scanner;

public class ContaBanco {
    String nroAgencia;
    String nmUsuario;
    int nroConta;
    float saldoUsuario;
    boolean statusConta = false;

    public void ContaBanco(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        String nroAgencia = sc.next();
        System.out.println("Por favor, digite seu nome!");
        String nmUsuario = sc.next();
        System.out.println("Por favor, digite o número do usuário");
        int nroConta = sc.nextInt();
        System.out.println("Por favor, digite seu saldo! ");
        float saldoUsuario = sc.nextFloat();
        statusConta = true;
        System.out.println("Conta criada! ");
        System.out.println("Olá " + nmUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + nroAgencia + ", conta " + nroConta + " e seu saldo " + saldoUsuario + " já está disponível para saque.");
    }
}
