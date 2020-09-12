package test;

import com.google.common.collect.Lists;
import org.springframework.util.ObjectUtils;

/**
 * @author chengwanli
 * @date 2020/9/8 16:36
 */


public class ObjectUtilTest {

    public static void main(String[] args) {
        System.out.println(ObjectUtils.isEmpty(Lists.newArrayList()));
    }
}
