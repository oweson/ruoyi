package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.JokeMapper;
import com.ruoyi.system.domain.Joke;
import com.ruoyi.system.service.IJokeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 段子Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-12
 */
@Service
public class JokeServiceImpl implements IJokeService 
{
    @Autowired
    private JokeMapper jokeMapper;

    /**
     * 查询段子
     * 
     * @param id 段子ID
     * @return 段子
     */
    @Override
    public Joke selectJokeById(Long id)
    {
        return jokeMapper.selectJokeById(id);
    }

    /**
     * 查询段子列表
     * 
     * @param joke 段子
     * @return 段子
     */
    @Override
    public List<Joke> selectJokeList(Joke joke)
    {
        return jokeMapper.selectJokeList(joke);
    }

    /**
     * 新增段子
     * 
     * @param joke 段子
     * @return 结果
     */
    @Override
    public int insertJoke(Joke joke)
    {
        joke.setCreateTime(DateUtils.getNowDate());
        return jokeMapper.insertJoke(joke);
    }

    /**
     * 修改段子
     * 
     * @param joke 段子
     * @return 结果
     */
    @Override
    public int updateJoke(Joke joke)
    {
        joke.setUpdateTime(DateUtils.getNowDate());
        return jokeMapper.updateJoke(joke);
    }

    /**
     * 删除段子对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJokeByIds(String ids)
    {
        return jokeMapper.deleteJokeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除段子信息
     * 
     * @param id 段子ID
     * @return 结果
     */
    @Override
    public int deleteJokeById(Long id)
    {
        return jokeMapper.deleteJokeById(id);
    }
}
