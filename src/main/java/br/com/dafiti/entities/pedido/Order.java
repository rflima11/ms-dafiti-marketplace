package br.com.dafiti.entities.pedido;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Date;

@JacksonXmlRootElement(localName = "Order")
public class Order {

    @JsonProperty("OrderId")
    private Long orderId;
    @JsonProperty("CustomerFirstName")
    private String customerFirstName;
    @JsonProperty("CustomerLastName")
    private Object customerLastName;
    @JsonProperty("OrderNumber")
    private int orderNumber;
    @JsonProperty("PaymentMethod")
    private String paymentMethod;
    @JsonProperty("Remarks")
    private String remarks;
    @JsonProperty("DeliveryInfo")
    private String deliveryInfo;
    @JsonProperty("Price")
    private double price;
    @JsonProperty("GiftOption")
    private int giftOption;
    @JsonProperty("GiftMessage")
    private String giftMessage;
    @JsonProperty("VoucherCode")
    private String voucherCode;
    @JsonProperty("CreatedAt")
    private Date createdAt;
    @JsonProperty("UpdatedAt")
    private Date updatedAt;
    @JsonProperty("AddressBilling")
    private AddressBilling addressBilling;
    @JsonProperty("AddressShipping")
    private AddressShipping addressShipping;
    @JsonProperty("NationalRegistrationNumber")
    private String nationalRegistrationNumber;
    @JsonProperty("ItemsCount")
    private int itemsCount;
    @JsonProperty("ExtraAttributes")
    private String extraAttributes;
    @JsonProperty("ExchangeForOrderId")
    private String exchangeForOrderId;
    @JsonProperty("ExchangeByOrderId")
    private String exchangeByOrderId;
    @JsonProperty("Statuses")
    private Statuses statuses;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public Object getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(Object customerLastName) {
        this.customerLastName = customerLastName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(String deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getGiftOption() {
        return giftOption;
    }

    public void setGiftOption(int giftOption) {
        this.giftOption = giftOption;
    }

    public String getGiftMessage() {
        return giftMessage;
    }

    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public AddressBilling getAddressBilling() {
        return addressBilling;
    }

    public void setAddressBilling(AddressBilling addressBilling) {
        this.addressBilling = addressBilling;
    }

    public AddressShipping getAddressShipping() {
        return addressShipping;
    }

    public void setAddressShipping(AddressShipping addressShipping) {
        this.addressShipping = addressShipping;
    }

    public String getNationalRegistrationNumber() {
        return nationalRegistrationNumber;
    }

    public void setNationalRegistrationNumber(String nationalRegistrationNumber) {
        this.nationalRegistrationNumber = nationalRegistrationNumber;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }

    public String getExtraAttributes() {
        return extraAttributes;
    }

    public void setExtraAttributes(String extraAttributes) {
        this.extraAttributes = extraAttributes;
    }

    public String getExchangeForOrderId() {
        return exchangeForOrderId;
    }

    public void setExchangeForOrderId(String exchangeForOrderId) {
        this.exchangeForOrderId = exchangeForOrderId;
    }

    public String getExchangeByOrderId() {
        return exchangeByOrderId;
    }

    public void setExchangeByOrderId(String exchangeByOrderId) {
        this.exchangeByOrderId = exchangeByOrderId;
    }

    public Statuses getStatuses() {
        return statuses;
    }

    public void setStatuses(Statuses statuses) {
        this.statuses = statuses;
    }
}
