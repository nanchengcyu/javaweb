package cn.nanchengyu.tlias.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ClassName: PageBean
 * Package: cn.nanchengyu.tlias.pojo
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/22 10:02
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean {
    private Long total; //总记录数
    private List rows; //数据列表
}
