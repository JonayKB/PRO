package es.ies.puerto.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ies.puerto.api.dto.ItemDto;
import es.ies.puerto.api.dto.PlayerDto;
import es.ies.puerto.controller.interfaces.IPlayerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("player")
public class PlayerServiceV1 {
    IPlayerController iPlayerController;

    public IPlayerController getIPlayerController() {
        return this.iPlayerController;
    }

    @Autowired
    public void setIPlayerController(IPlayerController iPlayerController) {
        this.iPlayerController = iPlayerController;
    }

    @GetMapping("/")
    public List<PlayerDto> getAll() {
        return iPlayerController.findAll();
    }

    @GetMapping("/{id}")
    public PlayerDto getById(@PathVariable(name = "id") final int id) {
        return iPlayerController.findById(id);
    }

    @PostMapping("/")
    public PlayerDto save(@RequestBody PlayerDto entity) {
        return iPlayerController.save(entity);
    }
    @PostMapping("/{idPlayer}/{idItem}")
    public PlayerDto obtainItem(@PathVariable(name = "idPlayer") final int idPlayer, @PathVariable(name = "idItem") final int idItem) {
        return iPlayerController.obtainItem(idPlayer,idItem);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(name = "id") final int id) {
        iPlayerController.deleteById(id);
    }
}
