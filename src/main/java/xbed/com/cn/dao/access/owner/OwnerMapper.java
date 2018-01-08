package xbed.com.cn.dao.access.owner;

import java.util.List;
import xbed.com.cn.dao.entity.owner.Owner;

public interface OwnerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Owner record);

    int insertSelective(Owner record);

    Owner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Owner record);

    int updateByPrimaryKey(Owner record);

    /**
     * Batch update or insert. Parameters can not be more than 2100
     * list of size not greater than 1000
     */
    void updateBySelectiveBatch(List<Owner> list);

    void updateBatch(List<Owner> list);

    void insertBatch(List<Owner> list);
}