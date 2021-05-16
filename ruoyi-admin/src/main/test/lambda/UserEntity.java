package lambda;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author oweson
 * @date 2021/5/14 22:41
 */


public class UserEntity {
    private Integer id;
    private String name;
    private Integer type;

    public static void main(String[] args) {
        ArrayList<UserEntity> userEntities = Lists.newArrayList();
        for (int i = 0; i < 15; i++) {
            UserEntity userEntity = new UserEntity();
            userEntity.setId(i);
            userEntity.setName(""+i);
            if(i%3==1){
                userEntity.setType(0);
            }
            if(i%3==2){
                userEntity.setType(1);

            }
            if(i%3==0){
                userEntity.setType(2);

            }
            userEntities.add(userEntity);




        }
        List<UserEntity> collectFilter = userEntities.stream().filter(itm -> itm.getId() > 10).collect(Collectors.toList());
        List<String> collectMap = userEntities.stream().map(UserEntity::getName).collect(Collectors.toList());
        Map<Integer, List<UserEntity>> integerListMap = userEntities.stream().collect(Collectors.groupingBy(UserEntity::getType));
        List<List<UserEntity>> partition = Lists.partition(userEntities, 3);
        System.out.println(partition);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
