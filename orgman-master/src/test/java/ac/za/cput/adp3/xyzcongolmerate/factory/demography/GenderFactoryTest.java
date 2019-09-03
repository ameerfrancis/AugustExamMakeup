package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {

    @Test
    public void buildGender() {

        String descrip = "female";
        Gender a = GenderFactory.buildGender(descrip);
        Assert.assertEquals(descrip, a.getGenderDescription());
        Assert.assertNotNull(a.getGenderId());

    }
}

