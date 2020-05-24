package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GithubProjectv2Mapper;
import com.ruoyi.system.domain.GithubProjectv2;
import com.ruoyi.system.service.IGithubProjectv2Service;
import com.ruoyi.common.core.text.Convert;

/**
 * github_v2项目Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-05
 */
@Service
public class GithubProjectv2ServiceImpl implements IGithubProjectv2Service 
{
    @Autowired
    private GithubProjectv2Mapper githubProjectv2Mapper;

    /**
     * 查询github_v2项目
     * 
     * @param id github_v2项目ID
     * @return github_v2项目
     */
    @Override
    public GithubProjectv2 selectGithubProjectv2ById(Long id)
    {
        return githubProjectv2Mapper.selectGithubProjectv2ById(id);
    }

    /**
     * 查询github_v2项目列表
     * 
     * @param githubProjectv2 github_v2项目
     * @return github_v2项目
     */
    @Override
    public List<GithubProjectv2> selectGithubProjectv2List(GithubProjectv2 githubProjectv2)
    {
        return githubProjectv2Mapper.selectGithubProjectv2List(githubProjectv2);
    }

    /**
     * 新增github_v2项目
     * 
     * @param githubProjectv2 github_v2项目
     * @return 结果
     */
    @Override
    public int insertGithubProjectv2(GithubProjectv2 githubProjectv2)
    {
        githubProjectv2.setCreateTime(DateUtils.getNowDate());
        return githubProjectv2Mapper.insertGithubProjectv2(githubProjectv2);
    }

    /**
     * 修改github_v2项目
     * 
     * @param githubProjectv2 github_v2项目
     * @return 结果
     */
    @Override
    public int updateGithubProjectv2(GithubProjectv2 githubProjectv2)
    {
        return githubProjectv2Mapper.updateGithubProjectv2(githubProjectv2);
    }

    /**
     * 删除github_v2项目对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGithubProjectv2ByIds(String ids)
    {
        return githubProjectv2Mapper.deleteGithubProjectv2ByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除github_v2项目信息
     * 
     * @param id github_v2项目ID
     * @return 结果
     */
    @Override
    public int deleteGithubProjectv2ById(Long id)
    {
        return githubProjectv2Mapper.deleteGithubProjectv2ById(id);
    }
}
