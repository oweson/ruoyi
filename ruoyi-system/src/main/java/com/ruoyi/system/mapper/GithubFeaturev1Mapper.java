package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.GithubFeaturev1;

/**
 * github特色技能描述Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-05
 */
public interface GithubFeaturev1Mapper 
{
    /**
     * 查询github特色技能描述
     * 
     * @param id github特色技能描述ID
     * @return github特色技能描述
     */
    public GithubFeaturev1 selectGithubFeaturev1ById(Long id);

    /**
     * 查询github特色技能描述列表
     * 
     * @param githubFeaturev1 github特色技能描述
     * @return github特色技能描述集合
     */
    public List<GithubFeaturev1> selectGithubFeaturev1List(GithubFeaturev1 githubFeaturev1);

    /**
     * 新增github特色技能描述
     * 
     * @param githubFeaturev1 github特色技能描述
     * @return 结果
     */
    public int insertGithubFeaturev1(GithubFeaturev1 githubFeaturev1);

    /**
     * 修改github特色技能描述
     * 
     * @param githubFeaturev1 github特色技能描述
     * @return 结果
     */
    public int updateGithubFeaturev1(GithubFeaturev1 githubFeaturev1);

    /**
     * 删除github特色技能描述
     * 
     * @param id github特色技能描述ID
     * @return 结果
     */
    public int deleteGithubFeaturev1ById(Long id);

    /**
     * 批量删除github特色技能描述
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGithubFeaturev1ByIds(String[] ids);
}
