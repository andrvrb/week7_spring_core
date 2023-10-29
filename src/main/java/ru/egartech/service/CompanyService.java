package ru.egartech.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import ru.egartech.database.entity.Company;
import ru.egartech.database.repository.CrudRepository;
import ru.egartech.dto.CompanyReadDto;
import ru.egartech.entity.AccessType;
import ru.egartech.entity.EntityEvent;

import java.util.Optional;

@Service
public class CompanyService {

    private final CrudRepository<Integer, Company> companyRepository;
    private final UserService userService;
    private final ApplicationEventPublisher eventPublisher;

    public CompanyService(CrudRepository<Integer, Company> companyRepository,
                          UserService userService,
                          ApplicationEventPublisher eventPublisher) {
        this.companyRepository = companyRepository;
        this.userService = userService;
        this.eventPublisher = eventPublisher;
    }

    public Optional<CompanyReadDto> findById(Integer id) {
        return companyRepository.findById(id)
                .map(entity -> {
                    eventPublisher.publishEvent(new EntityEvent(entity, AccessType.READ));
                    return new CompanyReadDto(entity.id());
                });
    }
}
