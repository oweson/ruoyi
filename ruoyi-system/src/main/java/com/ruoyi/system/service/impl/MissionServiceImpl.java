package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MissionMapper;
import com.ruoyi.system.domain.Mission;
import com.ruoyi.system.service.IMissionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 项目精锐Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-04
 */
@Service
public class MissionServiceImpl implements IMissionService 
{
    @Autowired
    private MissionMapper missionMapper;

    /**
     * 查询项目精锐
     * 
     * @param id 项目精锐ID
     * @return 项目精锐
     */
    @Override
    public Mission selectMissionById(Long id)
    {
        return missionMapper.selectMissionById(id);
    }

    /**
     * 查询项目精锐列表
     * 
     * @param mission 项目精锐
     * @return 项目精锐
     */
    @Override
    public List<Mission> selectMissionList(Mission mission)
    {
        return missionMapper.selectMissionList(mission);
    }

    /**
     * 新增项目精锐
     * 
     * @param mission 项目精锐
     * @return 结果
     */
    @Override
    public int insertMission(Mission mission)
    {
        mission.setCreateTime(DateUtils.getNowDate());
        return missionMapper.insertMission(mission);
    }

    /**
     * 修改项目精锐
     * 
     * @param mission 项目精锐
     * @return 结果
     */
    @Override
    public int updateMission(Mission mission)
    {
        mission.setUpdateTime(DateUtils.getNowDate());
        return missionMapper.updateMission(mission);
    }

    /**
     * 删除项目精锐对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMissionByIds(String ids)
    {
        return missionMapper.deleteMissionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除项目精锐信息
     * 
     * @param id 项目精锐ID
     * @return 结果
     */
    @Override
    public int deleteMissionById(Long id)
    {
        return missionMapper.deleteMissionById(id);
    }
}
