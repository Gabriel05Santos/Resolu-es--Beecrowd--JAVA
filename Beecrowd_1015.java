/*
    Gabriel Henrique
    23/03/2025 - 17:00
*/

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distance = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));
        
        System.out.printf("%.4f%n", distance);
        
        scanner.close();
    }
}
/*
Leia os quatro valores correspondentes aos eixos x e y de dois 
pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância
entre eles, mostrando 4 casas decimais, segundo a fórmula:

Distancia = sqrt( (x2-x1)² + (y2-y1)²)

Entrada:
O arquivo de entrada contém duas linhas de dados. A primeira linha 
contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém 
dois valores de ponto flutuante x2 y2.

Saída:
Calcule e imprima o valor da distância segundo a fórmula fornecida, 
considerando 4 casas decimais.
*/