package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.GzLesson;
import com.ruoyi.system.domain.GzLessonTree;

/**
 * 经验教训Service接口
 * 
 * @author ruoyi
 * @date 2020-07-31
 */
public interface IGzLessonService 
{
    public GzLesson selectGzLessonByName(String name);

    /**
     * 查询经验教训
     * 
     * @param id 经验教训ID
     * @return 经验教训
     */
    public GzLesson selectGzLessonById(Long id);

    /**
     * 查询经验教训列表
     * 
     * @param gzLesson 经验教训
     * @return 经验教训集合
     */
    public List<GzLesson> selectGzLessonList(GzLesson gzLesson);

    /**
     * 新增经验教训
     * 
     * @param gzLesson 经验教训
     * @return 结果
     */
    public int insertGzLesson(GzLesson gzLesson);

    /**
     * 修改经验教训
     * 
     * @param gzLesson 经验教训
     * @return 结果
     */
    public int updateGzLesson(GzLesson gzLesson);

    /**
     * 批量删除经验教训
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGzLessonByIds(String ids);

    /**
     * 删除经验教训信息
     * 
     * @param id 经验教训ID
     * @return 结果
     */
    public int deleteGzLessonById(Long id);
}
