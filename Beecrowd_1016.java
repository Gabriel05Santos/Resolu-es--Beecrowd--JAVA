/*
    Gabriel Henrique
    23/03/2025 - 17:30
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int km = input.nextInt();
        
        System.out.printf("%d minutos%n", km * 2);
                
        input.close();
    } 
}
/*
Dois carros (X e Y) partem em uma mesma direção. O carro X sai com 
velocidade constante de 60 Km/h e o carro Y sai com velocidade 
constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros 
do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para 
o carro Y tomar essa distância do outro carro.

Entrada:
O arquivo de entrada contém um número inteiro.

Saída:
Imprima o tempo necessário seguido da mensagem "minutos".
*/