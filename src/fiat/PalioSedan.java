package fiat;

import abstractFactory.CarroSedan;

/**
 *
 * @author camil
 */
public class PalioSedan implements CarroSedan {

    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Palio\nF�brica:Fiat\nCategoria:Sedan");
    }

    private int bagagem;

    @Override
    public void colocarBagagem(int kg) throws Exception {

        if (kg + bagagem < 400) { // Coloquei 400 considerando 100 do rack
            bagagem += kg;
        } else {
            throw new Exception("Excesso de bagagem");
        }
    }

    @Override
    public int getKgBagageiro() {
        return bagagem;
    }

}
