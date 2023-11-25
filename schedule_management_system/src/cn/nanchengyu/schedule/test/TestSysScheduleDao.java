package cn.nanchengyu.schedule.test;

import cn.nanchengyu.schedule.dao.SysScheduleDao;
import cn.nanchengyu.schedule.dao.impl.SysScheduleDaoImpl;
import cn.nanchengyu.schedule.pojo.SysSchedule;
import org.junit.BeforeClass;

import java.util.List;

/**
 * ClassName: TestSysScheduleDao
 * Package: cn.nanchengyu.schedule.test
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/26 1:03
 * @Version 1.0
 */
public class TestSysScheduleDao {

    public static SysScheduleDao sysScheduleDao;
    @BeforeClass
    public static void initScheduleDao(){
        sysScheduleDao = new SysScheduleDaoImpl();
    }
    @org.junit.Test
    public void testAddSchedule(){
        int rows = sysScheduleDao.addSchedule(new SysSchedule(null, 1, "好好学习study", 0));
        System.out.println(rows);
    }

    @org.junit.Test
    public void testFindAll(){
        List<SysSchedule> sysScheduleList = sysScheduleDao.findAll();
        sysScheduleList.forEach(System.out::println);

    }
}
