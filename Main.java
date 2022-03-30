import java.util.Scanner;

public class Main {

    public static void main(String args[]){
      
while (true){
Scanner entrada = new Scanner (System.in);

System.out.print("\nEntre com o primeiro valor: ");
int num1 = entrada.nextInt();
System.out.print("\nEntre com o segundo valor: ");
int num2 = entrada.nextInt();

System.out.println("\nAGORA SELECIONE UMA OPERAÇÃO: ");
System.out.println("\n\n[1] SOMA ");
System.out.println("[2] SUBTRAI ");
System.out.println("[3] MULTIPLICA ");
System.out.println("[4] DIVIDE ");
System.out.println("\n>> Digite uma opção: ");

int opc = entrada.nextInt();
      
switch(opc){

    case 1:
        int soma = num1 + num2;
        System.out.println("\nResultado: "+soma);

        break;

     case 2: 
         int diminui = num1 - num2;
         System.out.println("\nResultado: "+diminui);

         break;

     case 3:
         int multiplica = num1 * num2;
         System.out.println("\nResultado: "+multiplica);
          
         break;

     case 4:
         if (num1 <num2) {
            System.out.println("\nImpossível realizar cálculo!! \n ");}
         
          else {
            int divide = num1/num2;
             System.out.println("\nResultado: "+divide);
            
            break;
            
          }
            
           break;

            default:
            System.out.println("Operação inválida!!");}

  
           }


 

 }
      }
