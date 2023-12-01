package cn.nanchengyu.headline.pojo;

/**
 * ClassName: NewUser
 * Package: cn.nanchengyu.headline.pojo
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 22:55
 * @Version 1.0
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewsUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;
    private String nickName;
}