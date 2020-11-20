
package fiat;

import abstractFactory.CarroPopular;
import abstractFactory.CarroSedan;
import abstractFactory.FabricaDeCarro;

/**
 *
 * @author camil
 */
public class FabricaFiat extends FabricaDeCarro{

    @Override
    public CarroSedan criarCarroSedan() {
        return new PalioSedan();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }
    
}
