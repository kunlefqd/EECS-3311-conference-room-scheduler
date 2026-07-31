package testAI_Assistant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.conferenceroomscheduler.model.Account;
import com.conferenceroomscheduler.model.AdminAccount;
import com.conferenceroomscheduler.model.FacultyAccount;
import com.conferenceroomscheduler.model.PartnerAccount;
import com.conferenceroomscheduler.model.StaffAccount;
import com.conferenceroomscheduler.model.StudentAccount;
import com.conferenceroomscheduler.patterns.AccountFactory;
import com.conferenceroomscheduler.patterns.AdminFactory;
import com.conferenceroomscheduler.patterns.FacultyFactory;
import com.conferenceroomscheduler.patterns.PartnerFactory;
import com.conferenceroomscheduler.patterns.StaffFactory;
import com.conferenceroomscheduler.patterns.StudentFactory;

public class AccountFactoryAITest {

    private AccountFactory studentFactory;
    private AccountFactory staffFactory;
    private AccountFactory facultyFactory;
    private AccountFactory partnerFactory;

    @Before
    public void setUp() {
        studentFactory = new StudentFactory();
        staffFactory = new StaffFactory();
        facultyFactory = new FacultyFactory();
        partnerFactory = new PartnerFactory();
    }

    @Test
    public void testCreateAccountViaStudentFactoryNotNull() {
        Account account = studentFactory.createAccount("1", "a@yorku.ca", "p", "student", true, true, "100");
        assertNotNull(account);
    }

    @Test
    public void testCreateAccountViaStudentFactoryReturnsStudent() {
        Account account = studentFactory.createAccount("1", "a@yorku.ca", "p", "x", true, true, "100");
        assertTrue(account instanceof StudentAccount);
    }

    @Test
    public void testCreateAccountViaStaffFactoryReturnsStaff() {
        Account account = staffFactory.createAccount("2", "b@yorku.ca", "p", "x", true, true, "200");
        assertTrue(account instanceof StaffAccount);
    }

    @Test
    public void testCreateAccountViaFacultyFactoryReturnsFaculty() {
        Account account = facultyFactory.createAccount("3", "c@yorku.ca", "p", "x", true, true, "300");
        assertTrue(account instanceof FacultyAccount);
    }

    @Test
    public void testCreateAccountViaPartnerFactoryReturnsPartner() {
        Account account = partnerFactory.createAccount("4", "d@partner.com", "p", "x", false, true, "400");
        assertTrue(account instanceof PartnerAccount);
    }

    @Test
    public void testPolymorphicAccountId() {
        Account account = staffFactory.createAccount("42", "s@yorku.ca", "p", "staff", true, true, "100");
        assertEquals("42", account.getAccountId());
    }

    @Test
    public void testPolymorphicEmail() {
        Account account = facultyFactory.createAccount("1", "poly@yorku.ca", "p", "faculty", true, true, "100");
        assertEquals("poly@yorku.ca", account.getEmail());
    }

    @Test
    public void testDifferentFactoriesProduceDifferentAccountTypes() {
        Account student = studentFactory.createAccount("1", "a", "p", "x", true, true, "100");
        Account staff = staffFactory.createAccount("1", "a", "p", "x", true, true, "100");
        assertEquals("student", student.getAccountType());
        assertEquals("staff", staff.getAccountType());
    }

    @Test
    public void testConcreteFactoriesExtendAccountFactory() {
        assertTrue(new StudentFactory() instanceof AccountFactory);
        assertTrue(new StaffFactory() instanceof AccountFactory);
        assertTrue(new FacultyFactory() instanceof AccountFactory);
        assertTrue(new PartnerFactory() instanceof AccountFactory);
        assertTrue(new AdminFactory() instanceof AccountFactory);
    }

    @Test
    public void testAdminFactoryViaAccountFactory() {
        AccountFactory factory = new AdminFactory();
        Account account = factory.createAccount("9", "admin@yorku.ca", "p", "admin", true, true, "900");
        assertTrue(account instanceof AdminAccount);
    }

    @Test
    public void testCreateUserAlias() {
        Account account = studentFactory.createUser("1", "a@yorku.ca", "p", "student", true, true, "100");
        assertNotNull(account);
    }

    @Test
    public void testAccountTypeParameterIsHonoured() {
        Account account = studentFactory.createAccount("1", "a@yorku.ca", "p", "faculty", true, true, "100");
        assertEquals("faculty", account.getAccountType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullEmailRejectedByCreateAccount() {
        studentFactory.createAccount("1", null, "p", "student", true, true, "100");
    }
}
