package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.GithubSofttext;

/**
 * 软文Service接口
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
public interface IGithubSofttextService 
{
    /**
     * 查询软文
     * 
     * @param id 软文ID
     * @return 软文
     */
    public GithubSofttext selectGithubSofttextById(Long id);

    /**
     * 查询软文列表
     * 
     * @param githubSofttext 软文
     * @return 软文集合
     */
    public List<GithubSofttext> selectGithubSofttextList(GithubSofttext githubSofttext);

    /**
     * 新增软文
     * 
     * @param githubSofttext 软文
     * @return 结果
     */
    public int insertGithubSofttext(GithubSofttext githubSofttext);

    /**
     * 修改软文
     * 
     * @param githubSofttext 软文
     * @return 结果
     */
    public int updateGithubSofttext(GithubSofttext githubSofttext);

    /**
     * 批量删除软文
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGithubSofttextByIds(String ids);

    /**
     * 删除软文信息
     * 
     * @param id 软文ID
     * @return 结果
     */
    public int deleteGithubSofttextById(Long id);
}
