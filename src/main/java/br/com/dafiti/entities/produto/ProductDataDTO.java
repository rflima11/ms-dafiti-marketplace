package br.com.dafiti.entities.produto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDataDTO {

    @JsonProperty("ColorFamily")
    private String colorFamily;
    @JsonProperty("Weight")
    private Double weight;
    @JsonProperty("BoxLength")
    private Double boxLength;
    @JsonProperty("BoxWidth")
    private Double boxWidth;
    @JsonProperty("BoxHeight")
    private Double boxHeight;
    @JsonProperty("Origin")
    private String origin;
    @JsonProperty("Gender")
    private String gender;

    public String getColorFamily() {
        return colorFamily;
    }

    public void setColorFamily(String colorFamily) {
        this.colorFamily = colorFamily;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getBoxLength() {
        return boxLength;
    }

    public void setBoxLength(Double boxLength) {
        this.boxLength = boxLength;
    }

    public Double getBoxWidth() {
        return boxWidth;
    }

    public void setBoxWidth(Double boxWidth) {
        this.boxWidth = boxWidth;
    }

    public Double getBoxHeight() {
        return boxHeight;
    }

    public void setBoxHeight(Double boxHeight) {
        this.boxHeight = boxHeight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
