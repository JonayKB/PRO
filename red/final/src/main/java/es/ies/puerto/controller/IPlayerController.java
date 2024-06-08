package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.ies.puerto.api.dto.ItemDto;
import es.ies.puerto.api.dto.PlayerDto;
import es.ies.puerto.api.mappers.ItemMapper;
import es.ies.puerto.api.mappers.PlayerMapper;
import es.ies.puerto.model.entity.Item;
import es.ies.puerto.model.entity.Mob;
import es.ies.puerto.model.entity.Player;
import es.ies.puerto.model.repository.IItemRepository;
import es.ies.puerto.model.repository.IMobRepository;
import es.ies.puerto.model.repository.IPlayerRepository;
@Controller
public class IPlayerController {
    private IPlayerRepository iPlayerRepository;

    public IPlayerRepository getIPlayerRepository() {
        return this.iPlayerRepository;
    }

    @Autowired
    public void setIPlayerRepository(IPlayerRepository playerRepository) {
        this.iPlayerRepository = playerRepository;
    }

    List<PlayerDto> findAll() {
        List<PlayerDto> itemDtos = new ArrayList<>();
        List<Player> players = iPlayerRepository.findAll();
        for (Player player : players) {
            itemDtos.add(PlayerMapper.INSTANCE.toPlayerDto(player));
        }
        return itemDtos;
    }

    PlayerDto findById(Integer id) {
        Optional<Player> itemOptional = iPlayerRepository.findById(id);
        if (!itemOptional.isPresent()) {
            return new PlayerDto();
        }
        return PlayerMapper.INSTANCE.toPlayerDto(itemOptional.get());
    }

    PlayerDto save(PlayerDto playerDto) {
        Player player = PlayerMapper.INSTANCE.toPlayer(playerDto);
        return PlayerMapper.INSTANCE.toPlayerDto(iPlayerRepository.save(player));
    }
    void deleteById(Integer id){
        iPlayerRepository.deleteById(id);
    }

}
