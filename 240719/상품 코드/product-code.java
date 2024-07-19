import java.util.Scanner;


class ProductInfo {
    String productName;
    int productCode;

    public ProductInfo(String productName, int productCode) {
        this.productName = productName;
        this.productCode = productCode;
    }
 
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductInfo product1= new ProductInfo("codetree", 50);

        String productName = sc.next();
        int productCode = sc.nextInt();

        ProductInfo product2 = new ProductInfo(productName, productCode);

        System.out.println( "product " + product1.productCode + " is " + product1.productName );
        System.out.println("product " + product2.productCode +  " is " +  product2.productName);

    }
}