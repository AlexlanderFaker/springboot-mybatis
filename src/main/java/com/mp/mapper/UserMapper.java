package com.mp.mapper;
import com.mp.entity.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserMapper {
    User getUserInfo(int id);

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    int save(User user);

    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    int deleteById(int id);

    /**
     * 查询所有用户信息
     *
     * @return
     */
    List<User> selectAll();

}
