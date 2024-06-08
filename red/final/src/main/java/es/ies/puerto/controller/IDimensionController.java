package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.ies.puerto.api.dto.BiomeDto;
import es.ies.puerto.api.dto.DimensionDto;
import es.ies.puerto.api.dto.ItemDto;
import es.ies.puerto.api.dto.PlayerDto;
import es.ies.puerto.api.mappers.BiomeMapper;
import es.ies.puerto.api.mappers.DimensionMapper;
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
public class IDimensionController {
    private IDimensionRepository iDimensionRepository;

    public IDimensionRepository getIDimensionRepository() {
        return this.iDimensionRepository;
    }

    @Autowired
    public void setIDimensionRepository(IDimensionRepository dimensionReposirtory) {
        this.iDimensionRepository = dimensionReposirtory;
    }

    List<DimensionDto> findAll() {
        List<DimensionDto> dimensionDtos = new ArrayList<>();
        List<Dimension> dimensions = iDimensionRepository.findAll();
        for (Dimension dimension : dimensions) {
            dimensionDtos.add(DimensionMapper.INSTANCE.toDimensionDto(dimension));
        }
        return dimensionDtos;
    }

    DimensionDto findById(Integer id) {
        Optional<Dimension> dimensionOptional = iDimensionRepository.findById(id);
        if (!dimensionOptional.isPresent()) {
            return new DimensionDto();
        }
        return DimensionMapper.INSTANCE.toDimensionDto(dimensionOptional.get());
    }

    DimensionDto save(DimensionDto dimensionDto) {
        Dimension dimension = DimensionMapper.INSTANCE.toDimension(dimensionDto);
        return DimensionMapper.INSTANCE.toDimensionDto(iDimensionRepository.save(dimension));
    }

    void deleteById(Integer id) {
        iDimensionRepository.deleteById(id);
    }

}
