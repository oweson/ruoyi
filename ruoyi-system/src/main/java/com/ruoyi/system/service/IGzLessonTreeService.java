package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.GzLessonTree;
import com.ruoyi.common.core.domain.Ztree;

/**
 * 经验教训Service接口
 * 
 * @author ruoyi
 * @date 2020-08-14
 */
public interface IGzLessonTreeService 
{
    /**
     * 查询经验教训
     * 
     * @param id 经验教训ID
     * @return 经验教训
     */
    public GzLessonTree selectGzLessonTreeById(Long id);

    /**
     * 查询经验教训列表
     * 
     * @param gzLessonTree 经验教训
     * @return 经验教训集合
     */
    public List<GzLessonTree> selectGzLessonTreeList(GzLessonTree gzLessonTree);

    /**
     * 新增经验教训
     * 
     * @param gzLessonTree 经验教训
     * @return 结果
     */
    public int insertGzLessonTree(GzLessonTree gzLessonTree);

    /**
     * 修改经验教训
     * 
     * @param gzLessonTree 经验教训
     * @return 结果
     */
    public int updateGzLessonTree(GzLessonTree gzLessonTree);

    /**
     * 批量删除经验教训
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGzLessonTreeByIds(String ids);

    /**
     * 删除经验教训信息
     * 
     * @param id 经验教训ID
     * @return 结果
     */
    public int deleteGzLessonTreeById(Long id);

    /**
     * 查询经验教训树列表
     * 
     * @return 所有经验教训信息
     */
    public List<Ztree> selectGzLessonTreeTree();
}
