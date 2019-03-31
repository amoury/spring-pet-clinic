package com.springframework.springpetclinic.bootstrap;

import com.springframework.springpetclinic.model.Owner;
import com.springframework.springpetclinic.model.Vet;
import com.springframework.springpetclinic.services.OwnerService;
import com.springframework.springpetclinic.services.VetService;
import com.springframework.springpetclinic.services.map.OwnerServiceMap;
import com.springframework.springpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader() {
    this.ownerService = new OwnerServiceMap();
    this.vetService = new VetServiceMap();
  }

  @Override
  public void run(String... args) throws Exception {

    Owner owner1 = new Owner();
    owner1.setId(1L);
    owner1.setFirstName("Ansar");
    owner1.setLastName("Memon");

    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner1.setId(2L);
    owner1.setFirstName("AB");
    owner1.setLastName("CD");

    ownerService.save(owner2);

    Owner owner3 = new Owner();
    owner1.setId(3L);
    owner1.setFirstName("Chiran");
    owner1.setLastName("Bholu");

    ownerService.save(owner3);

    System.out.println("Loaded owners...");

    Vet vet1 = new Vet();
    vet1.setId(1L);
    vet1.setFirstName("Sam");
    vet1.setLastName("Happy");

    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet1.setId(2L);
    vet1.setFirstName("Samson");
    vet1.setLastName("Joy");

    vetService.save(vet2);

    Vet vet3 = new Vet();
    vet1.setId(3L);
    vet1.setFirstName("Samar");
    vet1.setLastName("Preet");

    vetService.save(vet3);

    System.out.println("Loaded vets...");

  }
}
