import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class AppTeste {

    @Test
    public void deveriaResponderComVerdadeiro() {

        assertTrue(true);
    }

    @Test
    public void adicionar_Dois_Mais_Dois_Retornar_Quatro() {

        // arranjo
        final int experado = 4;

        // ação
        final int atual = App.adicionar(2, 2);

        // assert
        Assert.assertEquals(experado, atual);
    }

    @Test
    public void multiplicarQuatroVezesDois_Retorna_Oito() {

        // arranjo
        final int experado = 8;

        // ação
        final int atual = App.multiplicar(4, 2);

        // assert 
        Assert.assertEquals(experado, atual);
    }

    @Test
    public void dividir_Dez_Dividido_Dois_Retorna_Cinco() {

        //arranjo
        final int experado = 5;

        // ação 
        final int atual = App.dividir(10, 2);

        // 
        Assert.assertEquals(experado, atual);
    }
}