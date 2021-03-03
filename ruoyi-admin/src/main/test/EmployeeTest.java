import com.google.common.collect.Lists;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.UUID;
import com.ruoyi.system.domain.Employee;
import com.ruoyi.system.mapper.Card02Mapper;
import com.ruoyi.system.mapper.EmployeeMapper;
import com.ruoyi.web.controller.pulbic.kayang.EmployeeData;
import com.ruoyi.web.controller.pulbic.kayang.KayangApi;
import com.ruoyi.web.controller.pulbic.kayang.KayangException;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author oweson
 * @date 2020/12/26 23:38
 */


public class EmployeeTest extends SpringbootApplicationTest {

    @Autowired
    Card02Mapper card02Mapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    public void list() {
        System.out.println(card02Mapper.selectCard02List(null));
    }

    @Test
    public void syncEmployee() throws KayangException, ParseException {
        List<Employee> employeeExistList = employeeMapper.selectEmployeeListSync(null);
        Map<String, String> stringStringMap = employeeExistList.stream().collect(Collectors.toMap(Employee::getSerial, Employee::getIdnumber));
        ArrayList<Employee> employees = Lists.newArrayList();
        KayangApi kayangApi = KayangApi.getInstance();
        List<EmployeeData> allEmployee = kayangApi.findAllEmployee();
        for (EmployeeData employeeData : allEmployee) {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeData, employee);
            employee.setStartdate(DateUtils.replaceTInStringTimeTransferDate(employeeData.getStartdate()));
            if (employeeData.getBeemployeedate() != null) {
                employee.setBeemployeedate(DateUtils.replaceTInStringTimeTransferDate(employeeData.getBeemployeedate()));

            }
            employee.setName(employeeData.getName());
            if (employee.getIdnumber() == null) {
                employee.setIdnumber(UUID.randomUUID().toString().replace("-", ""));
            }
            if (stringStringMap.get(employee.getSerial()) == null) {
                employees.add(employee);
            }
        }
        for (Employee employee : employees) {
            employeeMapper.insertEmployee(employee);
        }


    }

}
