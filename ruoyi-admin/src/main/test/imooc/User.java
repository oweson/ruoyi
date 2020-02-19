package imooc;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/14 20:01
 */
public class User {
    private Integer id;
    private String code;

    public User(Integer id, String code) {
        this.id = id;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
