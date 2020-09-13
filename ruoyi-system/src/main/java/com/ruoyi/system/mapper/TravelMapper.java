package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Travel;

/**
 * 旅游Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-12
 */
public interface TravelMapper 
{
    /**
     * 查询旅游
     * 
     * @param id 旅游ID
     * @return 旅游
     */
    public Travel selectTravelById(Long id);

    /**
     * 查询旅游列表
     * 
     * @param travel 旅游
     * @return 旅游集合
     */
    public List<Travel> selectTravelList(Travel travel);

    /**
     * 新增旅游
     * 
     * @param travel 旅游
     * @return 结果
     */
    public int insertTravel(Travel travel);

    /**
     * 修改旅游
     * 
     * @param travel 旅游
     * @return 结果
     */
    public int updateTravel(Travel travel);

    /**
     * 删除旅游
     * 
     * @param id 旅游ID
     * @return 结果
     */
    public int deleteTravelById(Long id);

    /**
     * 批量删除旅游
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTravelByIds(String[] ids);
}
