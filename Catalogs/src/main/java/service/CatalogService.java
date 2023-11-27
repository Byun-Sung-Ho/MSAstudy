package service;

import com.example.catalogs.jpa.CatalogEntity;
import org.springframework.stereotype.Service;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
