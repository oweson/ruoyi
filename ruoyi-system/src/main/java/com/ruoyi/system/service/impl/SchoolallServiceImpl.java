package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SchoolallMapper;
import com.ruoyi.system.domain.Schoolall;
import com.ruoyi.system.service.ISchoolallService;
import com.ruoyi.common.core.text.Convert;

/**
 * 高校查询终极版Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
@Service
public class SchoolallServiceImpl implements ISchoolallService 
{
    @Autowired
    private SchoolallMapper schoolallMapper;

    /**
     * 查询高校查询终极版
     * 
     * @param id 高校查询终极版ID
     * @return 高校查询终极版
     */
    @Override
    public Schoolall selectSchoolallById(String id)
    {
        return schoolallMapper.selectSchoolallById(id);
    }

    /**
     * 查询高校查询终极版列表
     * 
     * @param schoolall 高校查询终极版
     * @return 高校查询终极版
     */
    @Override
    public List<Schoolall> selectSchoolallList(Schoolall schoolall)
    {
        return schoolallMapper.selectSchoolallList(schoolall);
    }

    /**
     * 新增高校查询终极版
     * 
     * @param schoolall 高校查询终极版
     * @return 结果
     */
    @Override
    public int insertSchoolall(Schoolall schoolall)
    {
        return schoolallMapper.insertSchoolall(schoolall);
    }

    /**
     * 修改高校查询终极版
     * 
     * @param schoolall 高校查询终极版
     * @return 结果
     */
    @Override
    public int updateSchoolall(Schoolall schoolall)
    {
        return schoolallMapper.updateSchoolall(schoolall);
    }

    /**
     * 删除高校查询终极版对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSchoolallByIds(String ids)
    {
        return schoolallMapper.deleteSchoolallByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除高校查询终极版信息
     * 
     * @param id 高校查询终极版ID
     * @return 结果
     */
    @Override
    public int deleteSchoolallById(String id)
    {
        return schoolallMapper.deleteSchoolallById(id);
    }
}
