package es.ies.puerto.api.mappers;

import org.mapstruct.Mapper;

import es.ies.puerto.api.dto.ItemDto;
import es.ies.puerto.api.dto.PlayerDto;
import es.ies.puerto.model.entity.Item;
import es.ies.puerto.model.entity.Player;
@Mapper(uses = {ItemMapper.class})
public interface PlayerMapper {
    public PlayerDto toPlayerDto(Player player);

    public Player toPlayer(PlayerDto playerDto);
}
