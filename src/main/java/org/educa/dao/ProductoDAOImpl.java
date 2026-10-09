package org.educa.dao;

import generated.Productos;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class ProductoDAOImpl implements ProductoDAO {
    public Productos getProductos(String fileXml) throws JAXBException {

        JAXBContext contextEntity=JAXBContext.newInstance(Productos.class);
        Unmarshaller unmarshaller=contextEntity.createUnmarshaller();

        return (Productos) unmarshaller.unmarshal(new File(fileXml));
    }

}
