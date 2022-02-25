package A1Mesa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FiguraTest {

        Figura circulo, quadrado;

        @BeforeEach
        void doBefore(){
            circulo = new Circulo(3);
            quadrado = new Quadrado(2);
        }

        @Test
        void formulaCirculo(){
            System.out.println(circulo.calcularPerimetro());
        }

        @Test
        void formulaQuadrado(){
            System.out.println(quadrado.calcularPerimetro());
        }


    }