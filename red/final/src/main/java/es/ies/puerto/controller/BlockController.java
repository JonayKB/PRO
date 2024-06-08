package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.ies.puerto.api.dto.BlockDto;
import es.ies.puerto.api.mappers.BlockMapper;
import es.ies.puerto.controller.interfaces.IBlockController;
import es.ies.puerto.model.entity.Block;
import es.ies.puerto.model.repository.IBlockRepository;
import es.ies.puerto.model.repository.IMobRepository;
import es.ies.puerto.model.repository.IPlayerRepository;

@Controller
public class BlockController implements IBlockController {
    private IBlockRepository iBlockRepository;
    private IMobRepository iMobRepository;
    private IPlayerRepository iPlayerRepository;

    @Override
    public IBlockRepository getIBlockRepository() {
        return this.iBlockRepository;
    }

    @Override
    @Autowired
    public void setIBlockRepository(IBlockRepository iItemRepository) {
        this.iBlockRepository = iItemRepository;
    }

    @Override
    public IMobRepository getIMobRepository() {
        return this.iMobRepository;
    }

    @Override
    @Autowired
    public void setIMobRepository(IMobRepository iMobRepository) {
        this.iMobRepository = iMobRepository;
    }

    @Override
    public IPlayerRepository getIPlayerRepository() {
        return this.iPlayerRepository;
    }

    @Override
    @Autowired
    public void setIPlayerRepository(IPlayerRepository iPlayerRepository) {
        this.iPlayerRepository = iPlayerRepository;
    }

    @Override
    public List<BlockDto> findAll() {
        List<BlockDto> blockDtos = new ArrayList<>();
        List<Block> items = iBlockRepository.findAll();
        for (Block block : items) {
            blockDtos.add(BlockMapper.INSTANCE.toBlockDto(block));
        }
        return blockDtos;
    }

    @Override
    public BlockDto findById(Integer id) {
        Optional<Block> blockOptional = iBlockRepository.findById(id);
        if (!blockOptional.isPresent()) {
            return new BlockDto();
        }
        return BlockMapper.INSTANCE.toBlockDto(blockOptional.get());
    }

    @Override
    public BlockDto save(BlockDto blockDto) {
        Block block = BlockMapper.INSTANCE.toBlock(blockDto);
        block.setMobs(iMobRepository.findAllById(blockDto.getMobsIds()));
        block.setPlayers(iPlayerRepository.findAllById(blockDto.getPlayersIds()));
        return BlockMapper.INSTANCE.toBlockDto(iBlockRepository.save(block));
    }

    @Override
    public void deleteById(Integer id) {
        iBlockRepository.deleteById(id);
    }

}
