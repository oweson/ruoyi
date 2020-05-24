package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.LifeAchievement;

/**
 * 每天成就Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
public interface LifeAchievementMapper 
{
    /**
     * 查询每天成就
     * 
     * @param id 每天成就ID
     * @return 每天成就
     */
    public LifeAchievement selectLifeAchievementById(Long id);

    /**
     * 查询每天成就列表
     * 
     * @param lifeAchievement 每天成就
     * @return 每天成就集合
     */
    public List<LifeAchievement> selectLifeAchievementList(LifeAchievement lifeAchievement);

    /**
     * 新增每天成就
     * 
     * @param lifeAchievement 每天成就
     * @return 结果
     */
    public int insertLifeAchievement(LifeAchievement lifeAchievement);

    /**
     * 修改每天成就
     * 
     * @param lifeAchievement 每天成就
     * @return 结果
     */
    public int updateLifeAchievement(LifeAchievement lifeAchievement);

    /**
     * 删除每天成就
     * 
     * @param id 每天成就ID
     * @return 结果
     */
    public int deleteLifeAchievementById(Long id);

    /**
     * 批量删除每天成就
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLifeAchievementByIds(String[] ids);
}
