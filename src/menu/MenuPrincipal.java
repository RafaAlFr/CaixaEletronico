package menu;
import javax.swing.JOptionPane;
import Manter.ManterCaixa;
import Manter.ManterCliente;


public class MenuPrincipal {
public static void main(String[]args) {
	 ManterCliente cli = new ManterCliente();
	 ManterCaixa cax = new ManterCaixa();
	 
	 String[] opcoes = { "Cadastrar Clientes", "Consultar Conta", "Carregar Caixa", "Saque", "Estatistica", "Finalizar"};
	    var input = (String) JOptionPane.showInputDialog(null, "Opções disponíveis:",
	        "Caixa Eletronico", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                // default                                                            // icon
	        opcoes, // Array of choices
	        opcoes[0]); // Initial choice
	        switch (input) {
	            case "Cadastrar Clientes":
	                validacao();
	                cli.cadastrar();
	                break;
	            case "Consultar Conta":
	                validacao();
	                cli.consultar();
	                break;
	            case "Carregar Caixa":
	                validacao();
					cax.carregar();
	                break;
	            case "Saque":
	                cli.saldo();
	                break;
	            case "Estatistica":
	                validacao();
	                cli.estatistica();
	                break;
	            case "Finalizar":
	                System.out.println("Finalizar");
	                break;
	            
	        }
	    }

public static boolean validacao() {
    String s = "yey";
    for (int i = 0; i < 3; i++) {
        String senha = JOptionPane.showInputDialog(null, "Insira a senha");
        if (senha.equals(s)) {
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
            return true;
        }
    }
    JOptionPane.showMessageDialog(null, "Quantidade máxia de tentativas alcançadas");
    main(null);
    return false;
	}
}

