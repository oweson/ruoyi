package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.WorkDiary;

/**
 * 工作日报Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-22
 */
public interface WorkDiaryMapper 
{
    /**
     * 查询工作日报
     * 
     * @param id 工作日报ID
     * @return 工作日报
     */
    public WorkDiary selectWorkDiaryById(Long id);

    /**
     * 查询工作日报列表
     * 
     * @param workDiary 工作日报
     * @return 工作日报集合
     */
    public List<WorkDiary> selectWorkDiaryList(WorkDiary workDiary);

    /**
     * 新增工作日报
     * 
     * @param workDiary 工作日报
     * @return 结果
     */
    public int insertWorkDiary(WorkDiary workDiary);

    /**
     * 修改工作日报
     * 
     * @param workDiary 工作日报
     * @return 结果
     */
    public int updateWorkDiary(WorkDiary workDiary);

    /**
     * 删除工作日报
     * 
     * @param id 工作日报ID
     * @return 结果
     */
    public int deleteWorkDiaryById(Long id);

    /**
     * 批量删除工作日报
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWorkDiaryByIds(String[] ids);
}
