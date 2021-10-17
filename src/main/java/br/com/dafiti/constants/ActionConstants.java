package br.com.dafiti.constants;

public enum ActionConstants {

    ACTION_KEY("Action"),
    CREATE_PRODUCT("ProductCreate"),
    GET_PRODUCT("GetProducts"),
    IMAGE_PRODUCT("Image"),
    UPDATE_STOCK_PRODUCT("ProductStockUpdate"),
    DELETE_PRODUCT("ProductRemove"),
    VERSION_KEY("Version"),
    VERSION("1.0"),
    SIGNATURE_KEY("Signature"),
    FORMAT_KEY("Format"),
    FORMART_JSON("XML"),
    TIMESTAMP_KEY("Timestamp"),
    FEED_ID_KEY("FeedID"),
    FEED_STATUS("FeedStatus"),
    FEED_LIST("FeedList"),
    GET_CATEGORY_ATTRIBUTES("GetCategoryAttributes"),
    BRAND("GetBrands"),
    GET_CATEGORY_TREE("GetCategoryTree"),
    USER_ID_KEY("UserID");

    String value;

    ActionConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
