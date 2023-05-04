package Manter;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import been.Caixa;
import been.Cliente;
import dao.DaoCaixa;
import menu.MenuPrincipal;
import Controller.ControllerCaixa;

public class ManterCaixa {
	static Caixa[] nota = new Caixa[1];
	
	public void carregar() {
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de notas de 2"));
		int n5 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de notas de 5"));
		int n10 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de notas de 10"));
		int n20 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de notas de 20"));
		int n50 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de notas de 50"));
		int n100 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de notas de 100"));		
		
		if(nota[0] != null) {
			int q100 = nota[0].getN100(); int q50 = nota[0].getN50(); int q20 = nota[0].getN20(); int q10 = nota[0].getN10();int q5 = nota[0].getN5(); int q2 = nota[0].getN2();
			n2 = q2 + n2; n5 = q5 + n5; n10 = q10 + n10; n20 = q20 + n20; n50 = q50 + q50; n100 = q100 + n100;
		}
		
		Caixa N = new Caixa(n2, n5, n10, n20, n50, n100);
		ControllerCaixa contcaixa = new ControllerCaixa();
		Caixa saidacaixa = contcaixa.carregar(N);
		nota[0] = N;
		
        JOptionPane.showMessageDialog(null, saidacaixa);
		System.out.println(nota[0]);
        MenuPrincipal.main(null);
	}
			
	
	public void sacar(int saque) {
		System.out.println(nota[0]);
		int a2 = 0; int a5 = 0; int a10 = 0; int a20 = 0; int a50 = 0; int a100 = 0;
		int d2 = nota[0].getN2(); int d5 = nota[0].getN5();int d10 = nota[0].getN10(); int d20 = nota[0].getN20();int d50 = nota[0].getN50(); int d100 = nota[0].getN100();  
		
		if(nota[0].getN100()>0) {
			while(saque>=100 && nota[0].getN100()>0) {
				System.out.println(saque = saque - 100);
				d100--;a100++;
			}
		
		}if (saque>=50 && saque > 0) {
			if(nota[0].getN50()>0) {
				while(saque>=50 && nota[0].getN50()>0) {
					System.out.println(saque = saque - 50);
					d50--;a50++;
			}
		}
		}if (saque>=20 && saque > 0) {
			if(nota[0].getN20()>0) {
				while(saque>=20 && nota[0].getN20()>0) {
					System.out.println(saque = saque - 20);
					d20--;a20++;
			}
		}
		}if (saque>=10 && saque > 0) {
			if(nota[0].getN10()>0) {
				while(saque>=10 && nota[0].getN10()>0) {
					System.out.println(saque = saque - 10);
					d10--;a10++;
				}
			}	
		}if (saque>=5 && saque > 0 && saque%5>0) {
			if(nota[0].getN5()>0) {
				while(saque>=5 && nota[0].getN5()>0) {
					System.out.println(saque = saque - 5);
					d5--;a5++;
				}
		}
			
		}if (saque>=2 && saque > 0) {
			if(nota[0].getN2()>0) {
				while(saque>=2 && nota[0].getN2()>0) {
					System.out.println(saque = saque - 2);
					d2--;a2++;
				}
			}	
		}
		JOptionPane.showMessageDialog(null,"notas de 2 sacadas: "+ a2 +"\n notas de 5 sacadas: "+ a5 +"\n notas de 10 sacadas: "+ a10+"\n notas de 20 sacadas: "+ a20 +"\n notas de 50 sacadas:"+ a50 +"\n notas de 100 sacadas:"+ a100);
		Caixa N = new Caixa(d2,d5,d10,d20,d50,d100);
		ControllerCaixa contcaixa = new ControllerCaixa();
		Caixa saidacaixa = contcaixa.carregar(N);
		nota[0] = N;
		JOptionPane.showMessageDialog(null, saidacaixa);
		MenuPrincipal.main(null);
	}
}
	
