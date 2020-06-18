/*Actividad 4: Hacer un programa que indique si un número natural mayor que 1,
dado por el usuario, es o no primo. Un número es primo si es divisible únicamente por
1 y por sí mismo. Una forma de saber si un número "n" es o no primo es dividiendo ese 
número entre 2, 3,...,n-1 y si en algún momento el residuo es igual a cero el número 
no es primo, si se llega al final y en ningún caso el residuo dio 0 "n" es primo.*/

import java.util.Scanner; 
public class Act4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        int numero;
        int contador = 0;

        System.out.println("\n      *****Números Primos*****");

        System.out.println("\nIngrese un número: ");
        numero = sc.nextInt();

        for(int i=1; i<=numero; i++){
            if((numero%i)==0){
                contador++;
            }
        }
        if(contador <= 2){
            System.out.println("El número " + numero + " es primo");
        }else{
            System.out.println("El numero " + numero + " no es primo");
        }
        
    }
    
}