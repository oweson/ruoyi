package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Joke;

/**
 * 段子Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-12
 */
public interface JokeMapper 
{
    /**
     * 查询段子
     * 
     * @param id 段子ID
     * @return 段子
     */
    public Joke selectJokeById(Long id);

    /**
     * 查询段子列表
     * 
     * @param joke 段子
     * @return 段子集合
     */
    public List<Joke> selectJokeList(Joke joke);

    /**
     * 新增段子
     * 
     * @param joke 段子
     * @return 结果
     */
    public int insertJoke(Joke joke);

    /**
     * 修改段子
     * 
     * @param joke 段子
     * @return 结果
     */
    public int updateJoke(Joke joke);

    /**
     * 删除段子
     * 
     * @param id 段子ID
     * @return 结果
     */
    public int deleteJokeById(Long id);

    /**
     * 批量删除段子
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJokeByIds(String[] ids);
}
