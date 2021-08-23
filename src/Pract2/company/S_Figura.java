package Pract2.company;

public class S_Figura {
    double A;
    double B;
    double C;
    double Per;
    double sum;
    public S_Figura(double a) {
        A = a;


    }
    public S_Figura(double a, double b) {
        A = a;
        B=b;

    }
    public S_Figura(double a, double b, double c) {
        A = a;
        B=b;
        C=c;
    }




    public double S_Treugol()
    {

        Per=(A+B+C)/2;
        sum=Per*(Per-A)*(Per-B)*(Per-C);

        return  Math.sqrt(sum);
    }
    public double S_Prymougol()
    {


        sum=A*B;

        return sum;
    }
    public double S_Kwadrat()
    {

        sum=A*A;

        return sum;
    }
    public double S_Romb()// находит площядь ромба через две диаганали
    {

        sum=A*B/2;

        return sum;
    }
}
