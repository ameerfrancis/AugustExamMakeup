package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void buildUser() {

        String email = "test1";
        String name = "test2";
        String lName = "test3";
        User a = UserFactory.buildUser(email, name, lName);
        Assert.assertEquals(email, a.getUserEmail());
        Assert.assertEquals(name, a.getFirstName());
        Assert.assertEquals(lName, a.getLastName());

    }
}