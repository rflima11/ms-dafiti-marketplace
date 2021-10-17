package br.com.dafiti.entities.produto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Product")
public class ProdutoDTO {

    @JsonProperty("SellerSku")
    private String sellerSku;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("PrimaryCategory")
    private String primaryCategory;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Brand")
    private String brand;
    @JsonProperty("Price")
    private double price;
    @JsonProperty("Condition")
    private String condition;
    @JsonProperty("Quantity")
    private int quantity;
    @JsonProperty("ProductData")
    private ProductDataDTO productData;

    public String getSellerSku() {
        return sellerSku;
    }

    public void setSellerSku(String sellerSku) {
        this.sellerSku = sellerSku;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimaryCategory() {
        return primaryCategory;
    }

    public void setPrimaryCategory(String primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductDataDTO getProductData() {
        return productData;
    }

    public void setProductData(ProductDataDTO productData) {
        this.productData = productData;
    }
}
