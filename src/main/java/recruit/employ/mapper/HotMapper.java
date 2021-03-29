package recruit.employ.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import recruit.employ.entity.HotCardEntity;

/**
 * @author w
 */
public interface HotMapper {
    /**
     * 查询所有的热门招聘信息
     * @return 热门招聘信息entity数组
     */
    @Select("select * from recruitmessage")
    @Results({
            @Result(property = "jobName" , column = "recruitJob"),
            @Result(property = "experience" , column = "experience"),
            @Result(property = "education" , column = "education"),
            @Result(property = "jobKey" , column = "jobKey"),
            @Result(property = "companyId" , column = "companyId"),
            @Result(property = "salary" , column = "salary"),
            @Result(property = "benefits" , column = "benefits"),
    })
    HotCardEntity[] queryAllHotCard();
}
