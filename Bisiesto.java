import java.util.Scanner;
/**
 * Write a description of class Bisiesto here.
 * El usuario introduce una fecha en el siguiente formato
 * Año = numero entero de 4 digitos (por ejemplo, 1986)
 * mes = numero entero de 1 a 12
 * El programa responde 1986 es bisiest, el mes tiene x dias
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bisiesto
{
    public int bisYear(int year)
    {
        if (year % 400 == 0)
        {
            return 1;
        
        }
        else if (year % 100 == 0)
        
                {
                    return 0;
                
                }
                else if (year % 4 == 0)
                        {
                            return 1;
                        
                        }
                        else
                            return 0;
    }
    public static void main(String args [])
    {
        Scanner leerDato = new Scanner(System.in);
        Bisiesto fecha_Anyo = new Bisiesto();
        int year1;
        int mes;
        int tiempo;
        System.out.print('\u000c');
        System.out.println("Escribe un año en número entero de 4 digitos");
        year1 = leerDato.nextInt();
        
        System.out.println("Escribe un mes en número entero del 1 - 12");
        mes = leerDato.nextInt();
        
        tiempo = fecha_Anyo.bisYear(year1);
        if (mes == 2)
          if (tiempo == 1)
          {
              System.out.println(year1 + "Es bisiesto y febrero tiene 29 dias");
          }
          else
              System.out.println("Febrero tiene 28 dias. El año " + year1 + "El año no es bisiesto");
    }//termina main
}
