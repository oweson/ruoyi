package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TXiehouyu;

/**
 * 歇后语Mapper接口
 * 
 * @author ruoyi
 * @date 2021-05-16
 */
public interface TXiehouyuMapper 
{
    /**
     * 查询歇后语
     * 
     * @param id 歇后语ID
     * @return 歇后语
     */
    public TXiehouyu selectTXiehouyuById(Long id);

    /**
     * 查询歇后语列表
     * 
     * @param tXiehouyu 歇后语
     * @return 歇后语集合
     */
    public List<TXiehouyu> selectTXiehouyuList(TXiehouyu tXiehouyu);

    /**
     * 新增歇后语
     * 
     * @param tXiehouyu 歇后语
     * @return 结果
     */
    public int insertTXiehouyu(TXiehouyu tXiehouyu);

    /**
     * 修改歇后语
     * 
     * @param tXiehouyu 歇后语
     * @return 结果
     */
    public int updateTXiehouyu(TXiehouyu tXiehouyu);

    /**
     * 删除歇后语
     * 
     * @param id 歇后语ID
     * @return 结果
     */
    public int deleteTXiehouyuById(Long id);

    /**
     * 批量删除歇后语
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTXiehouyuByIds(String[] ids);
}
