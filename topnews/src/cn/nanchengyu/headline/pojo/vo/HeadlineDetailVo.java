package cn.nanchengyu.headline.pojo.vo;

/**
 * ClassName: HeadlineDetailVo
 * Package: cn.nanchengyu.headline.pojo.vo
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 23:00
 * @Version 1.0
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HeadlineDetailVo implements Serializable {
    private Integer hid;
    private String title;
    private String article;
    private Integer type;
    private String typeName;
    private Integer pageViews;
    private Long pastHours;
    private Integer publisher;
    private String author;
}
