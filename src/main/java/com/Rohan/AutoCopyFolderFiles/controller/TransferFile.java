package com.Rohan.AutoCopyFolderFiles.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferFile {

    @GetMapping("/filetransferdb")
    public String index(){
        return "Hello";
    }
}
