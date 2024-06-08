package es.ies.puerto.api.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.api.dto.BiomeDto;
import es.ies.puerto.api.dto.BlockDto;
import es.ies.puerto.model.entity.Biome;
import es.ies.puerto.model.entity.Block;

@Mapper
public interface BlockMapper extends ItemUtilities {
    BlockMapper INSTANCE = Mappers.getMapper(BlockMapper.class);

    @Mapping(source = "block", target = "mobsIds", qualifiedByName = "getMobsIds")
    @Mapping(source = "block", target = "playersIds", qualifiedByName = "getPlayersIds")
    public BlockDto toBlockDto(Block block);

    public Block toBlock(BlockDto blockDto);
}
