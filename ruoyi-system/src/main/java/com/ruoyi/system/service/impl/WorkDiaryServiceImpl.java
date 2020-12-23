package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WorkDiaryMapper;
import com.ruoyi.system.domain.WorkDiary;
import com.ruoyi.system.service.IWorkDiaryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工作日报Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-22
 */
@Service
public class WorkDiaryServiceImpl implements IWorkDiaryService 
{
    @Autowired
    private WorkDiaryMapper workDiaryMapper;

    /**
     * 查询工作日报
     * 
     * @param id 工作日报ID
     * @return 工作日报
     */
    @Override
    public WorkDiary selectWorkDiaryById(Long id)
    {
        return workDiaryMapper.selectWorkDiaryById(id);
    }

    /**
     * 查询工作日报列表
     * 
     * @param workDiary 工作日报
     * @return 工作日报
     */
    @Override
    public List<WorkDiary> selectWorkDiaryList(WorkDiary workDiary)
    {
        return workDiaryMapper.selectWorkDiaryList(workDiary);
    }

    /**
     * 新增工作日报
     * 
     * @param workDiary 工作日报
     * @return 结果
     */
    @Override
    public int insertWorkDiary(WorkDiary workDiary)
    {
        workDiary.setCreateTime(DateUtils.getNowDate());
        return workDiaryMapper.insertWorkDiary(workDiary);
    }

    /**
     * 修改工作日报
     * 
     * @param workDiary 工作日报
     * @return 结果
     */
    @Override
    public int updateWorkDiary(WorkDiary workDiary)
    {
        workDiary.setUpdateTime(DateUtils.getNowDate());
        return workDiaryMapper.updateWorkDiary(workDiary);
    }

    /**
     * 删除工作日报对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWorkDiaryByIds(String ids)
    {
        return workDiaryMapper.deleteWorkDiaryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工作日报信息
     * 
     * @param id 工作日报ID
     * @return 结果
     */
    @Override
    public int deleteWorkDiaryById(Long id)
    {
        return workDiaryMapper.deleteWorkDiaryById(id);
    }
}
