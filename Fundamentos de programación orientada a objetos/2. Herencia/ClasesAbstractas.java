// Figura
public abstract class Figura
{
    private String color;

    public Figura(String color)
    {
        this.color = color;
    }

    public abstract double calcularArea();

    public String getColor()
    {
        return color;
    }
}
// Cuadrado
public class Cuadrado extends Figura
{
    private double lado;

    public Cuadrado(String color, double lado)
    {
        super(color);
        this.lado = lado;
    }

    public double calcularArea()
    {
        return lado * lado;
    }
}
// Triangulo
public class Triangulo extends Figura
{
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura)
    {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea()
    {
        return (base * altura) / 2;
    }
}