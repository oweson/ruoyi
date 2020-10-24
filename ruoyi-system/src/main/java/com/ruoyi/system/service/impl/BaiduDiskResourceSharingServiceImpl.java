package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaiduDiskResourceSharingMapper;
import com.ruoyi.system.domain.BaiduDiskResourceSharing;
import com.ruoyi.system.service.IBaiduDiskResourceSharingService;
import com.ruoyi.common.core.text.Convert;

/**
 * 资源分享Service业务层处理
 * 
 * @author oweson
 * @date 2020-10-24
 */
@Service
public class BaiduDiskResourceSharingServiceImpl implements IBaiduDiskResourceSharingService 
{
    @Autowired
    private BaiduDiskResourceSharingMapper baiduDiskResourceSharingMapper;

    /**
     * 查询资源分享
     * 
     * @param id 资源分享ID
     * @return 资源分享
     */
    @Override
    public BaiduDiskResourceSharing selectBaiduDiskResourceSharingById(Long id)
    {
        return baiduDiskResourceSharingMapper.selectBaiduDiskResourceSharingById(id);
    }

    /**
     * 查询资源分享列表
     * 
     * @param baiduDiskResourceSharing 资源分享
     * @return 资源分享
     */
    @Override
    public List<BaiduDiskResourceSharing> selectBaiduDiskResourceSharingList(BaiduDiskResourceSharing baiduDiskResourceSharing)
    {
        return baiduDiskResourceSharingMapper.selectBaiduDiskResourceSharingList(baiduDiskResourceSharing);
    }

    /**
     * 新增资源分享
     * 
     * @param baiduDiskResourceSharing 资源分享
     * @return 结果
     */
    @Override
    public int insertBaiduDiskResourceSharing(BaiduDiskResourceSharing baiduDiskResourceSharing)
    {
        baiduDiskResourceSharing.setCreateTime(DateUtils.getNowDate());
        return baiduDiskResourceSharingMapper.insertBaiduDiskResourceSharing(baiduDiskResourceSharing);
    }

    /**
     * 修改资源分享
     * 
     * @param baiduDiskResourceSharing 资源分享
     * @return 结果
     */
    @Override
    public int updateBaiduDiskResourceSharing(BaiduDiskResourceSharing baiduDiskResourceSharing)
    {
        baiduDiskResourceSharing.setUpdateTime(DateUtils.getNowDate());
        return baiduDiskResourceSharingMapper.updateBaiduDiskResourceSharing(baiduDiskResourceSharing);
    }

    /**
     * 删除资源分享对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBaiduDiskResourceSharingByIds(String ids)
    {
        return baiduDiskResourceSharingMapper.deleteBaiduDiskResourceSharingByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除资源分享信息
     * 
     * @param id 资源分享ID
     * @return 结果
     */
    @Override
    public int deleteBaiduDiskResourceSharingById(Long id)
    {
        return baiduDiskResourceSharingMapper.deleteBaiduDiskResourceSharingById(id);
    }
}
