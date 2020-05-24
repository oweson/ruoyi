package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GithubFeaturev1Mapper;
import com.ruoyi.system.domain.GithubFeaturev1;
import com.ruoyi.system.service.IGithubFeaturev1Service;
import com.ruoyi.common.core.text.Convert;

/**
 * github特色技能描述Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-05
 */
@Service
public class GithubFeaturev1ServiceImpl implements IGithubFeaturev1Service 
{
    @Autowired
    private GithubFeaturev1Mapper githubFeaturev1Mapper;

    /**
     * 查询github特色技能描述
     * 
     * @param id github特色技能描述ID
     * @return github特色技能描述
     */
    @Override
    public GithubFeaturev1 selectGithubFeaturev1ById(Long id)
    {
        return githubFeaturev1Mapper.selectGithubFeaturev1ById(id);
    }

    /**
     * 查询github特色技能描述列表
     * 
     * @param githubFeaturev1 github特色技能描述
     * @return github特色技能描述
     */
    @Override
    public List<GithubFeaturev1> selectGithubFeaturev1List(GithubFeaturev1 githubFeaturev1)
    {
        return githubFeaturev1Mapper.selectGithubFeaturev1List(githubFeaturev1);
    }

    /**
     * 新增github特色技能描述
     * 
     * @param githubFeaturev1 github特色技能描述
     * @return 结果
     */
    @Override
    public int insertGithubFeaturev1(GithubFeaturev1 githubFeaturev1)
    {
        githubFeaturev1.setCreateTime(DateUtils.getNowDate());
        return githubFeaturev1Mapper.insertGithubFeaturev1(githubFeaturev1);
    }

    /**
     * 修改github特色技能描述
     * 
     * @param githubFeaturev1 github特色技能描述
     * @return 结果
     */
    @Override
    public int updateGithubFeaturev1(GithubFeaturev1 githubFeaturev1)
    {
        return githubFeaturev1Mapper.updateGithubFeaturev1(githubFeaturev1);
    }

    /**
     * 删除github特色技能描述对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGithubFeaturev1ByIds(String ids)
    {
        return githubFeaturev1Mapper.deleteGithubFeaturev1ByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除github特色技能描述信息
     * 
     * @param id github特色技能描述ID
     * @return 结果
     */
    @Override
    public int deleteGithubFeaturev1ById(Long id)
    {
        return githubFeaturev1Mapper.deleteGithubFeaturev1ById(id);
    }
}
