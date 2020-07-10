package com.ruoyi.common.constant;

/**
 * 任务调度通用常量
 *
 * @author ruoyi
 */
<<<<<<< HEAD
public interface ScheduleConstants {
=======
public class ScheduleConstants
{
>>>>>>> d56d6ac5ace9b1d6b810e91e5f28b6bfa9c9f559
    public static final String TASK_CLASS_NAME = "TASK_CLASS_NAME";

    /**
     * 执行目标key
     */
    public static final String TASK_PROPERTIES = "TASK_PROPERTIES";

    /**
     * 1 默认
     */
    public static final String MISFIRE_DEFAULT = "0";

    /**
     * 2 立即触发执行
     */
    public static final String MISFIRE_IGNORE_MISFIRES = "1";

    /**
     * 3 触发一次执行
     */
    public static final String MISFIRE_FIRE_AND_PROCEED = "2";

    /**
     * 4 不触发立即执行
     */
    public static final String MISFIRE_DO_NOTHING = "3";

    public enum Status {
        /**
         * 1 正常
         */
        NORMAL("0"),
        /**
         * 2 暂停
         */
        PAUSE("1");

        private String value;

        private Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
