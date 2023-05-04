package Controller;

import been.Caixa;
import dao.DaoCaixa;

public class ControllerCaixa {
	DaoCaixa DaoCax;

		public Caixa sacar(Caixa cax){
			DaoCax = new DaoCaixa();
			Caixa saidaCax = DaoCax.sacar(cax);
			return saidaCax;
		}
	 	
		public Caixa carregar(Caixa cax) {
			DaoCax = new DaoCaixa();
			Caixa saidaCax = DaoCax.carregar(cax);
			return saidaCax;
		}
		
}
