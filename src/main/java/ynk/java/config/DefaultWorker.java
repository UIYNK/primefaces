/*
package ynk.java.config;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ynk.java.model.Role;
import ynk.java.model.User;
import ynk.java.service.UserService;

import java.util.Collections;

@RequiredArgsConstructor
@Component
public class DefaultWorker {

    private final UserService userService;

    @Transactional
    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        userService.saveUser(new User("1@gmail.com", "1", "1", "1", true, Collections.singleton(Role.builder().role("ROLE_ADMIN").build())));
    }
}
*/
