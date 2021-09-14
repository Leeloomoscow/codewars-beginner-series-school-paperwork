import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void test1(){
        assertEquals("Failed at paperWork(5,5)",25, Paper.paperWork(5,5));
    }

    private void assertEquals(String s, int i, int paperWork) {
    }

    private static class Paper {
        public static int paperWork(int n, int m) {
            {
                int ret = 0;
                if (n < 0 || m < 0){
                    return 0;
                } else {
                    ret = n * m ;
                }

                return ret;
            }
        }
        }
    }

    // или вот такое решение return (n < 0) || (m < 0) ? 0 : n * m;

