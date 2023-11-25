package cn.nanchengyu.schedule.dao.impl;

import cn.nanchengyu.schedule.dao.BaseDao;
import cn.nanchengyu.schedule.dao.SysScheduleDao;
import cn.nanchengyu.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * ClassName: SysScheduleDaoImpl
 * Package: cn.nanchengyu.schedule.dao.impl
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/26 0:05
 * @Version 1.0
 */
public class SysScheduleDaoImpl extends BaseDao implements SysScheduleDao {
    @Override
    public int addSchedule(SysSchedule schedule) {
        String sql = "insert into sys_schedule values(DEFAULT,?,?,?)";
        int rows = baseUpdate(sql,schedule.getUid(),schedule.getTitle(),schedule.getCompleted());
        return rows;
    }

    @Override
    public List<SysSchedule> findAll() {
        String sql = "select sid,uid,title,completed from sys_schedule";
        List<SysSchedule> sysScheduleList = baseQuery(SysSchedule.class, sql);
        return sysScheduleList;
    }
}
