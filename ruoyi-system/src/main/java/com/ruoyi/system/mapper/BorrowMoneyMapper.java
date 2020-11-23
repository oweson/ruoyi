package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BorrowMoney;

/**
 * borrow_moneyMapper接口
 * 
 * @author ruoyi
 * @date 2020-11-23
 */
public interface BorrowMoneyMapper 
{
    /**
     * 查询borrow_money
     * 
     * @param id borrow_moneyID
     * @return borrow_money
     */
    public BorrowMoney selectBorrowMoneyById(Long id);

    /**
     * 查询borrow_money列表
     * 
     * @param borrowMoney borrow_money
     * @return borrow_money集合
     */
    public List<BorrowMoney> selectBorrowMoneyList(BorrowMoney borrowMoney);

    /**
     * 新增borrow_money
     * 
     * @param borrowMoney borrow_money
     * @return 结果
     */
    public int insertBorrowMoney(BorrowMoney borrowMoney);

    /**
     * 修改borrow_money
     * 
     * @param borrowMoney borrow_money
     * @return 结果
     */
    public int updateBorrowMoney(BorrowMoney borrowMoney);

    /**
     * 删除borrow_money
     * 
     * @param id borrow_moneyID
     * @return 结果
     */
    public int deleteBorrowMoneyById(Long id);

    /**
     * 批量删除borrow_money
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBorrowMoneyByIds(String[] ids);
}
