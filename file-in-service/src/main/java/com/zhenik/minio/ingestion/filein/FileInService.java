package com.zhenik.minio.ingestion.filein;

import com.linecorp.armeria.common.HttpParameters;
import com.linecorp.armeria.common.HttpResponse;
import com.linecorp.armeria.common.HttpStatus;
import com.linecorp.armeria.server.annotation.Put;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FileInService {
    private static final Logger log = LoggerFactory.getLogger(FileInService.class);

    public FileInService() { }

    @Put("/files")
    public HttpResponse putFile(HttpParameters parameters) {
        return HttpResponse.of(HttpStatus.OK);
    }

}
