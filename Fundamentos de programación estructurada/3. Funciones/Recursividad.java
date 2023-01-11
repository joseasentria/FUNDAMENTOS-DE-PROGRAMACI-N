// Un simple programa de recursividad
class Factorial
{
    // Esto es un método recursivo
    int facR (int n){
        int resultado;
        if (n==1) return 1;
        resultado=facR(n-1)*n;
        return resultado;
    }
    // Esto es un equivalente iterativo
    int facI (int n){
        int t, resultado;
        resultado=1;
        for (t=1; t<=n; t++) resultado *=t;
        return resultado;
    }
}
    class Recursividad{
    public static void main(String[] args) {
        Factorial f= new Factorial();
        System.out.println("Factorial utilizando un método recursivo:");
        System.out.println("El factorial de 3 es: "+f.facR(3));
        System.out.println("El factorial de 6 es: "+f.facR(6));
        System.out.println();
        System.out.println("Factorial utilizando un método iterativo:");
        System.out.println("El factorial de 3 es: "+f.facI(3));
        System.out.println("El factorial de 6 es: "+f.facI(6));
        System.out.println();
    }
}