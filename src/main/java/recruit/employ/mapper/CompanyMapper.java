package recruit.employ.mapper;


import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import recruit.employ.entity.CompanyCardEntity;

/**
 * @author w
 */
public interface CompanyMapper {
    /**
     * 查询所有的公司卡片信息
     * @return 公司卡片对象
     */
    @Select("select * from companycard")
    @Results({
            @Result(property = "pic" , column = "pic"),
            @Result(property = "name" , column = "name"),
            @Result(property = "introduce" , column = "introduce"),
            @Result(property = "comments" , column = "comments"),
            @Result(property = "job" , column = "job"),
            @Result(property = "handle" , column = "handle")
    })
     CompanyCardEntity[] queryAllCompanyCard();
}

