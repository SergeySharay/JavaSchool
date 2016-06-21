package javaschool.testing;

import javaschool.crud.Bucket;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class test {
    private static Logger logger = Logger.getLogger(test.class);
    @Mock
    private Bucket mockBucket;

    @Spy
    private Bucket spyBucket;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void mockCreation() {
        Bucket bucket = Mockito.mock(Bucket.class);
    }

    @Test
    public void spyCreation() {
        Bucket bucket = Mockito.spy(new Bucket());
    }

}

