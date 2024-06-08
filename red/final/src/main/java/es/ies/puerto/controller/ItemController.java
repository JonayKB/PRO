package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.ies.puerto.api.dto.ItemDto;
import es.ies.puerto.api.mappers.ItemMapper;
import es.ies.puerto.model.entity.Item;
import es.ies.puerto.model.entity.Mob;
import es.ies.puerto.model.entity.Player;
import es.ies.puerto.model.repository.IItemRepository;
import es.ies.puerto.model.repository.IMobRepository;
import es.ies.puerto.model.repository.IPlayerRepository;

@Controller
public class ItemController {
    private IItemRepository iItemRepository;
    private IMobRepository iMobRepository;
    private IPlayerRepository iPlayerRepository;

    public IItemRepository getIItemRepository() {
        return this.iItemRepository;
    }

    @Autowired
    public void setIItemRepository(IItemRepository iItemRepository) {
        this.iItemRepository = iItemRepository;
    }

    public IMobRepository getIMobRepository() {
        return this.iMobRepository;
    }

    @Autowired
    public void setIMobRepository(IMobRepository iMobRepository) {
        this.iMobRepository = iMobRepository;
    }

    public IPlayerRepository getIPlayerRepository() {
        return this.iPlayerRepository;
    }

    @Autowired
    public void setIPlayerRepository(IPlayerRepository iPlayerRepository) {
        this.iPlayerRepository = iPlayerRepository;
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

    ItemDto save(ItemDto itemDto) {
        Item item = ItemMapper.INSTANCE.toItem(itemDto);
        item.setMobs(iMobRepository.findAllById(itemDto.getMobsIds()));
        item.setPlayers(iPlayerRepository.findAllById(itemDto.getPlayersIds()));
        return ItemMapper.INSTANCE.toItemDto(iItemRepository.save(item));
    }

    void deleteById(Integer id) {
        iItemRepository.deleteById(id);
    }

}
