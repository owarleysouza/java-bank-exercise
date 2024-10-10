//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bank Account");

        Scanner myScannerObject = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta");
        int accountNumber = Integer.parseInt(myScannerObject.nextLine());

        System.out.println("Por favor, digite a agência da conta");
        String bankBranch = myScannerObject.nextLine();

        System.out.println("Por favor, digite o nome do cliente");
        String clientName = myScannerObject.nextLine();

        System.out.println("Por favor, digite o saldo da conta");
        double accountBalance = Double.parseDouble(myScannerObject.nextLine());

        String output = String.format("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.", clientName, bankBranch, accountNumber, accountBalance);
        System.out.println(output);
    }
}