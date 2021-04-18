package dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruoyi.RuoYiApplication;
import com.ruoyi.system.domain.ManageFinance;
import com.ruoyi.system.mapper.ManageFinanceMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author oweson
 * @date 2021/3/5 21:06
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RuoYiApplication.class)
public class ManageFianceMapperTest  {
    private static final Logger LOGGER = LoggerFactory.getLogger(ManageFianceMapperTest.class);
    @Autowired
    ManageFinanceMapper manageFinanceMapper;
    @Test
    public void demo(){
        LOGGER.info("测试aaa");
        PageHelper.startPage(1,10);
        List<ManageFinance> manageFinances = manageFinanceMapper.selectManageFinanceList(new ManageFinance());
        PageInfo<ManageFinance> manageFinancePageInfo = new PageInfo<>(manageFinances);
        System.out.println(manageFinancePageInfo);
    }
}
