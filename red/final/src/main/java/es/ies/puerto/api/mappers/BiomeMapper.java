package es.ies.puerto.api.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import es.ies.puerto.api.dto.BiomeDto;
import es.ies.puerto.api.dto.DimensionDto;
import es.ies.puerto.model.entity.Biome;
import es.ies.puerto.model.entity.Dimension;
@Mapper(uses = {MobMapper.class})
public interface BiomeMapper {
    @Mapping(source = "dimension.id",target = "dimensionId")
    public BiomeDto toBiomeDto(Biome biome);

    public Biome toBiome(BiomeDto  biomeDto);


}
