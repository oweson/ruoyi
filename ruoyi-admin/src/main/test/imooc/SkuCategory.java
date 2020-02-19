package imooc;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/14 19:42
 */
public enum SkuCategory {
    CLOTHERY(10, "服装类"),
    ELECTRONICE(20, "电子类"),
    SPORTS(30, "运动类"),
    BOOKS(40, "图书类");
    private Integer code;
    // 1 分类的编号
    private String name;
    // 2 分类的名字

    SkuCategory(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
