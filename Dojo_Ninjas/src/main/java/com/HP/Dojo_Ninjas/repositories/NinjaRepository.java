package com.HP.Dojo_Ninjas.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.HP.Dojo_Ninjas.models.Ninja;

public interface NinjaRepository extends PagingAndSortingRepository<Ninja, Long>{

//    @Query(value="SELECT * FROM dojo_ninjas.ninjas join dojos ON dojos.id = ninjas.dojo_id", nativeQuery=true)
//    Page<Object[]> joinDojosAndNinjas2(PageRequest pageRequest);
//	
//	
}
