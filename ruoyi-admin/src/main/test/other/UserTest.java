package other;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.bean.BeanHelper;

/**
 * @author oweson
 * @date 2021/4/5 11:45
 */


public class UserTest {
    public static void main(String[] args) {
        SysUser sysUser = new SysUser();
        BeanHelper.onInsert(sysUser);
        System.out.println(sysUser);
    }
}
