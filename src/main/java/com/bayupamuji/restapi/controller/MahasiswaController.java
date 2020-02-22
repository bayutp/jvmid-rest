package com.bayupamuji.restapi.controller;

import com.bayupamuji.restapi.domain.Mahasiswa;
import com.bayupamuji.restapi.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/mhs")
public class MahasiswaController {
    @Autowired
    private MahasiswaRepository mhsRepository;

    @GetMapping("/getAllMhs")
    private Iterable<Mahasiswa> getMhs() {
        return mhsRepository.findAll();
    }

    @GetMapping("/getMhs/{nim}")
    private Optional<Mahasiswa> getMhsByNim(@PathVariable("nim") String nim) {
        return mhsRepository.findById(Long.parseLong(nim));
    }

    @PutMapping("/updateMhs/{nim}")
    private Optional<Mahasiswa> updateMhs(@PathVariable("nim") String nim,
                                          @RequestBody Mahasiswa mhs) {
        Optional<Mahasiswa> mhs1 = mhsRepository.findById(Long.parseLong(nim));
        mhs1.ifPresent(res -> {
            res.setNama(mhs.getNama());
            res.setJurusan(mhs.getJurusan());
            mhsRepository.save(res);
        });
        return mhs1;
    }

    @PostMapping("/addMhs")
    private Mahasiswa addMahasiswa(@RequestBody Mahasiswa mhs) {
        return mhsRepository.save(mhs);
    }

    @DeleteMapping("/deleteMhs/{nim}")
    private void deleteMhs(@PathVariable("nim") Long nim) {
        mhsRepository.deleteById(nim);
    }
}
