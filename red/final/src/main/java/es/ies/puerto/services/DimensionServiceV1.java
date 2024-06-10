package es.ies.puerto.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ies.puerto.api.dto.BiomeDto;
import es.ies.puerto.api.dto.DimensionDto;
import es.ies.puerto.api.dto.ItemDto;
import es.ies.puerto.api.dto.MobDto;
import es.ies.puerto.api.dto.PlayerDto;
import es.ies.puerto.controller.interfaces.IBiomeController;
import es.ies.puerto.controller.interfaces.IDimensionController;
import es.ies.puerto.controller.interfaces.IMobController;
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
@RequestMapping("dimension")
public class DimensionServiceV1 {
    IDimensionController iDimensionController;

    public IDimensionController getIDimensionController() {
        return this.iDimensionController;
    }
    @Autowired
    public void setIDimensionController(IDimensionController iMobController) {
        this.iDimensionController = iMobController;
    }

    @GetMapping("/")
    public List<DimensionDto> getAll() {
        return iDimensionController.findAll();
    }
    @GetMapping("/{id}")
    public DimensionDto getById(@PathVariable(name = "id") final int id) {
        return iDimensionController.findById(id);
    }
    @PostMapping("/")
    public DimensionDto save(@RequestBody DimensionDto entity) {
        return iDimensionController.save(entity);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(name = "id") final int id) {
        iDimensionController.deleteById(id);
    }
}
