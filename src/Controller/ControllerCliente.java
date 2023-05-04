package Controller;

import been.Cliente;
import dao.DaoCliente;

public class ControllerCliente {
	DaoCliente DaoCli;

		public Cliente cadastrar(Cliente cli){
			DaoCli = new DaoCliente();
			Cliente saidaCli = DaoCli.cadastrar(cli);
			return saidaCli;
		}
	 	
		public Cliente consultar(Cliente cli){
			DaoCli = new DaoCliente();
			Cliente saidaCli = DaoCli.consultar(cli);
			return saidaCli;
		}
		
		public Cliente saldo(Cliente cli){
			DaoCli = new DaoCliente();
			Cliente saidaCli = DaoCli.saldo(cli);
			return saidaCli;
		}
		
		public Cliente verificar(Cliente cli){
			DaoCli = new DaoCliente();
			Cliente saidaCli = DaoCli.verificar(cli);
			return saidaCli;
		}
}
