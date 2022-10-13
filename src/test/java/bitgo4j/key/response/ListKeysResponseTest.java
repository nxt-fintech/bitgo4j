package bitgo4j.key.response;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListKeysResponseTest {
  @Mock List<KeyResponse> keys;

  @InjectMocks ListKeysResponse listKeysResponse;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testToString() {
    String result = listKeysResponse.toString();
    Assertions.assertEquals("ListKeysResponse[keys=keys]", result);
  }

  @Test
  void testSetKeys() {
    listKeysResponse.setKeys(List.of(new KeyResponse()));
  }
}
