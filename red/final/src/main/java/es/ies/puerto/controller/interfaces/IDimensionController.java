package es.ies.puerto.controller.interfaces;

import java.util.List;

import es.ies.puerto.api.dto.DimensionDto;
import es.ies.puerto.model.repository.IDimensionRepository;

public interface IDimensionController {
    public IDimensionRepository getIDimensionRepository();
    public void setIDimensionRepository(IDimensionRepository dimensionRepository);
    public List<DimensionDto> findAll();
    public DimensionDto findById(Integer id);
    public DimensionDto save(DimensionDto dimensionDto);
    public void deleteById(Integer id);
}
