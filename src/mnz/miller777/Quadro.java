package mnz.miller777;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mille_000 on 11.09.2015.
 */
public class Quadro {


    public static void main(String[] args) {

        BufferedReader reader;
        double a;
        double b;
        double c;
        double x1;
        double x2;
        double y1;
        double y2;
        final double QUALITY = 1e-6;

        reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            a = Double.parseDouble(reader.readLine());

        b = Double.parseDouble(reader.readLine());
        c = Double.parseDouble(reader.readLine());
            double d = b * b - 4 * a * c;

            if(a < QUALITY){

                x1 = - c / b;
                System.out.println("x = " + x1);

            }else if(d < 0. & Math.abs(d) >= QUALITY){

                x1 = - b / (2 * a);
                x2 = x1;
                y1 = Math.sqrt(Math.abs(d))/(2 * a);
                y2 = y1;
                System.out.println("Корни комплексные:");
                System.out.println("x1 = " + x1 + " + " + y1 + " * i");
                System.out.println("x2 = " + x1 + " - " + y1 + " * i");

            }else if (Math.abs(d) < QUALITY){
                x1 = - b / (2 * a);
                x2 = x1;
                System.out.println("x1 = x2 = " + x1);
            }else {
                x1 = (- b + Math.sqrt(d))/ (2 * a);
                x2 = (- b - Math.sqrt(d))/ (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
