package been;

public class Cliente {
	private String nome;
	private int cpf;
	private int rg;
	private String telefone;
	private String endereco;
	private int banco;
	private int conta;
	private String senha;
	private int saldo;
	
	public Cliente(String nome, int rg, int cpf, String endereco, String telefone, int banco, int conta, String senha, int saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.telefone = telefone;
		this.banco = banco;
		this.conta = conta;
		this.senha = senha;
		this.saldo = saldo;
				
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getRg() {
		return rg;
	}
	
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getBanco() {
		return banco;
	}
	
	public void setBanco(int banco) {
		this.banco = banco;
	}
	
	public int getConta() {
		return conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	@Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", telefone=" + telefone + ", endereco=" + endereco + ", banco=" + banco + ", conta=" + conta + ", senha=" + senha + ", saldo=" + saldo + '}';
    }

}

