package com.bayupamuji.restapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long nim;
    private String nama;
    private String jurusan;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String jurusan) {
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public Long getNim() {
        return nim;
    }

    public void setNim(Long nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
