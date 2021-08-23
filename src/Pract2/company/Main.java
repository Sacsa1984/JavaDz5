package Pract2.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Вібор задания 1-4 выход 0 ");
            int selection = scanner.nextInt();

            switch (selection) {
                case 1: {

                    System.out.println("Вібор росчёта площяди фигуры  1- треугольник ,2- Прямоугольник, 3- Квадрат, 4- Ромб. выход 0 ");
                    selection = scanner.nextInt();
                    switch (selection) {
                        case 1: {
                            S_Figura treugol = new S_Figura(3, 4, 5);
                            System.out.println(treugol.S_Treugol());

                            break;
                        }
                        case 2: {
                            S_Figura pramougol = new S_Figura(3, 5);
                            System.out.println(pramougol.S_Prymougol());

                            break;
                        }
                        case 3: {
                            S_Figura kwadrat = new S_Figura(3);
                            System.out.println(kwadrat.S_Kwadrat());

                            break;
                        }
                        case 4: {
                            S_Figura romb = new S_Figura(4, 6);
                            System.out.println(romb.S_Romb());

                            break;
                        }
                        case 0: {
                            System.exit(1);
                            break;
                        }
                        default: {
                            System.out.println("не коректные данные");
                        }
                    }


                }
                case 2: {
                    System.out.println("Вібор валюты   1- долар ,2- Евро, 3- Фунт стерлингов, 4- Ена. выход 0 ");
                    selection = scanner.nextInt();
                    switch (selection) {
                        case 1: {
                            Convertor dolars = new Convertor(2, 27.30);
                            System.out.println(dolars.Convert());
                            break;
                        }
                        case 2: {
                            Convertor ewro = new Convertor(2, 31.20);
                            System.out.println(ewro.Convert());
                            break;
                        }
                        case 3: {
                            Convertor funt = new Convertor(2, 36.25);
                            System.out.println(funt.Convert());
                            break;
                        }
                        case 4: {
                            Convertor ena = new Convertor(2, 0.24);
                            System.out.println(ena.Convert());
                            break;
                        }
                        case 0: {
                            System.exit(1);
                            break;
                        }
                        default: {
                            System.out.println("не коректные данные");
                        }
                    }


                }
                case 3: {
                    System.out.println("Вібор  конвертирует мм в  1- Сантиметры, 2- Дециметры, 3- Метры 4- Километры. выход 0 ");
                    selection = scanner.nextInt();
                    switch (selection) {
                        case 1: {
                            Convertor sm = new Convertor(0.1, 100);
                            System.out.println(sm.Convert());


                        }


                        case 2: {

                            Convertor dci = new Convertor(0.01, 100);
                            System.out.println(dci.Convert());
                        }


                        case 3: {
                            Convertor mtr = new Convertor(0.001, 100);
                            System.out.println(mtr.Convert());

                        }
                        case 4: {
                            Convertor km = new Convertor(1e-6, 100);
                            System.out.println(km.Convert());
                        }

                        case 0: {
                            System.exit(1);
                            break;
                        }
                        default: {
                            System.out.println("не коректные данные");
                        }

                    }
                }
                case 4: {
                    System.out.println("Вібор  конвертирует милиграммы в  1- Грамм 2- Килограмм 3- Центнер 4- Тонна.. выход 0 ");
                    selection = scanner.nextInt();
                    switch (selection) {
                        case 1: {
                            Convertor gr = new Convertor(0.001, 100);
                            System.out.println(gr.Convert());


                        }


                        case 2: {

                            Convertor kg = new Convertor(1e-6, 100);
                            System.out.println(kg.Convert());
                        }


                        case 3: {
                            Convertor cnt = new Convertor(1e-8, 100);
                            System.out.println(cnt.Convert());

                        }
                        case 4: {
                            Convertor t = new Convertor(1e-9, 100);
                            System.out.println(t.Convert());
                        }

                        case 0: {
                            System.exit(1);
                            break;
                        }
                        default: {
                            System.out.println("не коректные данные");
                        }

                    }
                }
                case 0: {
                    System.exit(1);
                    break;
                }
                default: {
                    System.out.println("не коректные данные");
                }
            }

        }
    }

}
