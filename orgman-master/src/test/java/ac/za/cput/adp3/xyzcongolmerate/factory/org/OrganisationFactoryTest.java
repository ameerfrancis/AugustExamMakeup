package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    @Test
    public void buildOrganisation() {

        String name = "test2";
        Organisation a = OrganisationFactory.buildOrganisation(name);
        Assert.assertEquals(name, a.getOrgName());
        Assert.assertNotNull(a.getOrgCode());

    }
}