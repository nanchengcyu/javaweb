package cn.nanchengyu.headline.pojo.vo;

/**
 * ClassName: HeadlinePageVo
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
public class HeadlinePageVo implements Serializable {
    private Integer hid;
    private String title;
    private Integer type;
    private Integer pageViews;
    private Long pastHours;
    private Integer publisher;
}
