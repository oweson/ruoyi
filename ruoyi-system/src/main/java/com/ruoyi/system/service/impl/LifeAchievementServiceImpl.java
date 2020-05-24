package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LifeAchievementMapper;
import com.ruoyi.system.domain.LifeAchievement;
import com.ruoyi.system.service.ILifeAchievementService;
import com.ruoyi.common.core.text.Convert;

/**
 * 每天成就Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
@Service
public class LifeAchievementServiceImpl implements ILifeAchievementService 
{
    @Autowired
    private LifeAchievementMapper lifeAchievementMapper;

    /**
     * 查询每天成就
     * 
     * @param id 每天成就ID
     * @return 每天成就
     */
    @Override
    public LifeAchievement selectLifeAchievementById(Long id)
    {
        return lifeAchievementMapper.selectLifeAchievementById(id);
    }

    /**
     * 查询每天成就列表
     * 
     * @param lifeAchievement 每天成就
     * @return 每天成就
     */
    @Override
    public List<LifeAchievement> selectLifeAchievementList(LifeAchievement lifeAchievement)
    {
        return lifeAchievementMapper.selectLifeAchievementList(lifeAchievement);
    }

    /**
     * 新增每天成就
     * 
     * @param lifeAchievement 每天成就
     * @return 结果
     */
    @Override
    public int insertLifeAchievement(LifeAchievement lifeAchievement)
    {
        lifeAchievement.setCreateTime(DateUtils.getNowDate());
        return lifeAchievementMapper.insertLifeAchievement(lifeAchievement);
    }

    /**
     * 修改每天成就
     * 
     * @param lifeAchievement 每天成就
     * @return 结果
     */
    @Override
    public int updateLifeAchievement(LifeAchievement lifeAchievement)
    {
        return lifeAchievementMapper.updateLifeAchievement(lifeAchievement);
    }

    /**
     * 删除每天成就对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLifeAchievementByIds(String ids)
    {
        return lifeAchievementMapper.deleteLifeAchievementByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除每天成就信息
     * 
     * @param id 每天成就ID
     * @return 结果
     */
    @Override
    public int deleteLifeAchievementById(Long id)
    {
        return lifeAchievementMapper.deleteLifeAchievementById(id);
    }
}
