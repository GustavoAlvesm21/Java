package banco;

public class Cliente {
	String nome; 
    String cpf; 
    int agencia; 
    int idade;  
    
    public String getNome()
    {
        return nome; 
    }

    public String getCpf()
    {
        return cpf; 
    }

    public int getAgencia()
    {
        return agencia; 
    }

    public int getIdade()
    {
        return idade; 
    }
    
    public void setNome(String nome) {
    	
    	this.nome = nome; 
    }
    
    public void setCpf(String cpf) {
    	
    	this.cpf = cpf; 
    }
    
    public void setAgencia(int agencia) {
    	
    	this.agencia = agencia; 
    }
    
    public void setIdade(int idade) {
    	
    	this.idade = idade; 
    }
}