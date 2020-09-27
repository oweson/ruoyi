package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WordsMapper;
import com.ruoyi.system.domain.Words;
import com.ruoyi.system.service.IWordsService;
import com.ruoyi.common.core.text.Convert;

/**
 * wordsService业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-27
 */
@Service
public class WordsServiceImpl implements IWordsService 
{
    @Autowired
    private WordsMapper wordsMapper;

    /**
     * 查询words
     * 
     * @param id wordsID
     * @return words
     */
    @Override
    public Words selectWordsById(Integer id)
    {
        return wordsMapper.selectWordsById(id);
    }

    /**
     * 查询words列表
     * 
     * @param words words
     * @return words
     */
    @Override
    public List<Words> selectWordsList(Words words)
    {
        return wordsMapper.selectWordsList(words);
    }

    /**
     * 新增words
     * 
     * @param words words
     * @return 结果
     */
    @Override
    public int insertWords(Words words)
    {
        return wordsMapper.insertWords(words);
    }

    /**
     * 修改words
     * 
     * @param words words
     * @return 结果
     */
    @Override
    public int updateWords(Words words)
    {
        return wordsMapper.updateWords(words);
    }

    /**
     * 删除words对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWordsByIds(String ids)
    {
        return wordsMapper.deleteWordsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除words信息
     * 
     * @param id wordsID
     * @return 结果
     */
    @Override
    public int deleteWordsById(Integer id)
    {
        return wordsMapper.deleteWordsById(id);
    }
}
