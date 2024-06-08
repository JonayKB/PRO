package es.ies.puerto.api.mappers;

import org.mapstruct.Mapper;

import es.ies.puerto.api.dto.DimensionDto;
import es.ies.puerto.api.dto.ItemDto;
import es.ies.puerto.model.entity.Dimension;
import es.ies.puerto.model.entity.Item;
@Mapper(uses = {BiomeMapper.class})
public interface DimensionMapper {
    public DimensionDto toDimensionDto(Dimension dimension);

    public Dimension toDimension(DimensionDto  dimensionDto);
}
