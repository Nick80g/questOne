import com.example.questone.model.Data_base;
import com.example.questone.services.DataBaseManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class DataBaseManagerTest {

   @Test
    void getDatabaseManagerTest() {
        DataBaseManager dbm = DataBaseManager.getDatabaseManager(0,0);
        Data_base dataBase = new Data_base();
        assertEquals(dataBase.getQuestions().get(0), dbm.question);
    }
}