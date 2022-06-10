import org.junit.Assert;
import org.junit.Test;

public class TestStringWorker {
    @Test
    public void isPalindromeTest() throws Exception {
        StringWorker stringWorker = new StringWorker();
        boolean res = stringWorker.isPalindrome("ololo");
        Assert.assertEquals(true, res);
    }
    @Test
    public void getCountVowelsTest() throws Exception {
        StringWorker stringWorker = new StringWorker();
        int res = stringWorker.getCountVowels("Ololo");
        Assert.assertEquals(3, res);
    }
    @Test
    public void getCountConsonantsTest() throws Exception {
        StringWorker stringWorker = new StringWorker();
        int res = stringWorker.getCountConsonants("Ololo");
        Assert.assertEquals(2, res);
    }
    @Test
    public void getCountWordsTest() throws Exception {
        StringWorker stringWorker = new StringWorker();
        int res = stringWorker.getCountWords("When I was walking I met the ololo. I just said hello to ololo", "Ololo");
        Assert.assertEquals(2, res);
    }
}
