package com.manikhwe.Manikhwe.School;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenericEntityController {
	
	@Autowired
    private GenericEntityRepository genericEntityRepository;
	
    private List<GenericEntity> entityList = new ArrayList<>();
    
    {
        entityList.add(new GenericEntity(1l, "entity_1"));
        entityList.add(new GenericEntity(2l, "entity_2"));
        entityList.add(new GenericEntity(3l, "entity_3"));
        entityList.add(new GenericEntity(4l, "entity_4"));
        
        
    }
    
    @RequestMapping(value = "/entity", method = RequestMethod.POST)
    public GenericEntity addEntity(GenericEntity genericEntity) { 
    	return genericEntityRepository.save(genericEntity);
    }
    
    public void saveAll() {
    	for(GenericEntity entity : entityList)
    		addEntity(entity);
    }
 
    @RequestMapping("/entity/all")
    public List<GenericEntity> findAll() {
        return genericEntityRepository.findAll();
    }
 
 
    @RequestMapping("/entity/findby/{id}")
    public Optional<GenericEntity> findById(@PathVariable Long id) {
        return genericEntityRepository.findById(id);
    }
}