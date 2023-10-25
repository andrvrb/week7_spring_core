package ru.egartech.database.repository;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import ru.egartech.bpp.Auditing;
import ru.egartech.bpp.Transaction;
import ru.egartech.database.entity.Company;
import ru.egartech.database.pool.ConnectionPool;

import java.util.Optional;

@Transaction
@Auditing
public class CompanyRepository implements CrudRepository<Integer, Company> {

//   @Autowired
    @Resource
    private ConnectionPool connectionPool;

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
}
