package lab_3c;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TestCases {
    @Test
    public void testGetMockedDBID() {
        Database mockedDB = mock(Database.class);
        when(mockedDB.getUniqueId()).thenReturn(123);
        int uniqueID = mockedDB.getUniqueId();
        Service service = new Service(mockedDB);
        String result = service.getDatabaseID();
        assertEquals(123, uniqueID);
        assertEquals("Using database with id: 123", result);
    }
}