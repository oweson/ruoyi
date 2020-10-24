package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaiduDiskResourceSharing;

/**
 * 资源分享Service接口
 * 
 * @author oweson
 * @date 2020-10-24
 */
public interface IBaiduDiskResourceSharingService 
{
    /**
     * 查询资源分享
     * 
     * @param id 资源分享ID
     * @return 资源分享
     */
    public BaiduDiskResourceSharing selectBaiduDiskResourceSharingById(Long id);

    /**
     * 查询资源分享列表
     * 
     * @param baiduDiskResourceSharing 资源分享
     * @return 资源分享集合
     */
    public List<BaiduDiskResourceSharing> selectBaiduDiskResourceSharingList(BaiduDiskResourceSharing baiduDiskResourceSharing);

    /**
     * 新增资源分享
     * 
     * @param baiduDiskResourceSharing 资源分享
     * @return 结果
     */
    public int insertBaiduDiskResourceSharing(BaiduDiskResourceSharing baiduDiskResourceSharing);

    /**
     * 修改资源分享
     * 
     * @param baiduDiskResourceSharing 资源分享
     * @return 结果
     */
    public int updateBaiduDiskResourceSharing(BaiduDiskResourceSharing baiduDiskResourceSharing);

    /**
     * 批量删除资源分享
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBaiduDiskResourceSharingByIds(String ids);

    /**
     * 删除资源分享信息
     * 
     * @param id 资源分享ID
     * @return 结果
     */
    public int deleteBaiduDiskResourceSharingById(Long id);
}
