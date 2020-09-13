package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.GzLessonTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GzLessonMapper;
import com.ruoyi.system.domain.GzLesson;
import com.ruoyi.system.service.IGzLessonService;
import com.ruoyi.common.core.text.Convert;

/**
 * 经验教训Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-07-31
 */
@Service
public class GzLessonServiceImpl implements IGzLessonService 
{
    @Autowired
    private GzLessonMapper gzLessonMapper;

    @Override
    public GzLesson selectGzLessonByName(String name) {
        return gzLessonMapper.selectGzLessonByName(name);
    }

    /**
     * 查询经验教训
     * 
     * @param id 经验教训ID
     * @return 经验教训
     */
    @Override
    public GzLesson selectGzLessonById(Long id)
    {
        return gzLessonMapper.selectGzLessonById(id);
    }

    /**
     * 查询经验教训列表
     * 
     * @param gzLesson 经验教训
     * @return 经验教训
     */
    @Override
    public List<GzLesson> selectGzLessonList(GzLesson gzLesson)
    {
        return gzLessonMapper.selectGzLessonList(gzLesson);
    }

    /**
     * 新增经验教训
     * 
     * @param gzLesson 经验教训
     * @return 结果
     */
    @Override
    public int insertGzLesson(GzLesson gzLesson)
    {
        gzLesson.setCreateTime(DateUtils.getNowDate());
        return gzLessonMapper.insertGzLesson(gzLesson);
    }

    /**
     * 修改经验教训
     * 
     * @param gzLesson 经验教训
     * @return 结果
     */
    @Override
    public int updateGzLesson(GzLesson gzLesson)
    {
        return gzLessonMapper.updateGzLesson(gzLesson);
    }

    /**
     * 删除经验教训对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGzLessonByIds(String ids)
    {
        return gzLessonMapper.deleteGzLessonByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除经验教训信息
     * 
     * @param id 经验教训ID
     * @return 结果
     */
    @Override
    public int deleteGzLessonById(Long id)
    {
        return gzLessonMapper.deleteGzLessonById(id);
    }
}
