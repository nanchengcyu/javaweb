package cn.nanchengyu.pojo;

/**
 * ClassName: User
 * Package: cn.nanchengyu.pojo
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/16 20:28
 * @Version 1.0
 */

public class User {

    private Integer id;

    private String name;
    private  Address address;

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
