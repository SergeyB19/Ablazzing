package com.example.input_output;

import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWrapper implements Closeable {
    private FileReader fileReader;

    public FileReaderWrapper(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public FileReaderWrapper(String s) {
    }

    @Override
    public void close() throws IOException {
        System.out.println("Закрываем fileReader");
        fileReader.close();
    }
}
