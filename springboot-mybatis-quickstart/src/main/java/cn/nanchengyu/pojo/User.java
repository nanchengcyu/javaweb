package cn.nanchengyu.pojo;

/**
 * ClassName: User
 * Package: cn.nanchengyu.pojo
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/17 20:26
 * @Version 1.0
 */
public class User {
    private Integer id;
    private String name;
    private String username;
    private String gender;
    private Short age;

    public User(Integer id, String name, String username,String gender, Short age) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.gender = gender;
        this.age = age;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }
}
