package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Words;

/**
 * wordsMapper接口
 * 
 * @author ruoyi
 * @date 2020-09-27
 */
public interface WordsMapper 
{
    /**
     * 查询words
     * 
     * @param id wordsID
     * @return words
     */
    public Words selectWordsById(Integer id);

    /**
     * 查询words列表
     * 
     * @param words words
     * @return words集合
     */
    public List<Words> selectWordsList(Words words);

    /**
     * 新增words
     * 
     * @param words words
     * @return 结果
     */
    public int insertWords(Words words);

    /**
     * 修改words
     * 
     * @param words words
     * @return 结果
     */
    public int updateWords(Words words);

    /**
     * 删除words
     * 
     * @param id wordsID
     * @return 结果
     */
    public int deleteWordsById(Integer id);

    /**
     * 批量删除words
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWordsByIds(String[] ids);
}
