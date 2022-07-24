import org.junit.Assert;
import org.junit.Test;

public class BankAccountTesting {

    @Test
    public void method_to_see_if_withdrawl_reduces_the_balance(){
        AccountDetails accDetails = new AccountDetails();
        accDetails.setBalance(100);
        long expectedResult = accDetails.getBalance();
        Assert.assertEquals(120, accDetails.getBalance());
    }
}
