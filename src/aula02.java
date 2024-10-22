
public class aula02 {

	public static void main(String[] args) {
		// casting adaptar um valor de um tipo de dado para caber em outro.
		
		double a;
		int b;
		
		a = 5.1;
		b = (int) a; // estou dizendo q mesmo o valor "a" sendo double ele pode aceitar como se fosse int
		
		int num = 10;
		double numMaior = num; // aqui ele ja esta fazendo casting automatico
		
		System.out.println(numMaior); //retorno 10.0
		System.out.print(b); //retorno 5 em vez de 5.1
		
		// da pra fazer isso "double numMaior = (int) num;
		
	}

}
