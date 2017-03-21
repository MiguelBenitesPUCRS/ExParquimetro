package parquimetro;

public class Parquimetro {
	
	private int saldo;
	
	public Parquimetro() {
		this.saldo = 0;
	}
	
	// Permite inserir moedas no parquimetro (soma no saldo)
	// Valores possíveis: 1, 5, 10, 25, 50 e 100 (1 real)
	// Gera InvalidValueException no caso de valor inválido
	public void insereMoeda(int valor){
		switch (valor){
		case 1:
			saldo +=valor;
			break;
		case 5:
			saldo +=valor;
			break;
		case 10:
			saldo +=valor;
			break;
		case 25:
			saldo +=valor;
			break;
		case 50:
			saldo +=valor;
			break;
		case 100:
			saldo +=valor;
			break;
		default:
			valor +=0;
			break;		
		}	
	}
	
	// Retorna o saldo acumulado no parquimetro
	public int getSaldo(){ 
		return (saldo);
	}
	
	// Emite um ticket de 2 reais se houver saldo disponível.
	// Retorna true se a operação foi possível
	public boolean emiteTicket(){
		if (getSaldo() < 200){
			return (false);
		}
		saldo -= 200;
		return true;		
	}
	
	
	// Devolve o saldo existente. Retorna o valor devolvido
	public int devolve(){
		int tmp = saldo;
		saldo = 0;
		return (tmp);
	}
}
