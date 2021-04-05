package recruit.service.impl;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import recruit.service.FileService;

@Service
public class EhcacheFileService implements FileService {

    @Override
    public void uploadFile(MultipartFile file) throws IOException {
        //TODO: Ehcache Implementation
    }
}
