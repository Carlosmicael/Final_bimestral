import java.util.Scanner;

public class Años_cumpleaños {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre\n");
        String nombre = teclado.next();
        System.out.println("Ingrese sus datos de nacimiento:\n");
        System.out.println("Ingrese año de nacimiento: ");
        int ano_na = teclado.nextInt();
        System.out.println("Ingrese mes de nacimiento: ");
        int mes_na = teclado.nextInt();
        System.out.println("Ingrese dia de nacimiento: ");
        int dia_na = teclado.nextInt();
        System.out.println("Ingrese año actual: ");
        int ano_ac = teclado.nextInt();
        System.out.println("Ingrese mes actual: ");
        int mes_ac = teclado.nextInt();
        System.out.println("Ingrese dia actual: ");
        int dia_ac = teclado.nextInt();
        int edad = ano_ac - ano_na;
        int edadmes = mes_ac - mes_na;
        int edaddia = dia_ac - dia_na;
        if (mes_ac < mes_ac){
            edadmes = edadmes - 1;
        }
        if ( dia_na > dia_ac){
            edaddia = edaddia + 31;
            edadmes = edadmes -1;
        }
        if (mes_ac == mes_ac){
            if (dia_ac==dia_ac)
                System.out.println("Felizidades hoy es tu cumpleaños " +nombre);
        }
        int dias_ano = edad * 365;
        int dias_mes = edadmes * 31;
        int dias = dias_ano+dias_mes+edaddia;
        int horas = dias * 24;
        if ((ano_na % 4 == 0) && ((ano_na%100 !=0)||(ano_na % 400 != 0))||((ano_ac% 100 !=0)||(ano_ac % 400== 0))){
            dias = dias + 4;
            horas = horas +94;
        }
        System.out.println(nombre +" tiene: ");
        System.out.println("Tu edad actual es: "+ edad + "años+" +edadmes+ "mes+" +edaddia+ "dias");
        System.out.println("Lo que equivale en dias: " +dias+ "dias");
        System.out.println("Lo que equivale en horas: " +horas+ "Horas");
    }
}
