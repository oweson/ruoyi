package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FireProjectMapper;
import com.ruoyi.system.domain.FireProject;
import com.ruoyi.system.service.IFireProjectService;
import com.ruoyi.common.core.text.Convert;

/**
 * 拥有的项目能力Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-06-03
 */
@Service
public class FireProjectServiceImpl implements IFireProjectService 
{
    @Autowired
    private FireProjectMapper fireProjectMapper;

    /**
     * 查询拥有的项目能力
     * 
     * @param id 拥有的项目能力ID
     * @return 拥有的项目能力
     */
    @Override
    public FireProject selectFireProjectById(Long id)
    {
        return fireProjectMapper.selectFireProjectById(id);
    }

    /**
     * 查询拥有的项目能力列表
     * 
     * @param fireProject 拥有的项目能力
     * @return 拥有的项目能力
     */
    @Override
    public List<FireProject> selectFireProjectList(FireProject fireProject)
    {
        return fireProjectMapper.selectFireProjectList(fireProject);
    }

    /**
     * 新增拥有的项目能力
     * 
     * @param fireProject 拥有的项目能力
     * @return 结果
     */
    @Override
    public int insertFireProject(FireProject fireProject)
    {
        fireProject.setCreateTime(DateUtils.getNowDate());
        return fireProjectMapper.insertFireProject(fireProject);
    }

    /**
     * 修改拥有的项目能力
     * 
     * @param fireProject 拥有的项目能力
     * @return 结果
     */
    @Override
    public int updateFireProject(FireProject fireProject)
    {
        return fireProjectMapper.updateFireProject(fireProject);
    }

    /**
     * 删除拥有的项目能力对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFireProjectByIds(String ids)
    {
        return fireProjectMapper.deleteFireProjectByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除拥有的项目能力信息
     * 
     * @param id 拥有的项目能力ID
     * @return 结果
     */
    @Override
    public int deleteFireProjectById(Long id)
    {
        return fireProjectMapper.deleteFireProjectById(id);
    }
}
