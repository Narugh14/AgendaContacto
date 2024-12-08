package com.montelongo.contactos.servicio;

import com.montelongo.contactos.modelo.contacto;

import java.util.List;

public interface IContactoServicio {

    public List<contacto> listaContacto();

    public contacto buscarContactoID(Integer IdContacto);

    public void agregarContacto(contacto newContacto);

    public void eliminarContacto(contacto deleteContacto);

}
