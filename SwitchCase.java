package switchcase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner captura = new Scanner(System.in);

		int codigo, quantidade;
		
		float valorTotal;
		
		System.out.println("Digite o código do produto");
		
		 codigo = captura.nextInt();
		 
		if (codigo > 6) {
			
        System.out.println("Opção inválida");
        
		}
		else {
			
			System.out.println("Digite a quantidade");
			
		}
		quantidade = captura.nextInt();
		
		switch (codigo) {

		case 1:
			
			valorTotal = quantidade * 10;
			
			System.out.printf("O valor total é igual a : '%.2f' reais", valorTotal);
			
			System.out.println(" \n O Produto é um Cachorro Quente");
			break;
		
        case 2:
			
			valorTotal = quantidade * 15;
			
			System.out.printf("O valor total é igual a: '%.2f' reais", valorTotal);
			
			System.out.println(" \n O Produto é um X- Salada");
			break;
			
		case 3:

	        valorTotal=quantidade*18;

	        System.out.printf("O valor total é igual a : '%.2f' reais",valorTotal);
      
	        System.out.println(" \n O Produto é um X- Bacon");
	        break;
	        
        case 4:

            valorTotal=quantidade*12;

            System.out.printf("O valor total é igual a : '%.2f' reais",valorTotal);

	        System.out.println(" \n O Produto é um Bauru");
	        break;
	        
        case 5:

            valorTotal=quantidade*8;

            System.out.printf("O valor total é igual a : '%.2f' reais",valorTotal);

            System.out.println(" \n O Produto é um Refrigerante");
            break;
            
        case 6:

            valorTotal=quantidade*13;

            System.out.printf("O valor total é igual a : '%.2f' reais",valorTotal);

            System.out.println(" \n O Produto é um Suco de laranja");
            break;
		}
	captura.close();
	}
}
