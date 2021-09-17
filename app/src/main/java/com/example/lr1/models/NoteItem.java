package com.example.lr1.models;

import java.util.Date;

public class NoteItem {
    private long id;
    private java.lang.String name;
    private java.lang.String description;
    private Date dateModifed;
    private Folder nameFolder;

    public NoteItem(){

    }

    public NoteItem(java.lang.String name, java.lang.String description, Folder nameFolder) {
        this.name = name;
        this.description = description;
        this.dateModifed = new Date();
        this.nameFolder = nameFolder;
    }

    public NoteItem(java.lang.String name, java.lang.String description, Date dateModifed, Folder nameFolder) {
        this.name = name;
        this.description = description;
        this.dateModifed = dateModifed;
        this.nameFolder = nameFolder;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getDescription() {
        return description;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public Date getDateModifed() {
        return dateModifed;
    }

    public void setDateModifed(Date dateModifed) {
        this.dateModifed = dateModifed;
    }

    public Folder getNameFolder() {
        return nameFolder;
    }

    public void setNameFolder(Folder nameFolder) {
        this.nameFolder = nameFolder;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
