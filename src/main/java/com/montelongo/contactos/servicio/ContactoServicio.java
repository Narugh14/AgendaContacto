package com.montelongo.contactos.servicio;

import com.montelongo.contactos.modelo.contacto;
import com.montelongo.contactos.repositorio.ContactoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoServicio implements IContactoServicio{

    @Autowired
     private ContactoRepositorio contactoRepo;

    @Override
    public List<contacto> listaContacto() {
        return contactoRepo.findAll();
    }

    @Override
    public contacto buscarContactoID(Integer IdContacto) {
        return contactoRepo.findById(IdContacto).orElse(null);
    }

    @Override
    public void agregarContacto(contacto newContacto) {
        contactoRepo.save(newContacto);
    }

    @Override
    public void eliminarContacto(contacto deleteContacto) {
        contactoRepo.delete(deleteContacto);
    }
}
