package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.GzLesson;

/**
 * 经验教训Mapper接口
 * 
 * @author ruoyi
 * @date 2020-07-31
 */
public interface GzLessonMapper 
{
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
     * 删除经验教训
     * 
     * @param id 经验教训ID
     * @return 结果
     */
    public int deleteGzLessonById(Long id);

    /**
     * 批量删除经验教训
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGzLessonByIds(String[] ids);
}
