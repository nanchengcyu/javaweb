package cn.nanchengyu.headline.dao.impl.NewUserDaoImpl;

import cn.nanchengyu.headline.dao.BaseDao;
import cn.nanchengyu.headline.dao.NewsUserDao;
import cn.nanchengyu.headline.pojo.NewsUser;

import java.util.List;

/**
 * ClassName: NewUserDaoImpl
 * Package: cn.nanchengyu.headline.dao.impl.NewUserDaoImpl
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/30 23:05
 * @Version 1.0
 */
public class NewUserDaoImpl extends BaseDao implements NewsUserDao {
    @Override
    public NewsUser findByUsername(String username) {
        String sql = """
                select uid,
                 username,
                 user_pwd userPwd,
                 nick_name nickName
                 from 
                    news_user 
                 where 
                    username = ?
                """;
        List<NewsUser> newsUserList = baseQuery(NewsUser.class, sql, username);

        return newsUserList != null && newsUserList.size() > 0 ? newsUserList.get(0) : null;
    }

    @Override
    public NewsUser findByUid(Integer userId) {
        String sql = """
                select uid,
                 username,
                 user_pwd userPwd,
                 nick_name nickName
                 from 
                    news_user 
                 where 
                    uid = ?
                """;
        List<NewsUser> newsUserList = baseQuery(NewsUser.class, sql, userId);

        return newsUserList != null && newsUserList.size() > 0 ? newsUserList.get(0) : null;
    }

    @Override
    public Integer insertUser(NewsUser registUser) {
       String sql = """
            insert into news_user values (DEFAULT,?,?,?)
        """;
       return baseUpdate(sql, registUser.getUsername(), registUser.getUserPwd(), registUser.getNickName());
    }
}
