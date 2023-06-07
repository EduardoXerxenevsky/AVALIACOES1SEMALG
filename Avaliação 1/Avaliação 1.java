import java.util.Scanner;
public class atividade {
	public static void main(String[] args) {
		

int horae, horas, minutoe, minutos,horat, minutot;
double valor;
Scanner teclado = new Scanner(System.in);

System.out.println("Digite a hora de entrada do veiculo");
horae = teclado.nextInt;
System.out.println("Digite a minuto de entrada do veiculo");
minutoe = teclado.nextInt;
System.out.println("Digite a hora de saida do veiculo");
horas = teclado.nextInt;
System.out.println("Digite a minuto de saida do veiculo");
minutos = teclado.nextInt;
horat = calHora(horae, horas);
System.out.println(horat);
	}
	public static double calHora(int h1 ,int h2){
	   int hf;
	    if(h2>h1){
	        h1= h1+24;
	        hf= h1-h2;
	        return hf;
	    }else{
	        hf= h1-h2;
	        return hf;
	    }
	    
	}
	
}