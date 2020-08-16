package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.ArrayList;
import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GzLessonTreeMapper;
import com.ruoyi.system.domain.GzLessonTree;
import com.ruoyi.system.service.IGzLessonTreeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 经验教训Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-14
 */
@Service
public class GzLessonTreeServiceImpl implements IGzLessonTreeService 
{
    @Autowired
    private GzLessonTreeMapper gzLessonTreeMapper;

    /**
     * 查询经验教训
     * 
     * @param id 经验教训ID
     * @return 经验教训
     */
    @Override
    public GzLessonTree selectGzLessonTreeById(Long id)
    {
        return gzLessonTreeMapper.selectGzLessonTreeById(id);
    }

    /**
     * 查询经验教训列表
     * 
     * @param gzLessonTree 经验教训
     * @return 经验教训
     */
    @Override
    public List<GzLessonTree> selectGzLessonTreeList(GzLessonTree gzLessonTree)
    {
        return gzLessonTreeMapper.selectGzLessonTreeList(gzLessonTree);
    }

    /**
     * 新增经验教训
     * 
     * @param gzLessonTree 经验教训
     * @return 结果
     */
    @Override
    public int insertGzLessonTree(GzLessonTree gzLessonTree)
    {
        gzLessonTree.setCreateTime(DateUtils.getNowDate());
        return gzLessonTreeMapper.insertGzLessonTree(gzLessonTree);
    }

    /**
     * 修改经验教训
     * 
     * @param gzLessonTree 经验教训
     * @return 结果
     */
    @Override
    public int updateGzLessonTree(GzLessonTree gzLessonTree)
    {
        return gzLessonTreeMapper.updateGzLessonTree(gzLessonTree);
    }

    /**
     * 删除经验教训对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGzLessonTreeByIds(String ids)
    {
        return gzLessonTreeMapper.deleteGzLessonTreeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除经验教训信息
     * 
     * @param id 经验教训ID
     * @return 结果
     */
    @Override
    public int deleteGzLessonTreeById(Long id)
    {
        return gzLessonTreeMapper.deleteGzLessonTreeById(id);
    }

    /**
     * 查询经验教训树列表
     * 
     * @return 所有经验教训信息
     */
    @Override
    public List<Ztree> selectGzLessonTreeTree()
    {
        List<GzLessonTree> gzLessonTreeList = gzLessonTreeMapper.selectGzLessonTreeList(new GzLessonTree());
        List<Ztree> ztrees = new ArrayList<Ztree>();
        for (GzLessonTree gzLessonTree : gzLessonTreeList)
        {
            Ztree ztree = new Ztree();
            ztree.setId(gzLessonTree.getId());
            ztree.setpId(gzLessonTree.getParentId());
            ztree.setName(gzLessonTree.getLessonName());
            ztree.setTitle(gzLessonTree.getLessonName());
            ztrees.add(ztree);
        }
        return ztrees;
    }
}
