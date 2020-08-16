package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BasWord;

/**
 * wordMapper接口
 * 
 * @author ruoyi
 * @date 2020-08-06
 */
public interface BasWordMapper 
{
    /**
     * 查询word
     * 
     * @param id wordID
     * @return word
     */
    public BasWord selectBasWordById(Long id);

    /**
     * 查询word列表
     * 
     * @param basWord word
     * @return word集合
     */
    public List<BasWord> selectBasWordList(BasWord basWord);

    /**
     * 新增word
     * 
     * @param basWord word
     * @return 结果
     */
    public int insertBasWord(BasWord basWord);

    /**
     * 修改word
     * 
     * @param basWord word
     * @return 结果
     */
    public int updateBasWord(BasWord basWord);

    /**
     * 删除word
     * 
     * @param id wordID
     * @return 结果
     */
    public int deleteBasWordById(Long id);

    /**
     * 批量删除word
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBasWordByIds(String[] ids);
}
