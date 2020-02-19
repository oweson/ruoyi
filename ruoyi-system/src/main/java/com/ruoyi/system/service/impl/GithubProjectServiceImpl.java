package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GithubProjectMapper;
import com.ruoyi.system.domain.GithubProject;
import com.ruoyi.system.service.IGithubProjectService;
import com.ruoyi.common.core.text.Convert;

/**
 * github项目Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-07
 */
@Service
public class GithubProjectServiceImpl implements IGithubProjectService 
{
    @Autowired
    private GithubProjectMapper githubProjectMapper;

    /**
     * 查询github项目
     * 
     * @param id github项目ID
     * @return github项目
     */
    @Override
    public GithubProject selectGithubProjectById(Long id)
    {
        return githubProjectMapper.selectGithubProjectById(id);
    }

    /**
     * 查询github项目列表
     * 
     * @param githubProject github项目
     * @return github项目
     */
    @Override
    public List<GithubProject> selectGithubProjectList(GithubProject githubProject)
    {
        return githubProjectMapper.selectGithubProjectList(githubProject);
    }

    /**
     * 新增github项目
     * 
     * @param githubProject github项目
     * @return 结果
     */
    @Override
    public int insertGithubProject(GithubProject githubProject)
    {
        githubProject.setCreateTime(DateUtils.getNowDate());
        return githubProjectMapper.insertGithubProject(githubProject);
    }

    /**
     * 修改github项目
     * 
     * @param githubProject github项目
     * @return 结果
     */
    @Override
    public int updateGithubProject(GithubProject githubProject)
    {
        return githubProjectMapper.updateGithubProject(githubProject);
    }

    /**
     * 删除github项目对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGithubProjectByIds(String ids)
    {
        return githubProjectMapper.deleteGithubProjectByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除github项目信息
     * 
     * @param id github项目ID
     * @return 结果
     */
    @Override
    public int deleteGithubProjectById(Long id)
    {
        return githubProjectMapper.deleteGithubProjectById(id);
    }
}
