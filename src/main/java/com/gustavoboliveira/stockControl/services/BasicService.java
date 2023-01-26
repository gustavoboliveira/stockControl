package com.gustavoboliveira.stockControl.services;

import com.gustavoboliveira.stockControl.utils.Convertible;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class BasicService<T extends Convertible<DTO>, DTO, ID> {

    @Resource
    private JpaRepository<T, ID> basicRepository;

    @Resource
    private ModelMapper modelMapper;

    @Transactional
    public DTO save(DTO modelDTO, Class<T> typeClass){

        if(Objects.isNull(modelDTO)) {
            return null;
        }

        T model = modelMapper.map(modelDTO, typeClass);
        model = basicRepository.save(model);

        return model.convert();
    }

    @Transactional(readOnly = true)
    public DTO findById(ID id){

        Optional<T> model = basicRepository.findById(id);

        if(!model.isPresent()) {
            return null;
        }

        return model.get().convert();
    }

    @Transactional(readOnly = true)
    public List<DTO> findAll(){

        List<T> model = basicRepository.findAll();

        if(model.isEmpty()) {
            return new ArrayList<>();
        }

        return modelMapper.map(model, new TypeToken<List<DTO>>() {}.getType());
    }

    @Transactional
    public boolean delete(ID id){

        Optional<T> model = basicRepository.findById(id);

        if(model.isPresent()) {
            basicRepository.deleteById(id);
            return true;
        }

        return false;
    }
}
