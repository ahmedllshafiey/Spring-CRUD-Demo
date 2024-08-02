package com.app.springcrud;

import com.app.springcrud.interfaces.StaffRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringCrudApplicationTests {
    @Autowired
    private StaffRepository repository;

    @Test
    public void testSaveStaff() {
        Staff staff = new Staff("Ahmed", "Frontend Developer", 20000);
        staff.setId("11");
        repository.save(staff);

        Staff savedStaff = repository.findById("11").orElse(null);
        assertNotNull(savedStaff);
    }
}