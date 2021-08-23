package Pract2.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S_FiguraTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }


    @org.junit.jupiter.api.Test

    void s_Treugol(){
        S_Figura figura=new S_Figura(3,4,5);
        double result=figura.S_Treugol();

        assertEquals(6, result,1e-4);
    }

    @org.junit.jupiter.api.Test
    void s_Prymougol() {
        S_Figura pramougol = new S_Figura(3, 5);
        double result=pramougol.S_Prymougol();
        assertEquals(15, result,1e-5);
    }

    @org.junit.jupiter.api.Test
    void s_Kwadrat() {
        S_Figura kwadrat = new S_Figura(3);
        double result=kwadrat.S_Kwadrat();
        assertEquals(9, result,1e-6);

    }

    @org.junit.jupiter.api.Test
    void s_Romb() {
        S_Figura romb = new S_Figura(4, 6);
        double result=romb.S_Romb();
        assertEquals(12, result,1e-6);
    }
}