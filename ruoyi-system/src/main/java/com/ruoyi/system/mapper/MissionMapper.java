package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Mission;

/**
 * 项目精锐Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-04
 */
public interface MissionMapper 
{
    /**
     * 查询项目精锐
     * 
     * @param id 项目精锐ID
     * @return 项目精锐
     */
    public Mission selectMissionById(Long id);

    /**
     * 查询项目精锐列表
     * 
     * @param mission 项目精锐
     * @return 项目精锐集合
     */
    public List<Mission> selectMissionList(Mission mission);

    /**
     * 新增项目精锐
     * 
     * @param mission 项目精锐
     * @return 结果
     */
    public int insertMission(Mission mission);

    /**
     * 修改项目精锐
     * 
     * @param mission 项目精锐
     * @return 结果
     */
    public int updateMission(Mission mission);

    /**
     * 删除项目精锐
     * 
     * @param id 项目精锐ID
     * @return 结果
     */
    public int deleteMissionById(Long id);

    /**
     * 批量删除项目精锐
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMissionByIds(String[] ids);
}
