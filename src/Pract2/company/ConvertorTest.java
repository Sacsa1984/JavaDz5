package Pract2.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
// проверка конвертации валюты
    @Test
    void convert_dolars() {
        Convertor con=new Convertor(2, 27.30);
        double result=con.Convert();

        assertEquals(54.60, result,1e-7);
    }
    @Test
    void convert_ewro() {
        Convertor con=new Convertor(2, 31.20);
        double result=con.Convert();

        assertEquals(62.4, result,1e-7);

    }
    @Test
    void convert_funt() {
        Convertor con=new Convertor(2, 36.25);
        double result=con.Convert();

        assertEquals(72.50, result,1e-7);

    }
    @Test
    void convert_ena() {
        Convertor con=new Convertor(2, 0.24);
        double result=con.Convert();

        assertEquals(0.48, result,1e-7);
    }
    //проверка конвертации длины
    @Test
    void convert_sm () {
        Convertor con=new Convertor(0.1, 100);
        double result=con.Convert();

        assertEquals(10, result,1e-8);
    }
    @Test
    void convert_dci () {
        Convertor con=new Convertor(0.01, 100);
        double result=con.Convert();

        assertEquals(1, result,1e-8);
    }
    @Test
    void convert_mtr () {
        Convertor con=new Convertor(0.001, 100);
        double result=con.Convert();

        assertEquals(0.1, result,1e-10);
    }
    @Test
    void convert_km () {
        Convertor con=new Convertor(1e-6, 100);
        double result=con.Convert();

        assertEquals(1e-4, result,1e-10);
    }
    //проверка конвертаци массы
    @Test
    void convert_gr () {
        Convertor con=new Convertor(0.001, 100);
        double result=con.Convert();

        assertEquals(0.1, result,1e-10);
    }
    @Test
    void convert_kg () {
        Convertor con=new Convertor(1e-6, 100);
        double result=con.Convert();

        assertEquals(1e-4, result,1e-10);
    }
    @Test
    void convert_cnt () {
        Convertor con=new Convertor(1e-8, 100);
        double result=con.Convert();

        assertEquals(1e-6, result,1e-11);
    }
    @Test
    void convert_t () {
        Convertor con=new Convertor(1e-9, 100);
        double result=con.Convert();

        assertEquals(1e-7, result,1e-11);
    }

}