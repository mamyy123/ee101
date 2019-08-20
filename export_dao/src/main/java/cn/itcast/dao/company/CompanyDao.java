package cn.itcast.dao.company;



import cn.itcast.domain.Company;

import java.util.List;

/**
 * @创建人 MYY
 * @创建时间 2019/8/20 10:34
 * @描述
 */
public interface CompanyDao {
    List<Company>findAll();

}
