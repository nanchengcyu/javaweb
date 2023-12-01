package cn.nanchengyu.headline.pojo;

/**
 * ClassName: NewsType
 * Package: cn.nanchengyu.headline.pojo
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 22:56
 * @Version 1.0
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewsType implements Serializable {
    private Integer tid;
    private String tname;
}
