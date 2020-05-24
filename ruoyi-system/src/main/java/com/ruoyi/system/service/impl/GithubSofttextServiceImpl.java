package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GithubSofttextMapper;
import com.ruoyi.system.domain.GithubSofttext;
import com.ruoyi.system.service.IGithubSofttextService;
import com.ruoyi.common.core.text.Convert;

/**
 * 软文Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
@Service
public class GithubSofttextServiceImpl implements IGithubSofttextService 
{
    @Autowired
    private GithubSofttextMapper githubSofttextMapper;

    /**
     * 查询软文
     * 
     * @param id 软文ID
     * @return 软文
     */
    @Override
    public GithubSofttext selectGithubSofttextById(Long id)
    {
        return githubSofttextMapper.selectGithubSofttextById(id);
    }

    /**
     * 查询软文列表
     * 
     * @param githubSofttext 软文
     * @return 软文
     */
    @Override
    public List<GithubSofttext> selectGithubSofttextList(GithubSofttext githubSofttext)
    {
        return githubSofttextMapper.selectGithubSofttextList(githubSofttext);
    }

    /**
     * 新增软文
     * 
     * @param githubSofttext 软文
     * @return 结果
     */
    @Override
    public int insertGithubSofttext(GithubSofttext githubSofttext)
    {
        githubSofttext.setCreateTime(DateUtils.getNowDate());
        return githubSofttextMapper.insertGithubSofttext(githubSofttext);
    }

    /**
     * 修改软文
     * 
     * @param githubSofttext 软文
     * @return 结果
     */
    @Override
    public int updateGithubSofttext(GithubSofttext githubSofttext)
    {
        return githubSofttextMapper.updateGithubSofttext(githubSofttext);
    }

    /**
     * 删除软文对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGithubSofttextByIds(String ids)
    {
        return githubSofttextMapper.deleteGithubSofttextByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除软文信息
     * 
     * @param id 软文ID
     * @return 结果
     */
    @Override
    public int deleteGithubSofttextById(Long id)
    {
        return githubSofttextMapper.deleteGithubSofttextById(id);
    }
}
