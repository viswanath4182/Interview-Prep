package arithmetic;

import java.util.*;

public class ListToMapEnum {


    public static void main(String[] args) {


        List<ProductDetails> productDetails = Arrays.asList(new ProductDetails(100, "this is good"),
                new ProductDetails(200, "this is super good" ),
                new ProductDetails(300, "this is ultra good"));

        Map<ProductType, ProductDetails> productTypeProductDetailsMap = new HashMap<>();
        productTypeProductDetailsMap.put(ProductType.Television, productDetails.get(0));
        productTypeProductDetailsMap.put(ProductType.Chair, productDetails.get(1));
        productTypeProductDetailsMap.put(ProductType.Mattress, productDetails.get(2));
        productTypeProductDetailsMap.put(ProductType.Sofa, productDetails.get(2));

        System.out.println(productTypeProductDetailsMap);



    }
}
