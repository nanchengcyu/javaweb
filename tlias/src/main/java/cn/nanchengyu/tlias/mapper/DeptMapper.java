package cn.nanchengyu.tlias.mapper;

import cn.nanchengyu.tlias.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: DeptMapper
 * Package: cn.nanchengyu.tlias.mapper
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/21 20:21
 * @Version 1.0
 */
@Mapper
public interface DeptMapper {
    /**
     * 查询全部部门
     * @return
     */
    @Select("select * from dept")
    List<Dept> list() ;

    /**
     * 根据ID删除部门
     * @param id
     */
    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into dept(name, create_time, update_time) values(#{name},#{createTime},#{updateTime})")
    void insert();
}
