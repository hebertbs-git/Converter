import java.util.Scanner;

public class converterMinutos {

            public static void main(String[] args) {
            Scanner min = new Scanner(System.in);
            System.out.println("Digite o valor dos minutos que serão convertidos:");
            int minutos = min.nextInt();

            // 1 ano em minutos -> 1*365*24*60

            long anos = (long) (minutos / 525600f);
            int dias = (minutos / (24*60)) % 365;

            System.out.println("Valor do resultado: " + anos + " anos e " + dias + " dias");
        }
}

