package cn.nanchengyu.headline.pojo;

/**
 * ClassName: NewsHeadline
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
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewsHeadline implements Serializable {
    private Integer hid;
    private String title;
    private String article;
    private Integer type;
    private Integer publisher;
    private Integer pageViews;
    private Date createTime;
    private Date updateTime;
    private Integer isDeleted;

}