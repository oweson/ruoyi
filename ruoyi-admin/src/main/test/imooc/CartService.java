package imooc;

import java.util.ArrayList;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/14 19:46
 */
public class CartService {
    // 1 加入到购物车里面的商品信息
    private static List<Sku> cartSkuList = new ArrayList<Sku>() {
        {
            add(new Sku(1001, "无人机", 9999.9,
                    1, 9999.9, SkuCategory.ELECTRONICE) {
            });
            add(new Sku(1002, "西游记", 500.0,
                    2, 1000.0, SkuCategory.BOOKS) {
            });
            add(new Sku(1003, "360运动鞋", 100.0,
                    2, 200.0, SkuCategory.SPORTS) {
            });
            add(new Sku(1004, "服装类", 1000.0,
                    10, 100000.0, SkuCategory.CLOTHERY) {
            });
        }
    };

    // 2 获得商品信息列表
    public static List<Sku> getCartSkuList() {
        return cartSkuList;
    }
}
