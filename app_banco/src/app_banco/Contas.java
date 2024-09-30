package app_banco;

import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        ContaBancaria conta1 = new ContaBancaria("João", 12345);
        ContaPoupanca conta2 = new ContaPoupanca("Maria", 54321, 10);
        ContaEspecial conta3 = new ContaEspecial("José", 67890, 500.0f);
        
        
        conta1.depositar(1000);
        conta2.depositar(2000);
        conta3.depositar(500);
        
        
        conta1.sacar(300);
        conta2.sacar(2500); 
        conta3.sacar(800); 
        
    
        conta2.calcularNovoSaldo(0.05f); 
        
        
        conta1.mostrarDados();
        conta2.mostrarDados();
        conta3.mostrarDados();

        scanner.close();
    }
}
