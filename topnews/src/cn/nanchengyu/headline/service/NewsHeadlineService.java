package cn.nanchengyu.headline.service;

import cn.nanchengyu.headline.pojo.vo.HeadlineDetailVo;
import cn.nanchengyu.headline.pojo.vo.HeadlineQueryVo;

import java.util.Map;

/**
 * ClassName: newUserService
 * Package: cn.nanchengyu.headline.service
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 23:08
 * @Version 1.0
 */
public interface NewsHeadlineService {
    /**
     *
     * @param headlineQueryVO
     * @return
     */
    Map findPage(HeadlineQueryVo headlineQueryVO);

    HeadlineDetailVo findHeadlineDetail(int hid);
}
