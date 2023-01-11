public class EjemploWhile {
    public static void main(String args[]) {
    	
    	/*while*/
        int i = 0;
        while (i < 10) {
            System.out.println("i: " + i);
            i++;
        }

        /*for*/
		for (int i = 1; i <= 5; i++) {
			System.out.println ("El valor de la cifra es: " + i);
		}

		/*do while*/
		Scanner sc = new Scanner(System.in);
		int numero;

		do
		{
		    System.out.println("Ingrese un numero: ");
		    numero = sc.nextInt();
		}
		while(numero <= 500);

		/*break*/
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		int dia = cal.get(Calendar.DAY_OF_WEEK);

		for (int i = 1; i <= 7; i++) {
		  if (dia == i){
		    System.out.println("Hoy es el " + i + "º dia de la semana.");
		    break;
		  }

		  System.out.println("Dia " + i);
		}
		System.out.println("Seguimos...");
}


