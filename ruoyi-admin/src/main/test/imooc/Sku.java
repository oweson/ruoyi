package imooc;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/14 19:36
 */
public class Sku {
    private  Integer skuId;
    // 1 编号
    private String skuName;
    // 2 商品名称
    private Double skuPrice;
    // 3 商品单价
    private Integer totalNunm;
    // 4 购买个数
    private  Double totalPrice;
    // 5 商品的总价
    private Enum skuCategory;;
    // 6 商品分类

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Double getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(Double skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Integer getTotalNunm() {
        return totalNunm;
    }

    public void setTotalNunm(Integer totalNunm) {
        this.totalNunm = totalNunm;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Enum getSkuCategory() {
        return skuCategory;
    }

    public void setSkuCategory(Enum skuCategory) {
        this.skuCategory = skuCategory;
    }

    public Sku(Integer skuId, String skuName, Double skuPrice, Integer totalNunm, Double totalPrice, Enum skuCategory) {
        this.skuId = skuId;
        this.skuName = skuName;
        this.skuPrice = skuPrice;
        this.totalNunm = totalNunm;
        this.totalPrice = totalPrice;
        this.skuCategory = skuCategory;

    }
}
