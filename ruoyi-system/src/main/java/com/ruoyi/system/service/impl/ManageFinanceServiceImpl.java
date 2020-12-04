package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ManageFinanceMapper;
import com.ruoyi.system.domain.ManageFinance;
import com.ruoyi.system.service.IManageFinanceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 消费管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-04
 */
@Service
public class ManageFinanceServiceImpl implements IManageFinanceService 
{
    @Autowired
    private ManageFinanceMapper manageFinanceMapper;

    /**
     * 查询消费管理
     * 
     * @param id 消费管理ID
     * @return 消费管理
     */
    @Override
    public ManageFinance selectManageFinanceById(Long id)
    {
        return manageFinanceMapper.selectManageFinanceById(id);
    }

    /**
     * 查询消费管理列表
     * 
     * @param manageFinance 消费管理
     * @return 消费管理
     */
    @Override
    public List<ManageFinance> selectManageFinanceList(ManageFinance manageFinance)
    {
        return manageFinanceMapper.selectManageFinanceList(manageFinance);
    }

    /**
     * 新增消费管理
     * 
     * @param manageFinance 消费管理
     * @return 结果
     */
    @Override
    public int insertManageFinance(ManageFinance manageFinance)
    {
        manageFinance.setCreateTime(DateUtils.getNowDate());
        return manageFinanceMapper.insertManageFinance(manageFinance);
    }

    /**
     * 修改消费管理
     * 
     * @param manageFinance 消费管理
     * @return 结果
     */
    @Override
    public int updateManageFinance(ManageFinance manageFinance)
    {
        manageFinance.setUpdateTime(DateUtils.getNowDate());
        return manageFinanceMapper.updateManageFinance(manageFinance);
    }

    /**
     * 删除消费管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteManageFinanceByIds(String ids)
    {
        return manageFinanceMapper.deleteManageFinanceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除消费管理信息
     * 
     * @param id 消费管理ID
     * @return 结果
     */
    @Override
    public int deleteManageFinanceById(Long id)
    {
        return manageFinanceMapper.deleteManageFinanceById(id);
    }
}
