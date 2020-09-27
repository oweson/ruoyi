package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.JavaNecessaryMapper;
import com.ruoyi.system.domain.JavaNecessary;
import com.ruoyi.system.service.IJavaNecessaryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 求职技术Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
@Service
public class JavaNecessaryServiceImpl implements IJavaNecessaryService 
{
    @Autowired
    private JavaNecessaryMapper javaNecessaryMapper;

    /**
     * 查询求职技术
     * 
     * @param id 求职技术ID
     * @return 求职技术
     */
    @Override
    public JavaNecessary selectJavaNecessaryById(Long id)
    {
        return javaNecessaryMapper.selectJavaNecessaryById(id);
    }

    /**
     * 查询求职技术列表
     * 
     * @param javaNecessary 求职技术
     * @return 求职技术
     */
    @Override
    public List<JavaNecessary> selectJavaNecessaryList(JavaNecessary javaNecessary)
    {
        return javaNecessaryMapper.selectJavaNecessaryList(javaNecessary);
    }

    /**
     * 新增求职技术
     * 
     * @param javaNecessary 求职技术
     * @return 结果
     */
    @Override
    public int insertJavaNecessary(JavaNecessary javaNecessary)
    {
        return javaNecessaryMapper.insertJavaNecessary(javaNecessary);
    }

    /**
     * 修改求职技术
     * 
     * @param javaNecessary 求职技术
     * @return 结果
     */
    @Override
    public int updateJavaNecessary(JavaNecessary javaNecessary)
    {
        return javaNecessaryMapper.updateJavaNecessary(javaNecessary);
    }

    /**
     * 删除求职技术对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJavaNecessaryByIds(String ids)
    {
        return javaNecessaryMapper.deleteJavaNecessaryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除求职技术信息
     * 
     * @param id 求职技术ID
     * @return 结果
     */
    @Override
    public int deleteJavaNecessaryById(Long id)
    {
        return javaNecessaryMapper.deleteJavaNecessaryById(id);
    }
}
