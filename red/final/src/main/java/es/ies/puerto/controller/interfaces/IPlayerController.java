package es.ies.puerto.controller.interfaces;

import java.util.List;

import es.ies.puerto.api.dto.PlayerDto;
import es.ies.puerto.model.repository.IPlayerRepository;

public interface IPlayerController {
    public IPlayerRepository getIPlayerRepository();
    public void setIPlayerRepository(IPlayerRepository playerRepository);
    public List<PlayerDto> findAll();
    public PlayerDto findById(Integer id);
    public PlayerDto save(PlayerDto playerDto);
    public void deleteById(Integer id);
}
