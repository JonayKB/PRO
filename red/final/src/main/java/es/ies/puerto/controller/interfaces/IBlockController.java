package es.ies.puerto.controller.interfaces;

import java.util.List;

import es.ies.puerto.api.dto.BlockDto;
import es.ies.puerto.model.repository.IBlockRepository;
import es.ies.puerto.model.repository.IMobRepository;
import es.ies.puerto.model.repository.IPlayerRepository;

public interface IBlockController {
    public IBlockRepository getIBlockRepository();

    public void setIBlockRepository(IBlockRepository iItemRepository);

    public IMobRepository getIMobRepository();

    public void setIMobRepository(IMobRepository iMobRepository);

    public IPlayerRepository getIPlayerRepository();

    public void setIPlayerRepository(IPlayerRepository iPlayerRepository);

    public List<BlockDto> findAll();

    public BlockDto findById(Integer id);

    public BlockDto save(BlockDto blockDto);

    public void deleteById(Integer id);
}
