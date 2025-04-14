package cse213.fooddeliveryproject.NonUser;

public class Folder {
    private String folderPath,fileName,fileFormat;

    public Folder() {
    }

    public Folder(String folderPath, String fileName, String fileFormat) {
        this.folderPath = folderPath;
        this.fileName = fileName;
        this.fileFormat = fileFormat;
    }

    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "folderPath='" + folderPath + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileFormat='" + fileFormat + '\'' +
                '}';
    }
    public boolean  saveFile(String content){
        return true;
    }
    public boolean validatePath(){
        return true;
    }
}
