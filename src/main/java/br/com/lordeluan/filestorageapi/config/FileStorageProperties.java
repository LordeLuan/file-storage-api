package br.com.lordeluan.filestorageapi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

// Arquivo de configuração do diretorio de upload do arquivo
@Configuration
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
  private String uploadDir;

  public String getUploadDir() {
    return uploadDir;
  }

  public void setUploadDir(String uploadDir) {
    this.uploadDir = uploadDir;
  }
}
