package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Babystudent;

/**
 * babynameService接口
 * 
 * @author ruoyi
 * @date 2020-12-18
 */
public interface IBabystudentService 
{
    /**
     * 查询babyname
     * 
     * @param id babynameID
     * @return babyname
     */
    public Babystudent selectBabystudentById(String id);

    /**
     * 查询babyname列表
     * 
     * @param babystudent babyname
     * @return babyname集合
     */
    public List<Babystudent> selectBabystudentList(Babystudent babystudent);

    /**
     * 新增babyname
     * 
     * @param babystudent babyname
     * @return 结果
     */
    public int insertBabystudent(Babystudent babystudent);

    /**
     * 修改babyname
     * 
     * @param babystudent babyname
     * @return 结果
     */
    public int updateBabystudent(Babystudent babystudent);

    /**
     * 批量删除babyname
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBabystudentByIds(String ids);

    /**
     * 删除babyname信息
     * 
     * @param id babynameID
     * @return 结果
     */
    public int deleteBabystudentById(String id);
}
