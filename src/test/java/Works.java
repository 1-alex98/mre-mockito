import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith({MockitoExtension.class})
public class Works {
    @Mock ToBeMocked toBeMocked;
    @InjectMocks ToBeInitialized toBeInitialized;

    @Test
    public void foo(){
        assert toBeInitialized.toBeMocked == null;
    }
}