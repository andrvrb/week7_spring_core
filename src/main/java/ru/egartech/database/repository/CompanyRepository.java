package ru.egartech.database.repository;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.egartech.bpp.Auditing;
import ru.egartech.bpp.Transaction;
import ru.egartech.database.entity.Company;
import ru.egartech.database.pool.ConnectionPool;

import java.util.Optional;

@Transaction
@Auditing
public class CompanyRepository implements CrudRepository<Integer, Company> {

//    @Resource
//    @Resource(name="pool1")
//    @Autowired
//    @Qualifier("pool1")
    private ConnectionPool pool1;

    @PostConstruct
    private void init() {
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method...");
    }

    @Autowired
    public void setPool1(ConnectionPool pool1) {
        this.pool1 = pool1;
    }
}
