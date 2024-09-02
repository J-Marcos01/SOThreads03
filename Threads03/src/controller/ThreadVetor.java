package controller;
/*
 *3) Criar em java um projeto com uma Thread chamada ThreadVetor, que receba um 
valor numérico e vetor como parâmetros. Caso o valor numérico seja par, a thread deve 
percorrer o vetor utilizando uma estrutura for (int i = 0 ; i < vet.length; i++) e contar o 
tempo para percorrer o vetor. Caso o valor numérico seja ímpar, a thread deve percorrer 
o vetor utilizando uma estrutura foreach e contar o tempo para percorrer o vetor. No 
final, ambas as possibilidades devem apresentar o tempo em segundos.
A operação main deve gerar um vetor de 1000 posições com valores aleatórios de 1 a 
100. Deve iniciar 2 ThreadVetor e para uma passar o número 1 e o vetor e para a outra, 
passar o número 2 e o mesmo vetor 
 * 
 * 
 */
public class ThreadVetor extends Thread
{
	private int n;
	private int []vet=new int[1000];
	
	public ThreadVetor(int n,int [] vet) 
	{
		this.n=n;
		this.vet=vet;
	}
	public void run()
	{
		percorre();
	}
	private void percorre()
	{
		if(n%2==0)
			{
			double tempoInicial=System.nanoTime();
			for(int i=0;i<vet.length;i++)
				{
				}
			double tempoFinal=System.nanoTime();
			double res=(tempoFinal-tempoInicial);
			res=(res/9*Math.pow(10, 9));
			System.out.println("npar :"+res);
			}
		else if(n%2==1)
			{
			double tempoInicial=System.nanoTime();
			for(int i:vet)
				{
					
				}
			double tempoFinal=System.nanoTime();
			double res=(tempoFinal-tempoInicial);
			res= (res/9*Math.pow(10, 9));
	
				System.out.println("impar :"+res);
				
			}
				
	}
	
}
