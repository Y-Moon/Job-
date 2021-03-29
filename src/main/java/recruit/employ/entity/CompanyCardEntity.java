package recruit.employ.entity;


/**
 * @author 王泽强
 */
public class CompanyCardEntity {
    private String pic;
    private String name;
    private String introduce;
    private int comments;
    /**
     * 发布的工作岗位
     */
    private int job;
    /**
     * 简历处理率
     */
    private String handle;

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
}
