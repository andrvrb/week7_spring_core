package ru.egartech.database.repository;


import ru.egartech.bpp.InjectBean;
import ru.egartech.database.pool.ConnectionPool;

public class CompanyRepository {

    @InjectBean
    private ConnectionPool connectionPool;
}
