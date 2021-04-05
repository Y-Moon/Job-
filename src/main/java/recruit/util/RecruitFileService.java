package recruit.util;

public class RecruitFileService {
    private static final String HOME = System.getProperty("user.home", "recruit");
    public static String getResumeDir(){
        return HOME + "/recruit_resume/";
    }
}
