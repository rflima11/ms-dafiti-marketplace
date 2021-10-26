package br.com.dafiti.entities.pedido;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Date;

@JacksonXmlRootElement(localName = "OrderItem")
public class OrdemItemDTO {

    @JsonProperty("OrderItemId")
    private int orderItemId;
    @JsonProperty("ShopId")
    private int shopId;
    @JsonProperty("OrderId")
    private int orderId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Sku")
    private double sku;
    @JsonProperty("ShopSku")
    private String shopSku;
    @JsonProperty("shippingType")
    private String ShippingType;
    @JsonProperty("ItemPrice")
    private double itemPrice;
    @JsonProperty("PaidPrice")
    private double paidPrice;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("WalletCredits")
    private double walletCredits;
    @JsonProperty("TaxAmount")
    private double taxAmount;
    @JsonProperty("ShippingAmount")
    private double shippingAmount;
    @JsonProperty("VoucherAmount")
    private int voucherAmount;
    @JsonProperty("VoucherCode")
    private String voucherCode;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("IsProcessable")
    private int isProcessable;
    @JsonProperty("ShipmentProvider")
    private String shipmentProvider;
    @JsonProperty("IsDigital")
    private int isDigital;
    @JsonProperty("DigitalDeliveryInfo")
    private String digitalDeliveryInfo;
    @JsonProperty("TrackingCode")
    private int trackingCode;
    @JsonProperty("Reason")
    private String reason;
    @JsonProperty("ReasonDetail")
    private String reasonDetail;
    @JsonProperty("PurchaseOrderId")
    private int purchaseOrderId;
    @JsonProperty("PurchaseOrderNumber")
    private String purchaseOrderNumber;
    @JsonProperty("PackageId")
    private Object packageId;
    @JsonProperty("PromisedShippingTimes")
    private Date promisedShippingTimes;
    @JsonProperty("shippingProviderType")
    private Object ShippingProviderType;
    @JsonProperty("extraAttributes")
    private String ExtraAttributes;
    @JsonProperty("createdAt")
    private Date CreatedAt;
    @JsonProperty("UpdatedAt")
    private Date updatedAt;
    @JsonProperty("ReturnStatus")
    private String returnStatus;
    @JsonProperty("Vouchers")
    private String vouchers;
    @JsonProperty("ShippingVoucher")
    private double shippingVoucher;
    @JsonProperty("WarehouseName")
    private String warehouseName;
    @JsonProperty("StoreCredits")
    private double storeCredits;
    @JsonProperty("ExchangeForOrderId")
    private String exchangeForOrderId;
    @JsonProperty("ExchangeByOrderId")
    private String exchangeByOrderId;

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSku() {
        return sku;
    }

    public void setSku(double sku) {
        this.sku = sku;
    }

    public String getShopSku() {
        return shopSku;
    }

    public void setShopSku(String shopSku) {
        this.shopSku = shopSku;
    }

    public String getShippingType() {
        return ShippingType;
    }

    public void setShippingType(String shippingType) {
        ShippingType = shippingType;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getPaidPrice() {
        return paidPrice;
    }

    public void setPaidPrice(double paidPrice) {
        this.paidPrice = paidPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getWalletCredits() {
        return walletCredits;
    }

    public void setWalletCredits(double walletCredits) {
        this.walletCredits = walletCredits;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getShippingAmount() {
        return shippingAmount;
    }

    public void setShippingAmount(double shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public int getVoucherAmount() {
        return voucherAmount;
    }

    public void setVoucherAmount(int voucherAmount) {
        this.voucherAmount = voucherAmount;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIsProcessable() {
        return isProcessable;
    }

    public void setIsProcessable(int isProcessable) {
        this.isProcessable = isProcessable;
    }

    public String getShipmentProvider() {
        return shipmentProvider;
    }

    public void setShipmentProvider(String shipmentProvider) {
        this.shipmentProvider = shipmentProvider;
    }

    public int getIsDigital() {
        return isDigital;
    }

    public void setIsDigital(int isDigital) {
        this.isDigital = isDigital;
    }

    public String getDigitalDeliveryInfo() {
        return digitalDeliveryInfo;
    }

    public void setDigitalDeliveryInfo(String digitalDeliveryInfo) {
        this.digitalDeliveryInfo = digitalDeliveryInfo;
    }

    public int getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(int trackingCode) {
        this.trackingCode = trackingCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReasonDetail() {
        return reasonDetail;
    }

    public void setReasonDetail(String reasonDetail) {
        this.reasonDetail = reasonDetail;
    }

    public int getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(int purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public Object getPackageId() {
        return packageId;
    }

    public void setPackageId(Object packageId) {
        this.packageId = packageId;
    }

    public Date getPromisedShippingTimes() {
        return promisedShippingTimes;
    }

    public void setPromisedShippingTimes(Date promisedShippingTimes) {
        this.promisedShippingTimes = promisedShippingTimes;
    }

    public Object getShippingProviderType() {
        return ShippingProviderType;
    }

    public void setShippingProviderType(Object shippingProviderType) {
        ShippingProviderType = shippingProviderType;
    }

    public String getExtraAttributes() {
        return ExtraAttributes;
    }

    public void setExtraAttributes(String extraAttributes) {
        ExtraAttributes = extraAttributes;
    }

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        CreatedAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getVouchers() {
        return vouchers;
    }

    public void setVouchers(String vouchers) {
        this.vouchers = vouchers;
    }

    public double getShippingVoucher() {
        return shippingVoucher;
    }

    public void setShippingVoucher(double shippingVoucher) {
        this.shippingVoucher = shippingVoucher;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public double getStoreCredits() {
        return storeCredits;
    }

    public void setStoreCredits(double storeCredits) {
        this.storeCredits = storeCredits;
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
}
