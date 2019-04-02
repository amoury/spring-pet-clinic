package com.springframework.springpetclinic.bootstrap;

import com.springframework.springpetclinic.model.Owner;
import com.springframework.springpetclinic.model.Vet;
import com.springframework.springpetclinic.services.OwnerService;
import com.springframework.springpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
  private final OwnerService ownerService;
  private final VetService vetService;

  @Autowired
  public DataLoader(OwnerService ownerService, VetService vetService) {

    this.ownerService = ownerService;
    this.vetService = vetService;
  }

  @Override
  public void run(String... args) throws Exception {

    Owner owner1 = new Owner();
    owner1.setId(1L);
    owner1.setFirstName("Ansar");
    owner1.setLastName("Memon");

    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setId(2L);
    owner2.setFirstName("AB");
    owner2.setLastName("CD");

    ownerService.save(owner2);

    Owner owner3 = new Owner();
    owner3.setId(3L);
    owner3.setFirstName("Chiran");
    owner3.setLastName("Bholu");

    ownerService.save(owner3);

    System.out.println("Loaded owner...");

    Vet vet1 = new Vet();
    vet1.setId(1L);
    vet1.setFirstName("Sam");
    vet1.setLastName("Happy");

    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setId(2L);
    vet2.setFirstName("Samson");
    vet2.setLastName("Joy");

    vetService.save(vet2);

    Vet vet3 = new Vet();
    vet3.setId(3L);
    vet3.setFirstName("Samar");
    vet3.setLastName("Preet");

    vetService.save(vet3);

    System.out.println("Loaded vets...");

  }
}
