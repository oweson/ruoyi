package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FileMapper;
import com.ruoyi.system.domain.File;
import com.ruoyi.system.service.IFileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 文件Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-12
 */
@Service
public class FileServiceImpl implements IFileService 
{
    @Autowired
    private FileMapper fileMapper;

    /**
     * 查询文件
     * 
     * @param id 文件ID
     * @return 文件
     */
    @Override
    public File selectFileById(Integer id)
    {
        return fileMapper.selectFileById(id);
    }

    /**
     * 查询文件列表
     * 
     * @param file 文件
     * @return 文件
     */
    @Override
    public List<File> selectFileList(File file)
    {
        return fileMapper.selectFileList(file);
    }

    /**
     * 新增文件
     * 
     * @param file 文件
     * @return 结果
     */
    @Override
    public int insertFile(File file)
    {
        file.setCreateTime(DateUtils.getNowDate());
        return fileMapper.insertFile(file);
    }

    /**
     * 修改文件
     * 
     * @param file 文件
     * @return 结果
     */
    @Override
    public int updateFile(File file)
    {
        file.setUpdateTime(DateUtils.getNowDate());
        return fileMapper.updateFile(file);
    }

    /**
     * 删除文件对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFileByIds(String ids)
    {
        return fileMapper.deleteFileByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除文件信息
     * 
     * @param id 文件ID
     * @return 结果
     */
    @Override
    public int deleteFileById(Integer id)
    {
        return fileMapper.deleteFileById(id);
    }
}
