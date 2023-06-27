package com.Rohan.AutoCopyFolderFiles.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "filetransferdb")
public class CreateDB {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "File Name")
    private String fileName;

    @Column(name = "Date-Time of File")
    private String folderDateTime;

    @Column(name = "Date-time of Transfer")
    private String TransferDateTime;

    @Column(name = "Transfer Successful")
    private int successfulTransfer;

}

