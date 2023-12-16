package cn.nanchengyu.pojo;

/**
 * ClassName: Address
 * Package: cn.nanchengyu.pojo
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/16 20:36
 * @Version 1.0
 */
public class Address {
    String province;
    String city;


    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
