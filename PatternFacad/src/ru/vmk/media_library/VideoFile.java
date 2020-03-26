package ru.vmk.media_library;

public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name, String codecType) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1 );
    }

    public String getName() {
        return name;
    }

    public String getCodecType() {
        return codecType;
    }
}
