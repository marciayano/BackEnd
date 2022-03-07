package A9Integradora3.teste;

import A9Integradora3.model.Quadrado;
import A9Integradora3.model.Triangulo;
import A9Integradora3.service.FlyweightFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyweightFactoryTest {

    @Test
    void getTrianguloComTamanho2(){
        Triangulo triangulo = FlyweightFactory.obterTriangulo("vermelho");
        triangulo.setTamanho(2);

        Triangulo triangulo1 = FlyweightFactory.obterTriangulo("vermelho");
        triangulo1.setTamanho(4);

        Triangulo triangulo2 = FlyweightFactory.obterTriangulo("azul");
        triangulo2.setTamanho(6);

        assertEquals(triangulo.getCor(),"vermelho");
        assertEquals(triangulo1.getTamanho(),4);
        assertEquals(FlyweightFactory.trianguloMap.size()==2,true);
    }

    @Test
    void getQuadradoComTamanho2(){
        Quadrado quadrado = FlyweightFactory.obterQuadrado(4);
        quadrado.setCor("azul");

        Quadrado quadrado1 = FlyweightFactory.obterQuadrado(4);
        quadrado.setCor("verde");

        Quadrado quadrado2 = FlyweightFactory.obterQuadrado(6);
        quadrado.setCor("vermelho");

        assertEquals(quadrado.getTamanho(),4);
        assertEquals(quadrado1.getCor(),"vermelho");
        assertEquals(FlyweightFactory.quadradoMap.size(),2);
    }

}
