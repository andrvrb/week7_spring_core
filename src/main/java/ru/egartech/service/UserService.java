package ru.egartech.service;


import org.springframework.stereotype.Service;
import ru.egartech.database.entity.Company;
import ru.egartech.database.repository.CrudRepository;
import ru.egartech.database.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

    public UserService(UserRepository userRepository,
                       CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
