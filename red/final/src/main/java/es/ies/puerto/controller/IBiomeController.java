package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.ies.puerto.api.dto.BiomeDto;
import es.ies.puerto.api.dto.ItemDto;
import es.ies.puerto.api.dto.PlayerDto;
import es.ies.puerto.api.mappers.BiomeMapper;
import es.ies.puerto.api.mappers.ItemMapper;
import es.ies.puerto.api.mappers.PlayerMapper;
import es.ies.puerto.model.entity.Biome;
import es.ies.puerto.model.entity.Dimension;
import es.ies.puerto.model.entity.Item;
import es.ies.puerto.model.entity.Mob;
import es.ies.puerto.model.entity.Player;
import es.ies.puerto.model.repository.IBiomeRepository;
import es.ies.puerto.model.repository.IDimensionRepository;
import es.ies.puerto.model.repository.IItemRepository;
import es.ies.puerto.model.repository.IMobRepository;
import es.ies.puerto.model.repository.IPlayerRepository;

@Controller
public class IBiomeController {
    private IBiomeRepository iBiomeRepository;
    private IDimensionRepository iDimensionRepository;

    public IBiomeRepository getIBiomeRepository() {
        return this.iBiomeRepository;
    }

    @Autowired
    public void setIBiomeRepository(IBiomeRepository biomeRepository) {
        this.iBiomeRepository = biomeRepository;
    }

    public IDimensionRepository getIDimensionRepository() {
        return this.iDimensionRepository;
    }

    @Autowired
    public void setIDimensionRepository(IDimensionRepository iDimensionRepository) {
        this.iDimensionRepository = iDimensionRepository;
    }

    List<BiomeDto> findAll() {
        List<BiomeDto> biomeDtos = new ArrayList<>();
        List<Biome> biomes = iBiomeRepository.findAll();
        for (Biome biome : biomes) {
            biomeDtos.add(BiomeMapper.INSTANCE.toBiomeDto(biome));
        }
        return biomeDtos;
    }

    BiomeDto findById(Integer id) {
        Optional<Biome> biomeOptional = iBiomeRepository.findById(id);
        if (!biomeOptional.isPresent()) {
            return new BiomeDto();
        }
        return BiomeMapper.INSTANCE.toBiomeDto(biomeOptional.get());
    }

    BiomeDto save(BiomeDto biomeDto) {
        Biome biome = BiomeMapper.INSTANCE.toBiome(biomeDto);
        Optional<Dimension> dimensionOptional = iDimensionRepository.findById(biomeDto.getDimensionId());
        if (dimensionOptional.isPresent()) {
            biome.setDimension(dimensionOptional.get());
        }
        return BiomeMapper.INSTANCE.toBiomeDto(iBiomeRepository.save(biome));
    }

    void deleteById(Integer id) {
        iBiomeRepository.deleteById(id);
    }

}
