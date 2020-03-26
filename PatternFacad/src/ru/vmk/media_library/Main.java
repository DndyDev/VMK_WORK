package ru.vmk.media_library;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	VideoConverterFacade converter = new VideoConverterFacade();
	File mp4Video = converter.convertVideo("youtubevideo.ogg","mp4");

    }
}
