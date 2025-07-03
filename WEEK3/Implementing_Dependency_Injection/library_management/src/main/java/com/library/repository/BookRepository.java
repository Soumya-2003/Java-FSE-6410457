package com.library.repository;

public class BookRepository {
    private String repositoryName;

    public String getRepositoryName() {
        return this.repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public void info(){
        System.out.println("Repository Name: " + repositoryName);
    }
}
