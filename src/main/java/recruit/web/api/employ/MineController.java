package recruit.web.api.employ;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.apachecommons.CommonsLog;
import recruit.service.FileService;

@RestController
@RequestMapping("/mine")
@CommonsLog
public class MineController {
    @Autowired
    @Qualifier("localFileService")
    private FileService localFileService;

    @PostMapping("/uploadResume")
    public String uploadResume(@RequestPart MultipartFile resume) {
        log.info(resume.getOriginalFilename());
        try {
            localFileService.uploadFile(resume);
        } catch (IOException e) {
            log.error(e.getMessage());
            return "upload failure" + e.getMessage();
        }
        return "upload success";
    }
}
