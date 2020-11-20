package sistema;

import abstractFactory.CarroPopular;
import abstractFactory.CarroSedan;
import abstractFactory.FabricaDeCarro;
import fiat.FabricaFiat;
import ford.FabricaFord;

public class Cliente {
	
	public static void main(String[] args) {
		
//		FabricaDeCarro fabrica = new FabricaFord(); // aqui vai trocar para new FabricaFiat();
//                criarSedan(fabrica);
//		criarPopular(fabrica);
                
                FabricaDeCarro fabricaFiat = new FabricaFiat();
                criarSedan(fabricaFiat);
		criarPopular(fabricaFiat);	

	}

	private static void criarPopular(FabricaDeCarro fabrica) {
		CarroPopular popular = fabrica.criarCarroPopular();
		popular.exibirInfoPopular();
		System.out.println();
		
	}

	private static void criarSedan(FabricaDeCarro fabrica) {

		CarroSedan sedan = fabrica.criarCarroSedan();
		sedan.exibirInfoSedan();
		System.out.println();
		
	}
}
