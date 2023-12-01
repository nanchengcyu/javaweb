package cn.nanchengyu.headline.pojo.vo;

/**
 * ClassName: HeadlineQueryVo
 * Package: cn.nanchengyu.headline.pojo.vo
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 22:59
 * @Version 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HeadlineQueryVo implements Serializable {
    private String keyWords;
    private Integer type ;
    private Integer pageNum;
    private Integer pageSize;
}