import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	int codigo;
	float calculo;
	//Boolean decisao
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conta> getContas(){
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	/*if codigo == 1
		decisao = "True";
	else
		decisao = "False";
	
	switch codigo {
			1: decisao = 1
			2: decisao = 2
			}
	
	for int i =0; i< 5; i++
		print i
	
	while i< 0
		print i
	
	do
		print i
		while i> 6
			
	try
		int i =0
	catch*/
		
}