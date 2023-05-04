package Manter;
import javax.swing.JOptionPane;
import been.Cliente;
import dao.DaoCliente;
import menu.MenuPrincipal;
import Controller.ControllerCliente;

public class ManterCliente {	
	static Cliente[] clientes = new Cliente[20];
	static int indice = 0;
	 ManterCaixa cax = new ManterCaixa();
	static int aitau = 0;static int asant = 0;static int abras = 0;static int ahsb = 0;
	static int bq = 0;

	public void cadastrar() {
		
	        String nome = JOptionPane.showInputDialog("Nome:");
	        int rg = Integer.parseInt(JOptionPane.showInputDialog( "RG:"));
	        int cpf = Integer.parseInt(JOptionPane.showInputDialog("CPF:"));
	        String endereco = JOptionPane.showInputDialog( "Endereço:");
	        String telefone = JOptionPane.showInputDialog( "Telefone:");
	        int banco = Integer.parseInt(JOptionPane.showInputDialog( " Itaú = 1  \n Santander = 2 \n Bradesco = 3 \n HSBC =4"));
	        int conta = Integer.parseInt(JOptionPane.showInputDialog("Conta:"));
	        String senha = JOptionPane.showInputDialog("Senha:");
	        int saldo = Integer.parseInt(JOptionPane.showInputDialog("Saldo:"));

	        Cliente C = new Cliente(nome, rg, cpf, endereco, telefone, banco, conta, senha, saldo);	        
	        clientes[indice] = C;
	        for(int i = 0; i<clientes.length;i++) {
	        	if(clientes[i]!=null) {
		        	System.out.println(clientes[i]);
	        	}
	        }
	        indice++;
	        MenuPrincipal.main(null);
	   }
	public void consultar() {
		int rgp = Integer.parseInt(JOptionPane.showInputDialog("Digite o RG"));
		for(int i = 0; i<clientes.length;i++) {
			if(clientes[i] !=null) {
				if(clientes[i].getRg()==rgp) {
					ControllerCliente cli = new ControllerCliente();
					Cliente saidacli = cli.cadastrar(clientes[i]);
					JOptionPane.showInternalMessageDialog(null, saidacli);
				}
			}
			
		}MenuPrincipal.main(null);

	}
	
	public void saldo() {
		String ss = JOptionPane.showInputDialog(null, "Insira sua senha");
		for(int i =0;i<clientes.length;i++) {
			if(clientes[i] !=null) {
				if(clientes[i].getSenha().equals(ss)) {
			        int saque = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia que deseja sacar"));
			        int chequagem = (int) (clientes[i].getSaldo() - saque);
			        if(chequagem >=0) {
			        	clientes[i].setSaldo(chequagem);
				        int bb = clientes[i].getBanco();
				        if(bb == 1) {
				        	aitau++; bq++;
				        	cax.sacar(saque);
				        }
				        if(bb == 2) {
				        	asant++;bq++;
				        	System.out.println(asant+ bq);
				        	cax.sacar(saque);
				        }
				        if(bb == 3) {
				        	abras++;bq++;
				        	cax.sacar(saque);
				        }
				        if(bb == 4) {
				        	ahsb++;bq++;
				        	cax.sacar(saque);
				        }
			        }else {
			        	JOptionPane.showMessageDialog(null, "Saldo insuficiente");
						MenuPrincipal.main(null);
			        }
			        
				}
			}

		}
		MenuPrincipal.main(null);
	}
	
	public void estatistica() {
		JOptionPane.showMessageDialog(null, "Saques do Itau :"+aitau+"\n Saques do Santander :"+asant+"\n Saques do Bradesco :"+abras+"\n Saques do HSBC :"+ahsb);
		if(aitau>asant && aitau>abras && aitau>ahsb){
			JOptionPane.showMessageDialog(null,"O banco com a maior quantidade de saques foi o Itau com :"+aitau+" saques");
			JOptionPane.showMessageDialog(null,"A quantidade de saques foi de :"+bq);
			if(abras<asant && abras<ahsb) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Bradesco com :"+abras+" saques");
				MenuPrincipal.main(null);
			}if(asant<abras && asant<ahsb) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Santander com :"+asant+" saques");
				MenuPrincipal.main(null);
			}if(ahsb<abras && ahsb<asant) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Hsbc com :"+ahsb+" saques");
				MenuPrincipal.main(null);
			}else {
				JOptionPane.showMessageDialog(null,"Houve dois ou mais bancos com a menor quantia de saques");
				MenuPrincipal.main(null);
			}

		}if(abras>asant && abras>aitau && abras>ahsb){
			JOptionPane.showMessageDialog(null,"O banco com a maior quantidade de saques foi o Bradesco com :"+abras+" saques");
			JOptionPane.showMessageDialog(null,"A quantidade de saques foi de :"+bq);
			if(aitau<asant && aitau<ahsb) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Itau com :"+aitau+" saques");
				MenuPrincipal.main(null);
			}if(asant<aitau && asant<ahsb) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Santander com :"+asant+" saques");
				MenuPrincipal.main(null);
			}if(ahsb<aitau && ahsb<asant) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Hsbc com :"+ahsb+" saques");
				MenuPrincipal.main(null);
			}else {
				JOptionPane.showMessageDialog(null,"Houve dois ou mais bancos com a menor quantia de saques");
				MenuPrincipal.main(null);
			}

		}if(asant>aitau && asant>abras && asant>ahsb){
			JOptionPane.showMessageDialog(null,"O banco com a maior quantidade de saques foi o Santander com :"+asant+" saques");
			JOptionPane.showMessageDialog(null,"A quantidade de saques foi de :"+bq);
			if(abras<aitau && abras<ahsb) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Bradesco com :"+abras+" saques");
				MenuPrincipal.main(null);
			}if(aitau<abras && aitau<ahsb) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Itau com :"+aitau+" saques");
				MenuPrincipal.main(null);
			}if(ahsb<abras && ahsb<aitau) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Hsbc com :"+ahsb+" saques");
				MenuPrincipal.main(null);
			}else {
				JOptionPane.showMessageDialog(null,"Houve dois ou mais bancos com a menor quantia de saques");
				MenuPrincipal.main(null);
			}
		}if(ahsb>asant && ahsb>abras && ahsb>aitau){
			JOptionPane.showMessageDialog(null,"O banco com a maior quantidade de saques foi o HSBC com :"+ahsb+" saques");
			JOptionPane.showMessageDialog(null,"A quantidade de saques foi de :"+bq);
			JOptionPane.showMessageDialog(null,"O banco com a maior quantidade de saques foi o Itau com :"+aitau+" saques");
			JOptionPane.showMessageDialog(null,"A quantidade de saques foi de :"+bq);
			if(abras<asant && abras<aitau) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Bradesco com :"+abras+" saques");
				MenuPrincipal.main(null);
			}if(asant<abras && asant<aitau) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Santander com :"+asant+" saques");
				MenuPrincipal.main(null);
			}if(aitau<abras && aitau<asant) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Itau com :"+aitau+" saques");
				MenuPrincipal.main(null);
			}else {
				JOptionPane.showMessageDialog(null,"Houve dois ou mais bancos com a menor quantia de saques");
				MenuPrincipal.main(null);
			}
			}else{
			JOptionPane.showMessageDialog(null,"Houve dois ou mais de um banco com o maior saque");
			if(abras<asant && abras<aitau && abras<ahsb) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Bradesco com :"+abras+" saques");
				MenuPrincipal.main(null);
			}if(asant<abras && asant<aitau && asant <ahsb) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Santander com :"+asant+" saques");
				MenuPrincipal.main(null);
			}if(aitau<abras && aitau<asant && aitau<ahsb) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Itau com :"+aitau+" saques");
				MenuPrincipal.main(null);
			}if(ahsb<abras && ahsb<aitau && ahsb<asant) {
				JOptionPane.showMessageDialog(null,"O banco com a menor quantidade de saques foi o Hsbc com :"+ahsb+" saques");
				MenuPrincipal.main(null);
			}else {
				JOptionPane.showMessageDialog(null,"Houve dois ou mais bancos com a menor quantia de saques");
				MenuPrincipal.main(null);
			}
			
		}
		
	}
}
