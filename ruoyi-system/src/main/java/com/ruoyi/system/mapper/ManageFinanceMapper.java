package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ManageFinance;

/**
 * 消费管理Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-04
 */
public interface ManageFinanceMapper 
{
    /**
     * 查询消费管理
     * 
     * @param id 消费管理ID
     * @return 消费管理
     */
    public ManageFinance selectManageFinanceById(Long id);

    /**
     * 查询消费管理列表
     * 
     * @param manageFinance 消费管理
     * @return 消费管理集合
     */
    public List<ManageFinance> selectManageFinanceList(ManageFinance manageFinance);

    /**
     * 新增消费管理
     * 
     * @param manageFinance 消费管理
     * @return 结果
     */
    public int insertManageFinance(ManageFinance manageFinance);

    /**
     * 修改消费管理
     * 
     * @param manageFinance 消费管理
     * @return 结果
     */
    public int updateManageFinance(ManageFinance manageFinance);

    /**
     * 删除消费管理
     * 
     * @param id 消费管理ID
     * @return 结果
     */
    public int deleteManageFinanceById(Long id);

    /**
     * 批量删除消费管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteManageFinanceByIds(String[] ids);
}
