package recruit.service.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.apachecommons.CommonsLog;
import recruit.service.FileService;
import recruit.util.RecruitFileService;

@Service
@CommonsLog
public class LocalFileService implements FileService {

    @Override
    public void uploadFile(MultipartFile file) throws IOException {
        String resumeDir = RecruitFileService.getResumeDir();
        if(!Files.exists(Paths.get(resumeDir))){
            Files.createDirectory(Paths.get(resumeDir));
        }
        String finalResumeStr = resumeDir + file.getOriginalFilename();
        File finalResumeFile = new File(finalResumeStr);
        file.transferTo(finalResumeFile);
    }

}
