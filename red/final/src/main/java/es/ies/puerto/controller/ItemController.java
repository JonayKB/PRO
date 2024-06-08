package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import es.ies.puerto.api.dto.ItemDto;
import es.ies.puerto.api.mappers.ItemMapper;
import es.ies.puerto.model.entity.Item;
import es.ies.puerto.model.entity.Mob;
import es.ies.puerto.model.entity.Player;
import es.ies.puerto.model.repository.IItemRepository;

public class ItemController {
    private IItemRepository iItemRepository;

    public IItemRepository getIItemRepository() {
        return this.iItemRepository;
    }

    @Autowired
    public void setIItemRepository(IItemRepository iItemRepository) {
        this.iItemRepository = iItemRepository;
    }

    List<ItemDto> findAll() {
        List<ItemDto> itemDtos = new ArrayList<>();
        List<Item> items = iItemRepository.findAll();
        for (Item item : items) {
            itemDtos.add(ItemMapper.INSTANCE.toItemDto(item));
        }
        return itemDtos;
    }

    ItemDto findById(Integer id) {
        Optional<Item> itemOptional = iItemRepository.findById(id);
        if (!itemOptional.isPresent()) {
            return new ItemDto();
        }
        return ItemMapper.INSTANCE.toItemDto(itemOptional.get());
    }

}
