
public class aula {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Date d = new Date();
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		float altura=sc.nextFloat();
		System.out.println("Digite seu peso: ");
		float peso=sc.nextFloat();
		
		float IMC= peso/(altura*altura);
		//Essa linha ira mostrar o resltado do IMC junto com a data e hora da consulta
		System.out.printf("Seu IMC é: %.2f%n", IMC);
		System.out.print("Data e hora consulta: "+ date.format(d));

	}

}
