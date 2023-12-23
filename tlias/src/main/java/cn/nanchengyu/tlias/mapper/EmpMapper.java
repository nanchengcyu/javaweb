package cn.nanchengyu.tlias.mapper;

import cn.nanchengyu.tlias.pojo.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

/**
 * ClassName: EmpMapper
 * Package: cn.nanchengyu.tlias.mapper
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/21 20:21
 * @Version 1.0
 */
@Mapper
public interface EmpMapper {

//    @Select("select count(*) from emp")
//    public Long count();

//    /**
//     * 每页大小  分页查询 获取列表数据
//     * @param start
//     * @param pageSize
//     * @return
//     */
//    @Select("select * from emp limit #{start},#{pageSize}")
//    public List<Emp> page(Integer start,Integer pageSize);

    /**
     * 员工信息查询
     * @return
     */
    //上面的为原始方法  下面为新的
//    @Select("select * from emp")
    public List<Emp> list( String name, Short gender, LocalDate begin, LocalDate end);

    void delete(List<Integer> ids);

    @Insert("insert into emp(username,name,gender,image,job,entrydate,dept_id,create_time,update_time)" +
            "values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime}) ")
    void insert(Emp emp);

    @Select("select * from emp where id = #{id}")
    Emp getById(Integer id);

    /**
     * 更新员工信息操作
     * @param emp
     */
    void update(Emp emp);

    @Select("select * from emp where username = #{username} and password = #{password}")
    Emp getByUsernameAndPassword(Emp emp);

    @Delete("delete  from emp where dept_id = #{deptId}")
    void deleteByDeptId(Integer deptId);
}
