package xbed.com.cn.dao.access.business;

import org.apache.ibatis.annotations.Param;
import xbed.com.cn.bean.bo.CheckinInfoBo;
import xbed.com.cn.dao.entity.business.CheckinInfo;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface CheckinInfoMapper {
    int deleteByPrimaryKey(Integer checkinInfoId);

    int insert(CheckinInfo record);

    int insertSelective(CheckinInfo record);

    CheckinInfo selectByPrimaryKey(Integer checkinInfoId);

    int updateByPrimaryKeySelective(CheckinInfo record);

    int updateByPrimaryKey(CheckinInfo record);

    /**
     * Batch update or insert. Parameters can not be more than 2100
     * list of size not greater than 1000
     */
    void updateBySelectiveBatch(List<CheckinInfo> list);

    void updateBatch(List<CheckinInfo> list);

    void insertBatch(List<CheckinInfo> list);



    List<CheckinInfo> queryByCondition(Map<String, Object> params);

    List<CheckinInfo> queryOrderByCheckoutTime(Map<String, Object> params);

    List<CheckinInfo> queryOrderByCheckoutTimeDesc(Map<String, Object> params);

    List<CheckinInfo> queryCheckinNotOrderByCheckoutTimeDesc(Map<String, Object> params);

    List<CheckinInfo> queryCreatedAtLessThan(Map<String, Object> params);

    List<CheckinInfo> queryCreatedAtLessGreater(Map<String, Object> params);

    List<CheckinInfoBo> queryCheckinInfoBoByPage(Map<String, Object> params);

    List<CheckinInfo> queryByOrderNoIn(List<String> list);

    List<CheckinInfoBo> queryByCheckinIdIn(List<Integer> checkinIds);

    List<Map<String, Object>> findPayCheckinInfoRoomIds(Map<String, Object> params);

    List<CheckinInfo> findOverstayOrder();

    List<Map<String, Object>> findOverStayPass();

    int updateCheckinForOverStay(Map<String, Object> params);
    /**
     * 查询需要发送开门密码短信的续住单
     * @return
     */
    List<Map<String, Object>> findOverStayPassOwner();
    /**
     * 12点把当天的续住单变更为已入住
     * @return
     */
    int updateCheckinForOverStayOwner();
    /**
     * 所有订单列表
     * @date 2017年7月26日 下午5:03:25
     * @author wangm
     * @return
     */
    int listAllOrderListCount(Map<String, Object> params);
    List<Map<String, Object>> listAllOrderListData(Map<String, Object> params);
    /**
     * 根据入住单ID集合查询入住信息
     * @date 2017年7月27日 下午9:49:08
     * @author wangm
     * @param checkinIdList
     * @return
     */
    List<CheckinInfo> listCheckinInfoByCID(List<Integer> checkinIdList);
    /**
     * 查询
     * @param orderNo
     * @return
     */
    List<CheckinInfo> queryNormalCheckinInfoList(String orderNo);
    /**
     * 根据入住单id和入住状态查询子入住单
     * @param checkinId
     * @return
     */
    List<CheckinInfo> queryByCheckinAndCheckinId(@Param("checkinId") Integer checkinId);
    /**
     * 根据入住单ID查询子入住单
     * @date 2017年10月11日 下午8:46:32
     * @author wangm
     * @param checkinId
     * @return
     */
    List<CheckinInfo> listByCheckinID(@Param("checkinId") Integer checkinId);
    /**
     * 根据订单号查询子入住单
     * @date 2017年10月11日 下午9:43:01
     * @author wangm
     * @param orderNo
     * @return
     */
    List<CheckinInfo> listByOrderNo(@Param("orderNo") String orderNo);
    /*
     * 根据传递的参数更新对应字段
     * @param params
     * @return
     */
    int updateByPrimaryKeyMap(Map<String, Object> params);
    /**
     * 根据ID更新密码
     * @date 2017年10月14日 下午11:14:26
     * @author wangm
     * @param checkinId
     * @param passWord
     * @return
     */
    int updateOpenPassWordById(@Param("checkinInfoId") Integer checkinInfoId, @Param("passWord") String passWord);

    /*
     * 查询未支付的子入住单数量
     * @param checkinIds
     * @return
     */
    List<Map<String,Object>> queryNotPaidInfoNumByCheckinIds(@Param("checkinIds") Set<Integer> checkinIds);
    /**
     * 查询未支付的子入住单数量
     * @param checkinId
     * @return
     */
    Integer queryNotPaidInfoNumByCheckinId(@Param("checkinId") Integer checkinId);
    /**
     * 查询最新的子入住单预定渠道
     * @return
     */
    Map<String,Object> queryOrderSource(@Param("checkinId") Integer checkinId);
    /**
     * 根据子入住单ID更新状态
     * @date 2017年11月8日 下午7:49:36
     * @author wangm
     * @param idList
     * @param stat
     * @param endDate
     * @return
     */
    int updateStatByCheckinInfoId(@Param("idList") List<Integer> idList, @Param("stat") Integer stat, @Param("endDate") Date endDate);
    /**
     *
     * @param checkinId
     * @return
     */
    Integer queryNotPaidPackageInfoNum(@Param("checkinId") Integer checkinId);
    /**
     * 根据子入住单ID集合查询子入住单
     * @date 2017年11月14日 上午11:48:38
     * @author wangm
     * @param idList
     * @return
     */
    List<CheckinInfo> listCheckinInfoByIdList(@Param("idList") List<Integer> idList);
    /**
     * 查询待支付的
     * @param orderNo
     * @return
     */
    Integer queryNotPaidPackageInfoNum(@Param("orderNo") String orderNo);
}