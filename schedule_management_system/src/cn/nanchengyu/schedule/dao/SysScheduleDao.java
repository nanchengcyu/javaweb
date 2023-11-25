package cn.nanchengyu.schedule.dao;

import cn.nanchengyu.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * ClassName: SysSScheduleDao
 * Package: cn.nanchengyu.schedule.dao
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/26 0:02
 * @Version 1.0
 */
public interface SysScheduleDao {
    /*
    * 用于向数据中增加一条日程记录
    * @param schedule 日程数据以SysSchedule实体类对象形式入参
    * @return 返回影响数据库记录的行数，行数为0说明增加行数失败，行数大于0说明增加成功
    * */
    int addSchedule(SysSchedule schedule);

    List<SysSchedule> findAll();

}
