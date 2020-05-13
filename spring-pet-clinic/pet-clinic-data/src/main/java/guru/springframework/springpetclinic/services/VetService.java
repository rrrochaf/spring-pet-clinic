package guru.springframework.springpetclinic.services;

import java.util.Set;

import guru.springframework.springpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
