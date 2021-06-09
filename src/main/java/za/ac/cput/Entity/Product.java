/* Product.java
Product Entity class created using Builder design pattern
Author: Antin Williams 219212058
Date: 09 June 2021
 */

package za.ac.cput.Entity;

public class Product {
    public int productID = 0, supplierID = 0;
    public double productPrice = 0.0;
    public String productName = "";

    private Product(Builder builder) {
        this.productID = builder.productID;
        this.supplierID = builder.supplierID;
        this.productPrice = builder.productPrice;
        this.productName = builder.productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", supplierID=" + supplierID +
                ", productPrice=" + productPrice +
                ", productName='" + productName + '\'' +
                '}';
    }

    public static class Builder{
        public int productID = 0, supplierID = 0;
        public double productPrice = 0.0;
        public String productName = "";

        public Builder setProductID(int productID) {
            this.productID = productID;
            return this;
        }

        public Builder setSupplierID(int supplierID) {
            this.supplierID = supplierID;
            return this;
        }

        public Builder setProductPrice(double productPrice) {
            this.productPrice = productPrice;
            return this;
        }

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public Product build(){
            return new Product(this);
        }
        public Builder copy(Product product){
            this.productID = product.productID;
            this.supplierID = product.supplierID;
            this.productPrice = product.productPrice;
            this.productName = product.productName;
            return this;
        }
    }
}
