package ru.egartech.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.egartech.database.entity.Company;
import ru.egartech.database.repository.CrudRepository;
import ru.egartech.database.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;


}
