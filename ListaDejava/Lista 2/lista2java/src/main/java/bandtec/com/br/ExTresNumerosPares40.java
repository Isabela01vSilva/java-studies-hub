
package bandtec.com.br;

public class ExTresNumerosPares40 {
    public static void main(String[] args) {
        Integer numero = 1;
        Integer conta;
         
        do{
            numero ++;
            conta = numero % 2;
            if(!conta.equals(0)){
            System.out.println(numero);
           }
        }
        while(numero <= 40);
    }
}