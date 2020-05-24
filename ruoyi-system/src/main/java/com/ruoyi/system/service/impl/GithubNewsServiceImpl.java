package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GithubNewsMapper;
import com.ruoyi.system.domain.GithubNews;
import com.ruoyi.system.service.IGithubNewsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 新闻Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
@Service
public class GithubNewsServiceImpl implements IGithubNewsService 
{
    @Autowired
    private GithubNewsMapper githubNewsMapper;

    /**
     * 查询新闻
     * 
     * @param id 新闻ID
     * @return 新闻
     */
    @Override
    public GithubNews selectGithubNewsById(Long id)
    {
        return githubNewsMapper.selectGithubNewsById(id);
    }

    /**
     * 查询新闻列表
     * 
     * @param githubNews 新闻
     * @return 新闻
     */
    @Override
    public List<GithubNews> selectGithubNewsList(GithubNews githubNews)
    {
        return githubNewsMapper.selectGithubNewsList(githubNews);
    }

    /**
     * 新增新闻
     * 
     * @param githubNews 新闻
     * @return 结果
     */
    @Override
    public int insertGithubNews(GithubNews githubNews)
    {
        githubNews.setCreateTime(DateUtils.getNowDate());
        return githubNewsMapper.insertGithubNews(githubNews);
    }

    /**
     * 修改新闻
     * 
     * @param githubNews 新闻
     * @return 结果
     */
    @Override
    public int updateGithubNews(GithubNews githubNews)
    {
        return githubNewsMapper.updateGithubNews(githubNews);
    }

    /**
     * 删除新闻对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGithubNewsByIds(String ids)
    {
        return githubNewsMapper.deleteGithubNewsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除新闻信息
     * 
     * @param id 新闻ID
     * @return 结果
     */
    @Override
    public int deleteGithubNewsById(Long id)
    {
        return githubNewsMapper.deleteGithubNewsById(id);
    }
}
