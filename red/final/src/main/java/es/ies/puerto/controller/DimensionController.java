package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.ies.puerto.api.dto.DimensionDto;
import es.ies.puerto.api.mappers.DimensionMapper;
import es.ies.puerto.controller.interfaces.IDimensionController;
import es.ies.puerto.model.entity.Dimension;
import es.ies.puerto.model.repository.IDimensionRepository;

@Controller
public class DimensionController implements IDimensionController {
    private IDimensionRepository iDimensionRepository;

    @Override
    public IDimensionRepository getIDimensionRepository() {
        return this.iDimensionRepository;
    }

    @Override
    @Autowired
    public void setIDimensionRepository(IDimensionRepository dimensionRepository) {
        this.iDimensionRepository = dimensionRepository;
    }

    @Override
    public List<DimensionDto> findAll() {
        List<DimensionDto> dimensionDtos = new ArrayList<>();
        List<Dimension> dimensions = iDimensionRepository.findAll();
        for (Dimension dimension : dimensions) {
            dimensionDtos.add(DimensionMapper.INSTANCE.toDimensionDto(dimension));
        }
        return dimensionDtos;
    }

    @Override
    public DimensionDto findById(Integer id) {
        Optional<Dimension> dimensionOptional = iDimensionRepository.findById(id);
        if (!dimensionOptional.isPresent()) {
            return new DimensionDto();
        }
        return DimensionMapper.INSTANCE.toDimensionDto(dimensionOptional.get());
    }

    @Override
    public DimensionDto save(DimensionDto dimensionDto) {
        Dimension dimension = DimensionMapper.INSTANCE.toDimension(dimensionDto);
        return DimensionMapper.INSTANCE.toDimensionDto(iDimensionRepository.save(dimension));
    }

    @Override
    public void deleteById(Integer id) {
        iDimensionRepository.deleteById(id);
    }

}
