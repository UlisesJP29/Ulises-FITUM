import java.lang.Math;
import java.util.Scanner;
/**
 * Write a description of class calAreaTriangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class calAreaTriangulo
{
    public static void main(String [] arg)
    {
        double area;
        double a, b, c;
        double p;
        
        Scanner leerDatos = new Scanner(System.in);
        System.out.println('\u000c');
        System.out.println("pon los valores de los lados ");
        System.out.println(" el valor del lado a ");
        a = leerDatos.nextDouble();
        System.out.println(" el valor de B ");
        b = leerDatos.nextDouble();
        System.out.println(" el valor de C = ");
        c = leerDatos.nextDouble();
        //p = (a + b + c) / 2;
            //area =  Math.pow(p * (p - a) * ((p - b) * (p - c) (.5));
        if ((a<0) || (b<0) || (c<0) || ((a+b)<c) ||((b+c)<a) || ((a+c)<b))
        {
            System.out.println("no tiene una solución");
            System.out.print("no es un triangulo");
        }
        else
        {
            //System.out.println("El valos del área es : " + area);
            p = (a + b + c) / 2;
            area =  Math.pow(p * (p - a) * (p - b) * (p - c), 0.5);
            System.out.println("El valos del área es : " + area);
        }
        
       
    }
}
