package es.ies.puerto.api.mappers;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

import es.ies.puerto.api.dto.ItemDto;
import es.ies.puerto.model.entity.Item;
import es.ies.puerto.model.entity.Mob;
import es.ies.puerto.model.entity.Player;
import es.ies.puerto.model.repository.IBiomeRepository;
import es.ies.puerto.model.repository.IItemRepository;

@Mapper
public interface ItemMapper extends ItemUtilities{
        ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);

    @Mapping(source = "item", target = "mobsIds", qualifiedByName = "getMobsIds")
    @Mapping(source = "item", target = "playersIds", qualifiedByName = "getPlayersIds")
    public ItemDto toItemDto(Item item);

    public Item toItem(ItemDto itemDto);

    
}
