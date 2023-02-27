import java.util.Scanner;

public class MediaDeNotas {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, n2, medida;

        System.out.println("Informe o valor da primeira nota: ");
        n1 = input.nextInt();

        System.out.println("Informe o valor da segunda nota: ");
        n2 = input.nextInt();

        media = (n1 + n2) /2 ;

        System.out.printf("primeira nota foi = " + n1);
        System.out.printf("\n Segunda nota foi = " + n2);
        System.out.printf("\n sua media é = " + media + "\n");

        if (media >= 8 && media <= 10)
        {
            System.out.print("Aluno esta aprovado \n");

        }else if (media >= 5 && media <= 7){
            System.out.print("Aprovado, mas terá recuperção \n");
        }else if (media >= 0 && media <= 4){
            System.out.print("Aluno está reprovado \n");
        }else{
            System.
        }



    }

}
