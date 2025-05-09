import java.util.Scanner;
import java.util.Locale;
public class CadastroProdutos{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o numero de itens que você deseja cadastrar");
        int n = sc.nextInt();
        Products[] array = new Products[n];

        for(int i = 0; i<n;i++){
            sc.nextLine();
            System.out.print("Nome do Produto: ");
            String name = sc.nextLine();
            System.out.print("preço: ");
            Double price = sc.nextDouble();
            System.out.print("quantidade: ");
            int quantity = sc.nextInt();
            array[i] = new Products(name, price, quantity);
        }
        double totalPrice = 0;
        int totalItems = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
            totalPrice += array[i].totalPrice();  // Soma o valor total dos produtos
            totalItems += array[i].getQuantity(); // Soma a quantidade total de itens
        }
        System.out.print("\nTotal de itens:" + totalItems+ ", ");
        System.out.printf("Valor total: R$ %.2f\n", totalPrice);
        
        sc.close();
        
    }
} 