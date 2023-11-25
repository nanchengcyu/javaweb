package cn.nanchengyu.schedule.test;

import cn.nanchengyu.schedule.dao.BaseDao;
import org.junit.BeforeClass;

/**
 * ClassName: TestBaseDao
 * Package: cn.nanchengyu.schedule.test
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/26 0:39
 * @Version 1.0
 */
public class TestBaseDao {
    private static BaseDao baseDao;
    @BeforeClass
    public static void initBaseDao(){
        baseDao = new BaseDao();
    }
    @org.junit.Test
    public void testBaseQueryObject(){
        String sql ="select count(1) from sys_user";
        Long count = baseDao.baseQueryObject(Long.class, sql);
        System.out.println(count);

    }
}
