package A2Mesa;

import org.junit.jupiter.api.Test;

class CardapioTest {

    @Test
    void calculos(){
        Cardapio cardapio;

        cardapio = new CardapioAdulto(20);
        cardapio.calcularPreco();

        cardapio = new CardapioInfantil(20, 20);
        cardapio.calcularPreco();

        cardapio = new CardapioVegetariano(20, 5);
        cardapio.calcularPreco();
    }

}