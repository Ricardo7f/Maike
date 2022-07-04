package Teste;

  
public class NaoConveniado extends Paciente {

    public NaoConveniado(int cpf, String nome) {
		super(cpf, nome);
		// TODO Auto-generated constructor stub
	}

	protected int numCartaoCredito;
    protected String bandeiraCartaoCredito;

  public void Conveniado(int cpf, String nome, int numCartaoCredito, String bandeiraCartaoCredito){
        this.numCartaoCredito = numCartaoCredito;
    this.bandeiraCartaoCredito = bandeiraCartaoCredito;
    
  }

  public int getNumCartaoCredito(){
    return numCartaoCredito;
  }
  public void setNumCartaoCredito(int numCartaoCredito){
    this.numCartaoCredito=numCartaoCredito;
  }

  public String getBandeiraCartaoCredito(){
    return bandeiraCartaoCredito;
  }
  public void setBandeiraCartaoCredito(String bandeiraCartaoCredito){
    this.bandeiraCartaoCredito=bandeiraCartaoCredito;
  }  

  public void print() {
} 
  public void agendarConsulta(String nomeEspecialidade, int numCartaoCredito , String bandeiraCartaoCredito) {
}

@Override
public void agendarConsulta() {
	// TODO Auto-generated method stub
	
}
  
}



