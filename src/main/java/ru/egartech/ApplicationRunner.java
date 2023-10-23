package ru.egartech;

import ru.egartech.database.pool.ConnectionPool;
import ru.egartech.database.repository.CompanyRepository;
import ru.egartech.database.repository.UserRepository;
import ru.egartech.ioc.Container;
import ru.egartech.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        // ----- мы сами управляем зависимостями --------------
        // создание зависимостей и их внедрение "классическим" способом
/*        var connectionPool = new ConnectionPool();
        var userRepository = new UserRepository(connectionPool);
        var companyRepository = new CompanyRepository(connectionPool);
        var userService = new UserService(userRepository, companyRepository);*/
// ......
        // используем Container
        var container = new Container();

/*        var connectionPool = container.get(ConnectionPool.class);
        var userRepository = container.get(UserRepository.class);
        var companyRepository = container.get(CompanyRepository.class);*/

        // достаем из контейнера нужный сервис
        var userService = container.get(UserService.class);
    }
}