package Pract2.company;

public class Convertor {


    double Saiz;
    double Znach;



    public Convertor(double saiz, double znach) {
        Saiz = saiz;
        Znach=znach;
    }

    public double Convert()
    {
        return Saiz*=Znach;
    }
}
