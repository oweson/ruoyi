package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.GithubNews;

/**
 * 新闻Service接口
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
public interface IGithubNewsService 
{
    /**
     * 查询新闻
     * 
     * @param id 新闻ID
     * @return 新闻
     */
    public GithubNews selectGithubNewsById(Long id);

    /**
     * 查询新闻列表
     * 
     * @param githubNews 新闻
     * @return 新闻集合
     */
    public List<GithubNews> selectGithubNewsList(GithubNews githubNews);

    /**
     * 新增新闻
     * 
     * @param githubNews 新闻
     * @return 结果
     */
    public int insertGithubNews(GithubNews githubNews);

    /**
     * 修改新闻
     * 
     * @param githubNews 新闻
     * @return 结果
     */
    public int updateGithubNews(GithubNews githubNews);

    /**
     * 批量删除新闻
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGithubNewsByIds(String ids);

    /**
     * 删除新闻信息
     * 
     * @param id 新闻ID
     * @return 结果
     */
    public int deleteGithubNewsById(Long id);
}
